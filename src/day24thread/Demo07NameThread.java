package day24thread;


/*
 * * 1.��ȡ����
	* ͨ��getName()������ȡ�̶߳��������
* 2.��������
	* ͨ�����캯�����Դ���String���͵�����
	* 
*ע��:getName��setName��thread�ķ�����runable���ܵ���
*���runable����getname��setName�������뿴�¸���ķ���.currentThread;
*/
public class Demo07NameThread {
	public static void main(String[] args) {
		new Thread("ming"){//ͨ�����촫��
			@Override
			public void run() {
				for (int i = 0; i <10000; i++) {
					System.out.println(this.getName()+" "+i);
				}
			}
		}.start();
		
		Thread thread1=new Thread() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					System.out.println(this.getName()+" "+i);
				}
			};
		};
		thread1.setName("yue");
		thread1.start();
	}
}
