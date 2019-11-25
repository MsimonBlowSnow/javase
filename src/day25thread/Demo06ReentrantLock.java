package day25thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* 1.ͬ��
	* ʹ��ReentrantLock���lock()��unlock()��������ͬ��
* 2.ͨ��
	* ʹ��ReentrantLock���newCondition()�������Ի�ȡCondition����
	* ��Ҫ�ȴ���ʱ��ʹ��Condition��await()����, ���ѵ�ʱ����signal()����
	* ��ͬ���߳�ʹ�ò�ͬ��Condition, �����������ֻ��ѵ�ʱ�����ĸ��߳��� 
 * */
public class Demo06ReentrantLock {
	public static void main(String[] args) {
		Demo06 demo06=new Demo06();
		new Thread() {
			@Override
			public void run() {
				while(true)
					//���쳣ֻ����
					try {
						demo06.Print1();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				while(true)
					//���쳣ֻ����
					try {
						demo06.Print2();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				while(true)
					//���쳣ֻ����
					try {
						demo06.Print3();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}.start();
	}
}
 class Demo06{
	 private ReentrantLock rtLock =new ReentrantLock();
	 Condition cdtCondition1= rtLock.newCondition();
	 Condition cdtCondition2= rtLock.newCondition();
	 Condition cdtCondition3= rtLock.newCondition();
	private int flag;
	 public void Print1() throws InterruptedException {
		 rtLock.lock();
			 if(flag !=0) {
				 cdtCondition1.await();
			 }
			 System.out.print("1");
			 System.out.print("1");
			 System.out.print("1");
			 System.out.print("1");
			System.out.println();
			flag=1;
			cdtCondition2.signal();
			rtLock.unlock();
			System.out.println(rtLock);
			
	 }
	 public void Print2() throws InterruptedException {
		 rtLock.lock();
			 if(flag !=1) {
				 cdtCondition2.await();
			 }
			 System.out.print("2");
			 System.out.print("2");
			 System.out.print("2");
			 System.out.print("2");
			System.out.println();
			flag=2;
			cdtCondition3.signal();
			Thread.currentThread().sleep(3000);
			rtLock.unlock();
			System.out.println(rtLock);
			
	 }
	 public void Print3() throws InterruptedException {
		 rtLock.lock();
			 if(flag !=2) {
				 cdtCondition3.await();
			 }
			 System.out.print("3");
			 System.out.print("3");
			 System.out.print("3");
			 System.out.print("3");
			System.out.println();
			flag=0;
			cdtCondition1.signal();
			rtLock.unlock();
			System.out.println(rtLock);
			
	 }
 }
