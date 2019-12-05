package day24thread;
/*
 *  setPriority()设置线程的优先级
 *  最小是1，最大是10，默认是5
 * */
public class Demo13setPowerThread {
	public static void main(String[] args) {
		Thread th= new Thread() {
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(i+"bbbb00");
				}
			};
		};
		
		
		Thread th1= new Demo13();
		th1.setPriority(Thread.MAX_PRIORITY);
		th.setPriority(Thread.MIN_PRIORITY);
		th.start();
		th1.start();
	}
}

class Demo13 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i+"aaaaaa");
		}
	}
}