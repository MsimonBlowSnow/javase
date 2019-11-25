package day25thread;

public class Demotest {
	public static void main(String[] args) {
		Object bjecta = new Object();
		new Thread() {
			@Override
			public void run() {
				synchronized (bjecta) {
					try {
						System.out.print(1);
						System.out.print(1);
						bjecta.notify();
						bjecta.wait();
						System.out.print(1);
						System.out.print(1);		
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		new Thread() {
			public void run() {
				synchronized (bjecta) {
					try {
						System.out.print(2);
						System.out.print(2);
						bjecta.notify();
						bjecta.wait();
						System.out.print(2);
						System.out.print(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
		}.start();
	}	
}
