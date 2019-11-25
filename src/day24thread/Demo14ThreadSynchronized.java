package day24thread;
/*
 *  1.什么情况下需要同步
	* 当多线程并发, 有多段代码同时执行时, 我们希望某一段代码执行的过程中CPU不要切换到其他线程工作. 这时就需要同步.
	* 如果两段代码是同步的, 那么同一时间只能执行一段, 在一段代码没执行结束之前, 不会执行另外一段代码.
* 2.同步代码块
	* 使用synchronized关键字加上一个锁对象来定义一段代码, 这就叫同步代码块
	* 多个同步代码块如果使用相同的锁对象, 那么他们就是同步的
	
 * 注意：//加锁，穿任意对象，不过同一把必须传入同一个对象，不能是匿名对象
 * */
public class Demo14ThreadSynchronized {
	public static void main(String[] args) {
		// 在1.7jdk时成员内部类访问变量要用final修饰，1.8jdk就不用了
		final Demo14 aDemo=new Demo14();
		
		 new Thread() {
			@Override
			public void run() {
				aDemo.print1();
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				aDemo.print2();
			}
		}.start();
	}
}

class Demo14{
	Demo14(){};
	Object aObject=new Object();
	void print1() {
		synchronized (aObject) {//加锁，穿任意对象，不过同一把必须传入同一个对象，不能是匿名对象
		for (int a = 0;  a<1000; a++) {
			System.out.println(a+"---------d---------");
		}
		}
	}
	
	void print2() {
		synchronized (aObject) {
			for (int i = 0; i <1000; i++) {
				System.out.println(i+"----------b-------------");
			}
		}
		
	}
}

