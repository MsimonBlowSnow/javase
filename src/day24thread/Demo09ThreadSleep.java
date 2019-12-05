package day24thread;
/*24.11_多线程(休眠线程)
 * sleep(int 毫秒)；
 * */
public class Demo09ThreadSleep {
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i <10; i++) {
					System.out.println(i+"thread");
					//new Thread()不能抛出异常，所以该异常只能自己处理	
					try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(i+"runable接口");
					//new Thread()不能抛出异常，所以该异常只能自己处理	
					try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}
