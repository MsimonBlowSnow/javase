package day24thread;

public class Demo03moreThreads {
	public static void main(String[] args) {
		for (int i = 0; i < 100000; i++) {
			new Demo03();//创建匿名对象
		}
		
		for (int i = 0; i <100000; i++) {
			System.out.println("垃圾也可以买钱呐!");
		}
	}
}
 
class Demo03{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("收垃圾了!");
	}
}