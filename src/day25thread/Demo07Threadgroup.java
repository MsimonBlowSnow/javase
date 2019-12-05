package day25thread;
/*A:线程组概述
* Java中使用ThreadGroup来表示线程组，它可以对一批线程进行分类管理，Java允许程序直接对线程组进行控制。
* 默认情况下，所有的线程都属于主线程组。
	* public final ThreadGroup getThreadGroup()//通过线程对象获取他所属于的组
	* public final String getName()//通过线程组对象获取他组的名字
* 我们也可以给线程设置分组
	* 1,ThreadGroup(String name) 创建线程组对象并给其赋值名字
	* 2,创建线程对象
	* 3,Thread(ThreadGroup group, Runnable target, String name) 
	* 4,设置整组的优先级或者守护线程//
* B:案例演示
	* 线程组的使用,默认是主线程组
* 
	MyRunnable mr = new MyRunnable();
	Thread t1 = new Thread(mr, "张三");
	Thread t2 = new Thread(mr, "李四");
	//获取线程组
	// 线程类里面的方法：public final ThreadGroup getThreadGroup()
	ThreadGroup tg1 = t1.getThreadGroup();
	ThreadGroup tg2 = t2.getThreadGroup();
	// 线程组里面的方法：public final String getName()
	String name1 = tg1.getName();
	String name2 = tg2.getName();
	System.out.println(name1);
	System.out.println(name2);
	// 通过结果我们知道了：线程默认情况下属于main线程组
	// 通过下面的测试，你应该能够看到，默任情况下，所有的线程都属于同一个组
	System.out.println(Thread.currentThread().getThreadGroup().getName());

* 自己设定线程组
* 			
	// ThreadGroup(String name)
	ThreadGroup tg = new ThreadGroup("这是一个新的组");

	MyRunnable mr = new MyRunnable();
	// Thread(ThreadGroup group, Runnable target, String name)
	Thread t1 = new Thread(tg, mr, "张三");
	Thread t2 = new Thread(tg, mr, "李四");
	
	System.out.println(t1.getThreadGroup().getName());
	System.out.println(t2.getThreadGroup().getName());
	
	//通过组名称设置后台线程，表示该组的线程都是后台线程

*/
public class Demo07Threadgroup {
	public static void main(String[] args) {
		//method();创建默认的线程组对象
		Demo07 aDemo07=new Demo07();
		ThreadGroup aGroup=new ThreadGroup("ming");
		Thread aThread=new Thread(aGroup,aDemo07,"线程1");
		Thread bThread=new Thread(aGroup,aDemo07,"线程2");
		System.out.println(aThread.getThreadGroup().getName());
		System.out.println(bThread.getThreadGroup().getName());
		System.out.println(bThread.getThreadGroup());
	}

	private static void method() {
		Demo07 aDemo07=new Demo07();
		Thread thread01=new Thread(aDemo07);
		Thread thread02=new Thread(aDemo07);
		ThreadGroup aGroup=thread01.getThreadGroup();
		ThreadGroup aGroup1=thread02.getThreadGroup();
		System.out.println(aGroup.getName()+" "+aGroup1.getName());//默认是主线程
	}
}

class Demo07 implements Runnable{

	@Override
	public void run() {
		System.out.println("线程:"+Thread.currentThread().getName());
	}
	
}