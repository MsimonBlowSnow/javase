package day24thread;
/* join(), ��ǰ�߳���ͣ, �ȴ�ָ�����߳�ִ�н�����, ��ǰ�߳��ټ���
* join(int), ���Եȴ�ָ���ĺ���֮�����
 * */
public class Demo11ThreadJoin {

	public static void main(String[] args) {
		final Thread th1=new Thread() {
			public void run() {
				
				this.setName("thread1");
				for (int i = 0; i <10; i++) {
					//��new Thread()�������쳣������ֻ���Լ�����
					try {
						this.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(i+this.getName());
				}
			};
		};
		
		Thread th2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				//���߳���ʵ��Runable�ӿڵģ����Բ��ܵ���Thread�ķ�����
				//��������ͨ��currentThread()��ȡ�����̣߳�Ȼ���ڵ���Thread����ķ���
				Thread.currentThread().setName("Thread2-----");
				for (int i = 0; i <10; i++) {
					//��new Thread()�������쳣������ֻ���Լ�����
					try {
						if(i==5) {
						//th1.join();
						//��һ�̼߳�����
						th1.join(2000);//һ�߳�ִ�����룬��ִ�и��߳�
						}
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(i+Thread.currentThread().getName());
				}
			}
		});
		th1.start();
		th2.start();
	}
	

}
