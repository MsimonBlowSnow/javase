package day24thread;


/*
 * * 1.获取名字
	* 通过getName()方法获取线程对象的名字
* 2.设置名字
	* 通过构造函数可以传入String类型的名字
	* 
*注意:getName和setName是thread的方法，runable不能调用
*如果runable想用getname和setName方法，请看下个类的方法.currentThread;
*/
public class Demo07NameThread {
	public static void main(String[] args) {
		new Thread("ming"){//通过构造传递
			@Override
			public void run() {
				for (int i = 0; i <10000; i++) {
					System.out.println(this.getName()+" "+i);
				}
			}
		}.start();
		
		Thread thread1=new Thread() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					System.out.println(this.getName()+" "+i);
				}
			};
		};
		thread1.setName("yue");
		thread1.start();
	}
}
