package day24thread;
/** �̳�Thread��
	 	
		new Thread() {													//1,new ��(){}�̳������
			public void run() {											//2,��дrun����
				for(int i = 0; i < 3000; i++) {							//3,��Ҫִ�еĴ���,д��run������
					System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
				}
			}
		}.start();
* ʵ��Runnable�ӿ�
			
		new Thread(new Runnable(){										//1,new �ӿ�(){}ʵ������ӿ�
			public void run() {											//2,��дrun����
				for(int i = 0; i < 3000; i++) {							//3,��Ҫִ�еĴ���,д��run������
					System.out.println("bb");
				}
			}
		}).start(); 

 * 
 * 
 * */
public class Demo06NoNameThreads {
	public static void main(String[] args) {
		//���������ڲ�����
		new Thread() {
			@Override
			public void run() {//��дrun()����
				for (int i = 0; i <10000; i++) {
					System.out.println("Threadʵ��");
				}
			}
		}.start();
		
		//ʵ��Runable�ӿڣ�����������������thread
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					System.out.println("Runnableʵ��");
				}
			}
		}).start();
	}
}
