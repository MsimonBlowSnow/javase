package day24thread;

/*1.synchronizedx修饰的方法默认是该对象或者字节码
 	*静态方法就是对象，static就是字节码对象
 * 2.synchronized在非静态方法里面，可以直接调用this，但是在静态里面不能用this,
 	* 只能用字节码。
 *3.
 	*a0b0c01 zw3 abcq abc0
 *说明static synchronizedx修饰的方法的锁是同一类型及Demo15.class
 *非静态是不同类型
 * 
 * */
public class Demo15ThreadSynchronized {
	public static void main(String[] args) {
			Demo15 aDemo15=new Demo15();
		
		 new Thread() {
		  
		  @Override 
		  public void run() { 
			  for (int i = 0; i < 100; i++) {
		  //1.7版本匿名内部类访问类成员必须用final修饰 //1.8版本 
			  aDemo15.print1(); 
			  }
		  } 
		 }.start();
		  
		  /*new Thread() {
		  
		  @Override public void run() { 
			  for (int i = 0; i < 100; i++) {
		  //1.7版本匿名内部类访问类成员必须用final修饰 //1.8版本 
				  aDemo15.print2(); 
				  }
			  }
		  }.start();
		 */
		
		
		  new Thread() {
		 
		  @Override public void run() { for (int i = 0; i < 100; i++)  {
		  //1.7版本匿名内部类访问类成员必须用final修饰 //1.8版本 
			  aDemo15.print3(); 
			  } 
		  	} 
		  }.start();
		 
		
		/*new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					//1.7版本匿名内部类访问类成员必须用final修饰
					//1.8版本
					aDemo15.print0();
				}
			}
		}.start();
		*/
	}
}

 class Demo15 {
	//this对象
	synchronized void print0(){
		System.out.print("a");
		System.out.print("b");
		System.out.print("c");
		System.out.println("\r\n");
	}
	//用的是字节码对象
	public  static synchronized void print1(){
		System.out.print("a0");
		System.out.print("b0");
		System.out.print("c0");
		System.out.println("\r\n");
	}
	
	//this对象
 public void print2(){
	 	//非静态方法可以用this
	 	synchronized (this){
		System.out.print("1");
		System.out.print("2");
		System.out.print("3");
		System.out.println("\r\n");
 	}	
	}
 
 //字节码对象
  public  static void print3(){
	 synchronized (Demo15.class){
	 //非静态方法可以用this，静态方法不能用this
	//synchronized (this){
	 //用字节码对象
		System.out.print("z");
		System.out.print("w");
		System.out.print("q");
		System.out.println("\r\n");
	}	
	}
 }

