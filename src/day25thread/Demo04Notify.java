package day25thread;

/* 1.ʲôʱ����Ҫͨ��
	* ����̲߳���ִ��ʱ, ��Ĭ�������CPU������л��̵߳�
	* �������ϣ�������й��ɵ�ִ��, �Ϳ���ʹ��ͨ��, ����ÿ���߳�ִ��һ�δ�ӡ
* 2.��ôͨ��
	* ���ϣ���̵߳ȴ�, �͵���wait()
	* ���ϣ�����ѵȴ����߳�, �͵���notify();
	* ����������������ͬ��������ִ��, ����ʹ��ͬ��������������
* 3.notify()����
	*�������һ���߳�	 
* */
public class Demo04Notify {
	public static void main(String[] args) {
		Demo04 demo04=new Demo04();
		new Thread() {
			public void run() {
				//����û�����쳣��ֻ���Լ�����
				try {
				//�����ڲ�����ʳ�Ա��������Ա����Ҫ��final���Σ�����jdk1.8������)��Ͳ���
					while(true)
						demo04.print();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
		}.start();
		
		new Thread() {
			public void run() {
				try {
				//�����ڲ�����ʳ�Ա��������Ա����Ҫ��final���Σ�����jdk1.8������)��Ͳ���
					while(true)
						demo04.print02();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
		}.start();
	}
}

class Demo04 {
	private int flag=0;
	public void print() throws InterruptedException {
		synchronized (this) {
			if(flag!=1) {
				this.wait();
			}
			System.out.print("1");
			System.out.print("2");
			System.out.print("3");
			System.out.print("4");
			System.out.println();
			flag=0;
			this.notify();
		}
	}
	public void print02() throws InterruptedException {
		synchronized (this) {
			if(flag!=0) {
				this.wait();
			}
				System.out.print("a");
				System.out.print("b");
				System.out.print("c");
				System.out.print("d");
				System.out.println();
				flag=1;
				this.notify();
		}
	}
	
}