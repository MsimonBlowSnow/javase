package day24thread;
/*(��ȡ��ǰ�̵߳Ķ���)(����)
 * currentTread()����ʹһ��static����������ʹ��Thread����
* Thread.currentThread(), ���߳�Ҳ���Ի�ȡ 
* currentThreadʹʵ��Runable�ӿڵ��߳�Ҳ���Ե���getName��setName
 * */
public class Demo08currentThread {
	public static void main(String[] args) {
		//��ȡ���̲߳�����
		Thread.currentThread().setName("ming");
		System.out.println(Thread.currentThread().getName());
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Thread.currentThread().setName("yue");
				System.out.println(Thread.currentThread().getName()+" "+"runable�ӿ�");
			}
		}).start();
	}
}
