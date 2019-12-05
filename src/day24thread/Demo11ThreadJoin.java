package day24thread;
/* join(), 当前线程暂停, 等待指定的线程执行结束后, 当前线程再继续
* join(int), 可以等待指定的毫秒之后继续
 * */
public class Demo11ThreadJoin {

	public static void main(String[] args) {
		final Thread th1=new Thread() {
			public void run() {
				
				this.setName("thread1");
				for (int i = 0; i <10; i++) {
					//在new Thread()不能抛异常，所以只能自己处理
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
				//该线程是实现Runable接口的，所以不能调用Thread的方法，
				//不过可以通过currentThread()获取它的线程，然后在调用Thread里面的方法
				Thread.currentThread().setName("Thread2-----");
				for (int i = 0; i <10; i++) {
					//在new Thread()不能抛异常，所以只能自己处理
					try {
						if(i==5) {
						//th1.join();
						//把一线程加人入
						th1.join(2000);//一线程执行两秒，在执行该线程
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
