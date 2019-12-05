package day24thread;
/** 继承Thread类
	 	
		new Thread() {													//1,new 类(){}继承这个类
			public void run() {											//2,重写run方法
				for(int i = 0; i < 3000; i++) {							//3,将要执行的代码,写在run方法中
					System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
				}
			}
		}.start();
* 实现Runnable接口
			
		new Thread(new Runnable(){										//1,new 接口(){}实现这个接口
			public void run() {											//2,重写run方法
				for(int i = 0; i < 3000; i++) {							//3,将要执行的代码,写在run方法中
					System.out.println("bb");
				}
			}
		}).start(); 

 * 
 * 
 * */
public class Demo06NoNameThreads {
	public static void main(String[] args) {
		//创建匿名内部对象。
		new Thread() {
			@Override
			public void run() {//重写run()方法
				for (int i = 0; i <10000; i++) {
					System.out.println("Thread实现");
				}
			}
		}.start();
		
		//实现Runable接口，把它当作参数传给thread
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					System.out.println("Runnable实现");
				}
			}
		}).start();
	}
}
