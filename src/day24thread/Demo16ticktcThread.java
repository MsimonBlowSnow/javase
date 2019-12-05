package day24thread;

public class Demo16ticktcThread {
/**
* 需求:铁路售票,一共100张,通过四个窗口卖完.
	*分析： 
	*问题1：如果不是同步线程，当票数为0时，有多个窗口同时访问，就会出先票数为负数的情况
		*解决：给四个窗口加一把锁，保证四个窗口传入的是同一个对象。	 
	*问题二:如何保证四把锁绑定的是同一个对象
		*传入该类的字节码文件
*/
		
		public static void main(String[] args) {
			new Ticket().start();
			new Ticket().start();
			new Ticket().start();
			new Ticket().start();
		}

	}

	class Ticket extends Thread {
		private static int ticket = 100;
		
		//如果用引用数据类型成员变量当作锁对象,必须是静态的，保证是同一个对象
		//private static Object obj = new Object();		
		public void run() {
			while(true) {
				//传入字节码问价，保证锁对象是同一个字节码对象
				synchronized(Ticket.class) {
					if(ticket <= 0) {
						break;
					}
					try {
						Thread.sleep(10);				//线程1睡,线程2睡,线程3睡,线程4睡
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(getName() + "...这是第" + ticket-- + "号票");
				}
			}
		}
	}

