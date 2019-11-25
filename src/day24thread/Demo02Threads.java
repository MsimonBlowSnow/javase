package day24thread;
/* A:Java程序运行原理
* Java命令会启动java虚拟机，启动JVM，等于启动了一个应用程序，也就是启动了一个进程。该进程会自动启动一个 “主线程” ，然后主线程去调用某个类的 main 方法。

* B:JVM的启动是多线程的吗
* JVM启动至少启动了垃圾回收线程和主线程，所以是多线程的。
*/
/*  1.继承Thread
	* 定义类继承Thread
	* 重写run方法
	* 把新线程要做的事写在run方法中
	* 创建线程对象,调用start()方法
	* 开启新线程, 内部会自动执行run方法*/

public class Demo02Threads {
	public static void main(String[] args) {
		Demo1 a=new Demo1();
		a.run();//不会开启多线程，普通的调用。
		a.start();//03.开启线程
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
	}
}

class Demo1 extends Thread{//01.继承thread
	public void run() {//02.重写run()方法，并把要执行多线程的代码放入run()里面
		for (int i = 0; i < 1000; i++) {
			System.out.println(i+"副线程");
		}
	}
}