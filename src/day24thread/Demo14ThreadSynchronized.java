package day24thread;
/*
 *  1.ʲô�������Ҫͬ��
	* �����̲߳���, �ж�δ���ͬʱִ��ʱ, ����ϣ��ĳһ�δ���ִ�еĹ�����CPU��Ҫ�л��������̹߳���. ��ʱ����Ҫͬ��.
	* ������δ�����ͬ����, ��ôͬһʱ��ֻ��ִ��һ��, ��һ�δ���ûִ�н���֮ǰ, ����ִ������һ�δ���.
* 2.ͬ�������
	* ʹ��synchronized�ؼ��ּ���һ��������������һ�δ���, ��ͽ�ͬ�������
	* ���ͬ����������ʹ����ͬ��������, ��ô���Ǿ���ͬ����
	
 * ע�⣺//��������������󣬲���ͬһ�ѱ��봫��ͬһ�����󣬲�������������
 * */
public class Demo14ThreadSynchronized {
	public static void main(String[] args) {
		// ��1.7jdkʱ��Ա�ڲ�����ʱ���Ҫ��final���Σ�1.8jdk�Ͳ�����
		final Demo14 aDemo=new Demo14();
		
		 new Thread() {
			@Override
			public void run() {
				aDemo.print1();
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				aDemo.print2();
			}
		}.start();
	}
}

class Demo14{
	Demo14(){};
	Object aObject=new Object();
	void print1() {
		synchronized (aObject) {//��������������󣬲���ͬһ�ѱ��봫��ͬһ�����󣬲�������������
		for (int a = 0;  a<1000; a++) {
			System.out.println(a+"---------d---------");
		}
		}
	}
	
	void print2() {
		synchronized (aObject) {
			for (int i = 0; i <1000; i++) {
				System.out.println(i+"----------b-------------");
			}
		}
		
	}
}

