package day25thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*通过实现callable来实现多线程(普通情況下不能用)
 	*实现callable只能在 ExecutorService才能实现多线程
*/
public class Demo09Call {
	public static void main(String[] args) throws Exception {
		//method01();
		MyThread myThread = new MyThread();
		ExecutorService eService=Executors.newFixedThreadPool(2);
		eService.submit(new MyThread01());
		eService.submit(new MyThread01());		
	}

	private static void method01() throws Exception {
		MyThread myThread = new MyThread();
		myThread.call();
		new Thread() {
			public void run() {
				while (true) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(1);
				}
			};
		}.start();
	}
}

class MyThread implements Callable<Integer> {
	private int num;

	public MyThread() {
	}

	public MyThread(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		int flag = 0;
		for (int j = 0; j < num; j++) {
			
			flag += j;
		}
		return flag;
	}
}

class MyThread01 implements Callable<Integer> {
	public Integer call() throws Exception {
		int j = 0;
		for (j = 0; j < 100000; j++) {
			Thread.currentThread().sleep(3000);
			System.out.println(j + Thread.currentThread().getName());
		}
		return j;
	}

}
