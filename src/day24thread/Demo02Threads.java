package day24thread;
/* A:Java��������ԭ��
* Java���������java�����������JVM������������һ��Ӧ�ó���Ҳ����������һ�����̡��ý��̻��Զ�����һ�� �����̡߳� ��Ȼ�����߳�ȥ����ĳ����� main ������

* B:JVM�������Ƕ��̵߳���
* JVM�����������������������̺߳����̣߳������Ƕ��̵߳ġ�
*/
/*  1.�̳�Thread
	* ������̳�Thread
	* ��дrun����
	* �����߳�Ҫ������д��run������
	* �����̶߳���,����start()����
	* �������߳�, �ڲ����Զ�ִ��run����*/

public class Demo02Threads {
	public static void main(String[] args) {
		Demo1 a=new Demo1();
		a.run();//���Ὺ�����̣߳���ͨ�ĵ��á�
		a.start();//03.�����߳�
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}

class Demo1 extends Thread{//01.�̳�thread
	public void run() {//02.��дrun()����������Ҫִ�ж��̵߳Ĵ������run()����
		for (int i = 0; i < 1000; i++) {
			System.out.println(i+"���߳�");
		}
	}
}