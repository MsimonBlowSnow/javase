package day24thread;
/*_���߳�(�ػ��߳�)(����)
* setDaemon(), ����һ���߳�Ϊ�ػ��߳�, ���̲߳��ᵥ��ִ��, ���������ػ��̶߳�ִ�н�����, �Զ��˳�
* 
* ��ʱ��Ϊ��������⻹���ӡ�ػ��̵߳���䣬�����ػ��߳̽���ʱ���ػ��߳�Ҳ�ر��ˡ�
 * */
public class Demo10Daemo {
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i <5; i++) {
					System.out.println(i+"���ػ��߳�");
					//new Thread()�������쳣������run()����ֻ���Լ������쳣
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		Thread th=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <10; i++) {
					//new Thread()�������쳣������run()����ֻ���Լ������쳣
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println(i+"�ػ��߳�");
				}
			}
		});
		th.setDaemon(true);
		th.start();
		
	}
}
