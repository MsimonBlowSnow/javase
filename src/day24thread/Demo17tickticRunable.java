package day24thread;

/*
 * ���߳�(��վ��Ʊ��������ʵ��Runnable�ӿ�)(����)
 	*�����̱߳��봴��Demo17���󣬲�����Thread()��������
 	*����synchronized���Դ���ͬһ������ 	
 * */
public class Demo17tickticRunable {
	public static void main(String[] args) {
		//ӦΪDemo17��ʵ��Runable�ӿڵģ�����ֱ�ӵ���start()������
		Demo17 aDemo= new Demo17();		
		new Thread(aDemo).start();
		new Thread(aDemo).start();
		new Thread(aDemo).start();
		new Thread(aDemo).start();
	}
}

class Demo17 implements Runnable {
	private int tickic = 100;

	@Override
	public void run() {
		while (true) {
			//����aDemo���󣬼�ͬһ������
			synchronized (this) {
				if (tickic == 0)
					break;
				tickic--;
				// ��Ϊ���߳���ʵ��Runable�ӿڣ�����ֱ�ӵ���getName()����������ͨ��Thread�����
				// currentThread()��������ȡ�����̣߳��ڵ���getName()����
				System.out.println(Thread.currentThread().getName() + "���ǵ�" + tickic + "��Ʊ!");
			}
		}
	}
}