package day24thread;
/*���߳�ʵ�ֵķ���
 	*1.ʵ��runable�ӿ�	 
 	* ��дrun()����������Ҫִ�ж��̵߳Ĵ������
 	* ����������󣬲����������������ݡ�
 	* �ø��̵߳���start()
 * */
public class Demo04Runable {
	public static void main(String[] args) {
		Thread thdThread= new Thread(new Demo04());//���������룬��ֵ��target
		thdThread.start();//�����target.run����
		for (int i = 0; i < 10000; i++) {
			System.out.println(i+" "+"���߳�");
		}
	}
}

class Demo04 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <10000; i++) {
			System.out.println(i);
		}
		
	}
	
}
