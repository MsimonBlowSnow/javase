package day24thread;
/*_多线程(守护线程)(掌握)
* setDaemon(), 设置一个线程为守护线程, 该线程不会单独执行, 当其他非守护线程都执行结束后, 自动退出
* 
* 有时因为缓存的问题还会打印守护线程的语句，当非守护线程结束时，守护线程也关闭了。
 * */
public class Demo10Daemo {
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i <5; i++) {
					System.out.println(i+"非守护线程");
					//new Thread()不能抛异常，所以run()里面只能自己处理异常
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		Thread th=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <10; i++) {
					//new Thread()不能抛异常，所以run()里面只能自己处理异常
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					System.out.println(i+"守护线程");
				}
			}
		});
		th.setDaemon(true);
		th.start();
		
	}
}
