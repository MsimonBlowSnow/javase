package day24thread;

/*
 * 多线程(火车站卖票的例子用实现Runnable接口)(掌握)
 	*调用线程必须创造Demo17对象，并传入Thread()匿名对象
 	*所以synchronized可以传入同一个对象。 	
 * */
public class Demo17tickticRunable {
	public static void main(String[] args) {
		//应为Demo17是实现Runable接口的，不能直接调用start()方法。
		Demo17 aDemo= new Demo17();		
		new Thread(aDemo).start();
		new Thread(aDemo).start();
		new Thread(aDemo).start();
		new Thread(aDemo).start();
	}
}

class Demo17 implements Runnable {
	private int tickic = 100;

	@Override
	public void run() {
		while (true) {
			//都是aDemo对象，及同一个对象
			synchronized (this) {
				if (tickic == 0)
					break;
				tickic--;
				// 因为该线程是实现Runable接口，不能直接调用getName()方法，必须通过Thread里面的
				// currentThread()方法，获取运行线程，在调用getName()方法
				System.out.println(Thread.currentThread().getName() + "这是第" + tickic + "张票!");
			}
		}
	}
}