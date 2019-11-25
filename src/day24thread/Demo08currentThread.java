package day24thread;
/*(获取当前线程的对象)(掌握)
 * currentTread()方法使一个static方法，可以使用Thread调用
* Thread.currentThread(), 主线程也可以获取 
* currentThread使实现Runable接口的线程也可以调用getName和setName
 * */
public class Demo08currentThread {
	public static void main(String[] args) {
		//获取主线程并改名
		Thread.currentThread().setName("ming");
		System.out.println(Thread.currentThread().getName());
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Thread.currentThread().setName("yue");
				System.out.println(Thread.currentThread().getName()+" "+"runable接口");
			}
		}).start();
	}
}
