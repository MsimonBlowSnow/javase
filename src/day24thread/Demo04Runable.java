package day24thread;
/*多线程实现的方法
 	*1.实现runable接口	 
 	* 重写run()方法，并并要执行多线程的代码放入
 	* 创建该类对象，并把它当做参数传递。
 	* 用该线程调用start()
 * */
public class Demo04Runable {
	public static void main(String[] args) {
		Thread thdThread= new Thread(new Demo04());//将对象引入，赋值给target
		thdThread.start();//会调用target.run（）
		for (int i = 0; i < 10000; i++) {
			System.out.println(i+" "+"主线程");
		}
	}
}

class Demo04 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <10000; i++) {
			System.out.println(i);
		}
		
	}
	
}
