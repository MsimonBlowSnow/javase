package day25thread;
/*A:�߳������
* Java��ʹ��ThreadGroup����ʾ�߳��飬�����Զ�һ���߳̽��з������Java�������ֱ�Ӷ��߳�����п��ơ�
* Ĭ������£����е��̶߳��������߳��顣
	* public final ThreadGroup getThreadGroup()//ͨ���̶߳����ȡ�������ڵ���
	* public final String getName()//ͨ���߳�������ȡ���������
* ����Ҳ���Ը��߳����÷���
	* 1,ThreadGroup(String name) �����߳�����󲢸��丳ֵ����
	* 2,�����̶߳���
	* 3,Thread(ThreadGroup group, Runnable target, String name) 
	* 4,������������ȼ������ػ��߳�//
* B:������ʾ
	* �߳����ʹ��,Ĭ�������߳���
* 
	MyRunnable mr = new MyRunnable();
	Thread t1 = new Thread(mr, "����");
	Thread t2 = new Thread(mr, "����");
	//��ȡ�߳���
	// �߳�������ķ�����public final ThreadGroup getThreadGroup()
	ThreadGroup tg1 = t1.getThreadGroup();
	ThreadGroup tg2 = t2.getThreadGroup();
	// �߳�������ķ�����public final String getName()
	String name1 = tg1.getName();
	String name2 = tg2.getName();
	System.out.println(name1);
	System.out.println(name2);
	// ͨ���������֪���ˣ��߳�Ĭ�����������main�߳���
	// ͨ������Ĳ��ԣ���Ӧ���ܹ�������Ĭ������£����е��̶߳�����ͬһ����
	System.out.println(Thread.currentThread().getThreadGroup().getName());

* �Լ��趨�߳���
* 			
	// ThreadGroup(String name)
	ThreadGroup tg = new ThreadGroup("����һ���µ���");

	MyRunnable mr = new MyRunnable();
	// Thread(ThreadGroup group, Runnable target, String name)
	Thread t1 = new Thread(tg, mr, "����");
	Thread t2 = new Thread(tg, mr, "����");
	
	System.out.println(t1.getThreadGroup().getName());
	System.out.println(t2.getThreadGroup().getName());
	
	//ͨ�����������ú�̨�̣߳���ʾ������̶߳��Ǻ�̨�߳�

*/
public class Demo07Threadgroup {
	public static void main(String[] args) {
		//method();����Ĭ�ϵ��߳������
		Demo07 aDemo07=new Demo07();
		ThreadGroup aGroup=new ThreadGroup("ming");
		Thread aThread=new Thread(aGroup,aDemo07,"�߳�1");
		Thread bThread=new Thread(aGroup,aDemo07,"�߳�2");
		System.out.println(aThread.getThreadGroup().getName());
		System.out.println(bThread.getThreadGroup().getName());
		System.out.println(bThread.getThreadGroup());
	}

	private static void method() {
		Demo07 aDemo07=new Demo07();
		Thread thread01=new Thread(aDemo07);
		Thread thread02=new Thread(aDemo07);
		ThreadGroup aGroup=thread01.getThreadGroup();
		ThreadGroup aGroup1=thread02.getThreadGroup();
		System.out.println(aGroup.getName()+" "+aGroup1.getName());//Ĭ�������߳�
	}
}

class Demo07 implements Runnable{

	@Override
	public void run() {
		System.out.println("�߳�:"+Thread.currentThread().getName());
	}
	
}