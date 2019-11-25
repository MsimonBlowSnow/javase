package day25thread;

import java.awt.TexturePaint;

/** ����߳�ͨ�ŵ�����
	* notify()�������������һ���߳�
	* notifyAll()�����ǻ��������߳�
	* JDK5֮ǰ�޷�����ָ����һ���߳�
	* �������߳�֮��ͨ��, ��Ҫʹ��notifyAll()֪ͨ�����߳�, ��while�������ж�����
*/
//�������ϵ��̣߳�1.5�汾��ʵ�֣������㻽���߳��йر���
/*1.ͬ������������Ǹ�������󣬾͵����Ǹ������wait()
 * 2.Ϊʲôwait ��notify()����Ҫ������Object����
 	*object�����ж���ĳ��࣬����������������
 *3.sleep��wait������
 	*1.sleep�Ǳ��봫���������ʱ����ѹ�����
 	*wait()���������ʱ�䵽�˻�ȴ������������ͻ�һֱ�ȴ���Ҫ��notify�������ѡ�
 	*
 	*2.sleep ��ռ���� cpu��Դ��������ģ�(�����ͷ�����Դ)
 	*wait���˳�cpu����������󣬣����ͷ�����Դ��
 	* */	
public class Demo05Notify {
	public static void main(String[] args) {
		Demo05 demo05=new Demo05();
		new Thread() {
			public void run() {
				synchronized (this) {
					//����û��û�����쳣������ֻ���Լ�����
					try {
						while(true)
							demo05.print01();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}.start();
		
		new Thread() {
			public void run() {
				synchronized (this) {
					//����û��û�����쳣������ֻ���Լ�����
					try {
						while(true)
						demo05.print02();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}.start();
		
		new Thread() {
			public void run() {
				synchronized (this) {
					//����û��û�����쳣������ֻ���Լ�����
					try {
						while(true)
						demo05.print03();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}.start();
	}
}

class Demo05{
	private int flag=1;
	public void print01() throws InterruptedException {
		synchronized (this) {
			while(flag!=1) {
				//�����if�Ϳ��ܲ�ִ����
				this.wait();//wait������ȴ���������������
			}
			System.out.print("1");
			System.out.print("1");
			System.out.print("1");
			System.out.print("1");
			System.out.println();
			flag=2;
			//notifyֻ���漴����һ���̣߳�notifyAll()�������еȴ��߳��߳�
			this.notifyAll();
		}
	}
	
	public void print02() throws InterruptedException {
		synchronized (this) {
			while(flag!=2) {
				//�����if�Ϳ��ܲ�ִ����
				this.wait();//wait������ȴ���������������
			}
			System.out.print("2");
			System.out.print("2");
			System.out.print("2");
			System.out.print("2");
			System.out.println();
			flag=3;
			this.notifyAll();
		}
	}
	public void print03() throws InterruptedException {
		synchronized (this) {
			while(flag!=3) {
				//�����if�Ϳ��ܲ�ִ����
				this.wait();//wait������ȴ���������������
			}
			System.out.print("3");
			System.out.print("3");
			System.out.print("3");
			System.out.print("3");
			System.out.println();
			flag=1;
			this.notifyAll();
		}
	}
	
}
