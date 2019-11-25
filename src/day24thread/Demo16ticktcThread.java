package day24thread;

public class Demo16ticktcThread {
/**
* ����:��·��Ʊ,һ��100��,ͨ���ĸ���������.
	*������ 
	*����1���������ͬ���̣߳���Ʊ��Ϊ0ʱ���ж������ͬʱ���ʣ��ͻ����Ʊ��Ϊ���������
		*��������ĸ����ڼ�һ��������֤�ĸ����ڴ������ͬһ������	 
	*�����:��α�֤�İ����󶨵���ͬһ������
		*���������ֽ����ļ�
*/
		
		public static void main(String[] args) {
			new Ticket().start();
			new Ticket().start();
			new Ticket().start();
			new Ticket().start();
		}

	}

	class Ticket extends Thread {
		private static int ticket = 100;
		
		//����������������ͳ�Ա��������������,�����Ǿ�̬�ģ���֤��ͬһ������
		//private static Object obj = new Object();		
		public void run() {
			while(true) {
				//�����ֽ����ʼۣ���֤��������ͬһ���ֽ������
				synchronized(Ticket.class) {
					if(ticket <= 0) {
						break;
					}
					try {
						Thread.sleep(10);				//�߳�1˯,�߳�2˯,�߳�3˯,�߳�4˯
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(getName() + "...���ǵ�" + ticket-- + "��Ʊ");
				}
			}
		}
	}

