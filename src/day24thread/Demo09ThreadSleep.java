package day24thread;
/*24.11_���߳�(�����߳�)
 * sleep(int ����)��
 * */
public class Demo09ThreadSleep {
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i <10; i++) {
					System.out.println(i+"thread");
					//new Thread()�����׳��쳣�����Ը��쳣ֻ���Լ�����	
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
					System.out.println(i+"runable�ӿ�");
					//new Thread()�����׳��쳣�����Ը��쳣ֻ���Լ�����	
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
