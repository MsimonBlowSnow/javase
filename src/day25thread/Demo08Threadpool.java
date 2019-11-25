package day25thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*A:�̳߳ظ���
	* ��������һ�����̳߳ɱ��ǱȽϸߵģ���Ϊ���漰��Ҫ�����ϵͳ���н�������ʹ���̳߳ؿ��Ժܺõ�������ܣ������ǵ�������Ҫ�������������ں̵ܶ��߳�ʱ����Ӧ�ÿ���ʹ���̳߳ء��̳߳����ÿһ���̴߳�������󣬲����������������ٴλص��̳߳��г�Ϊ����״̬���ȴ���һ��������ʹ�á���JDK5֮ǰ�����Ǳ����ֶ�ʵ���Լ����̳߳أ���JDK5��ʼ��Java����֧���̳߳�
* B:�����̳߳ص�ʹ�ø���
	* JDK5������һ��Executors�������������̳߳أ������¼�������
		* public static ExecutorService newFixedThreadPool(int nThreads)
		* public static ExecutorService newSingleThreadExecutor()
		* ��Щ�����ķ���ֵ��ExecutorService���󣬸ö����ʾһ���̳߳أ�����ִ��Runnable�������Callable���������̡߳����ṩ�����·���
		* Future<?> submit(Runnable task)
		* <T> Future<T> submit(Callable<T> task)
	* ʹ�ò��裺
		* �����̳߳ض���
		* ����Runnableʵ��
		* �ύRunnableʵ��
		* �ر��̳߳�
	* C:������ʾ
		* �ύ����Runnable
* 
		// public static ExecutorService newFixedThreadPool(int nThreads)
		ExecutorService pool = Executors.newFixedThreadPool(2);

		// ����ִ��Runnable�������Callable���������߳�
		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());

		//�����̳߳�
		pool.shutdown();*/
public class Demo08Threadpool {
	public static void main(String[] args) {
		ExecutorService pool=Executors.newFixedThreadPool(2);
		pool.submit(new Runnable() {
			
			@Override
			public void run() {
				int i=0;
				while(i<1000) {
				System.out.print(1);
				System.out.print(1);
				System.out.print(1);
				System.out.println(1+i);
				i++;
			}
			}
		});
		
		pool.submit(new Runnable() {
			
			@Override
			public void run() {
				int i=0;
				while(i<1000) {
					System.out.print(2);
					System.out.print(2);
					System.out.print(2);
					System.out.println(2+i);
					i++;
				}
			}
		});
		pool.shutdown();
	}
}
