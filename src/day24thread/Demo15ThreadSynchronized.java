package day24thread;

/*1.synchronizedx���εķ���Ĭ���Ǹö�������ֽ���
 	*��̬�������Ƕ���static�����ֽ������
 * 2.synchronized�ڷǾ�̬�������棬����ֱ�ӵ���this�������ھ�̬���治����this,
 	* ֻ�����ֽ��롣
 *3.
 	*a0b0c01 zw3 abcq abc0
 *˵��static synchronizedx���εķ���������ͬһ���ͼ�Demo15.class
 *�Ǿ�̬�ǲ�ͬ����
 * 
 * */
public class Demo15ThreadSynchronized {
	public static void main(String[] args) {
			Demo15 aDemo15=new Demo15();
		
		 new Thread() {
		  
		  @Override 
		  public void run() { 
			  for (int i = 0; i < 100; i++) {
		  //1.7�汾�����ڲ���������Ա������final���� //1.8�汾 
			  aDemo15.print1(); 
			  }
		  } 
		 }.start();
		  
		  /*new Thread() {
		  
		  @Override public void run() { 
			  for (int i = 0; i < 100; i++) {
		  //1.7�汾�����ڲ���������Ա������final���� //1.8�汾 
				  aDemo15.print2(); 
				  }
			  }
		  }.start();
		 */
		
		
		  new Thread() {
		 
		  @Override public void run() { for (int i = 0; i < 100; i++)  {
		  //1.7�汾�����ڲ���������Ա������final���� //1.8�汾 
			  aDemo15.print3(); 
			  } 
		  	} 
		  }.start();
		 
		
		/*new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					//1.7�汾�����ڲ���������Ա������final����
					//1.8�汾
					aDemo15.print0();
				}
			}
		}.start();
		*/
	}
}

 class Demo15 {
	//this����
	synchronized void print0(){
		System.out.print("a");
		System.out.print("b");
		System.out.print("c");
		System.out.println("\r\n");
	}
	//�õ����ֽ������
	public  static synchronized void print1(){
		System.out.print("a0");
		System.out.print("b0");
		System.out.print("c0");
		System.out.println("\r\n");
	}
	
	//this����
 public void print2(){
	 	//�Ǿ�̬����������this
	 	synchronized (this){
		System.out.print("1");
		System.out.print("2");
		System.out.print("3");
		System.out.println("\r\n");
 	}	
	}
 
 //�ֽ������
  public  static void print3(){
	 synchronized (Demo15.class){
	 //�Ǿ�̬����������this����̬����������this
	//synchronized (this){
	 //���ֽ������
		System.out.print("z");
		System.out.print("w");
		System.out.print("q");
		System.out.println("\r\n");
	}	
	}
 }

