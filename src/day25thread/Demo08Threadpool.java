package day25thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*A:线程池概述
	* 程序启动一个新线程成本是比较高的，因为它涉及到要与操作系统进行交互。而使用线程池可以很好的提高性能，尤其是当程序中要创建大量生存期很短的线程时，更应该考虑使用线程池。线程池里的每一个线程代码结束后，并不会死亡，而是再次回到线程池中成为空闲状态，等待下一个对象来使用。在JDK5之前，我们必须手动实现自己的线程池，从JDK5开始，Java内置支持线程池
* B:内置线程池的使用概述
	* JDK5新增了一个Executors工厂类来产生线程池，有如下几个方法
		* public static ExecutorService newFixedThreadPool(int nThreads)
		* public static ExecutorService newSingleThreadExecutor()
		* 这些方法的返回值是ExecutorService对象，该对象表示一个线程池，可以执行Runnable对象或者Callable对象代表的线程。它提供了如下方法
		* Future<?> submit(Runnable task)
		* <T> Future<T> submit(Callable<T> task)
	* 使用步骤：
		* 创建线程池对象
		* 创建Runnable实例
		* 提交Runnable实例
		* 关闭线程池
	* C:案例演示
		* 提交的是Runnable
* 
		// public static ExecutorService newFixedThreadPool(int nThreads)
		ExecutorService pool = Executors.newFixedThreadPool(2);

		// 可以执行Runnable对象或者Callable对象代表的线程
		pool.submit(new MyRunnable());
		pool.submit(new MyRunnable());

		//结束线程池
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
