package day25thread;

import java.awt.TexturePaint;

/** 多个线程通信的问题
	* notify()方法是随机唤醒一个线程
	* notifyAll()方法是唤醒所有线程
	* JDK5之前无法唤醒指定的一个线程
	* 如果多个线程之间通信, 需要使用notifyAll()通知所有线程, 用while来反复判断条件
*/
//三个以上的线程，1.5版本的实现，不方便唤醒线程有关闭了
/*1.同步代码块用了那个对象对象，就调用那个对象的wait()
 * 2.为什么wait 和notify()方法要定义在Object里面
 	*object是所有对象的超类，所对象可以任意对象
 *3.sleep和wait的区别
 	*1.sleep是必须传入参数到了时间就醒过来，
 	*wait()传入参数在时间到了会等待，不传参数就会一直等待，要用notify方法唤醒。
 	*
 	*2.sleep 是占用资 cpu，源和所对象的，(即不释放锁资源)
 	*wait会退出cpu和锁对象对象，（即释放锁资源）
 	* */	
public class Demo05Notify {
	public static void main(String[] args) {
		Demo05 demo05=new Demo05();
		new Thread() {
			public void run() {
				synchronized (this) {
					//父类没有没有抛异常，子类只能自己处理
					try {
						while(true)
							demo05.print01();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}.start();
		
		new Thread() {
			public void run() {
				synchronized (this) {
					//父类没有没有抛异常，子类只能自己处理
					try {
						while(true)
						demo05.print02();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}.start();
		
		new Thread() {
			public void run() {
				synchronized (this) {
					//父类没有没有抛异常，子类只能自己处理
					try {
						while(true)
						demo05.print03();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}.start();
	}
}

class Demo05{
	private int flag=1;
	public void print01() throws InterruptedException {
		synchronized (this) {
			while(flag!=1) {
				//如果用if就可能不执行了
				this.wait();//wait在那里等待，就在那里醒来
			}
			System.out.print("1");
			System.out.print("1");
			System.out.print("1");
			System.out.print("1");
			System.out.println();
			flag=2;
			//notify只能随即唤醒一个线程，notifyAll()唤醒所有等待线程线程
			this.notifyAll();
		}
	}
	
	public void print02() throws InterruptedException {
		synchronized (this) {
			while(flag!=2) {
				//如果用if就可能不执行了
				this.wait();//wait在那里等待，就在那里醒来
			}
			System.out.print("2");
			System.out.print("2");
			System.out.print("2");
			System.out.print("2");
			System.out.println();
			flag=3;
			this.notifyAll();
		}
	}
	public void print03() throws InterruptedException {
		synchronized (this) {
			while(flag!=3) {
				//如果用if就可能不执行了
				this.wait();//wait在那里等待，就在那里醒来
			}
			System.out.print("3");
			System.out.print("3");
			System.out.print("3");
			System.out.print("3");
			System.out.println();
			flag=1;
			this.notifyAll();
		}
	}
	
}
