package day25thread;

/* 1.什么时候需要通信
	* 多个线程并发执行时, 在默认情况下CPU是随机切换线程的
	* 如果我们希望他们有规律的执行, 就可以使用通信, 例如每个线程执行一次打印
* 2.怎么通信
	* 如果希望线程等待, 就调用wait()
	* 如果希望唤醒等待的线程, 就调用notify();
	* 这两个方法必须在同步代码中执行, 并且使用同步锁对象来调用
* 3.notify()方法
	*随机唤醒一个线程	 
* */
public class Demo04Notify {
	public static void main(String[] args) {
		Demo04 demo04=new Demo04();
		new Thread() {
			public void run() {
				//父类没有抛异常，只能自己处理
				try {
				//匿名内部类访问成员变量，成员变量要用final修饰，不过jdk1.8（包括)后就不用
					while(true)
						demo04.print();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
		}.start();
		
		new Thread() {
			public void run() {
				try {
				//匿名内部类访问成员变量，成员变量要用final修饰，不过jdk1.8（包括)后就不用
					while(true)
						demo04.print02();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
		}.start();
	}
}

class Demo04 {
	private int flag=0;
	public void print() throws InterruptedException {
		synchronized (this) {
			if(flag!=1) {
				this.wait();
			}
			System.out.print("1");
			System.out.print("2");
			System.out.print("3");
			System.out.print("4");
			System.out.println();
			flag=0;
			this.notify();
		}
	}
	public void print02() throws InterruptedException {
		synchronized (this) {
			if(flag!=0) {
				this.wait();
			}
				System.out.print("a");
				System.out.print("b");
				System.out.print("c");
				System.out.print("d");
				System.out.println();
				flag=1;
				this.notify();
		}
	}
	
}