package day8object;

public class Demo1Static {
	public static void main(String[] args) {
		
		{
			System.out.println("2");
		}
		new Demo1static1();
		Demo1static1 a;//不会执行static
		//new Demo1static1();
	}
	
	static{
		System.out.println("1");//比主函数先执行
	}
	
	
}

class Demo1static1{
	public Demo1static1(){
		System.out.println("5");
	}
	//创捷对象时会执行
			{
				System.out.println("4");
			}
			
	//类出现了就会执行，且只执行一次。
		static {
			System.out.println("3");
		}
		
	
}