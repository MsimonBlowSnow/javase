package day17Exceptioon;
/**
 * * A:案例演示
 * try...catch的方式处理多个异常
 * JDK7以后处理多个异常的方式及注意事项
 * 
 * 安卓,客户端开发,如何处理异常?try{}catch(Exception e){}
 * ee,服务端开发,一般都是底层开发,从底层向上抛
 * 
 * try后面如果跟多个catch,那么小的异常放前面,大的异常放后面,根据多态的原理,如果大的放前面,就会将所有的子类对象接收
 * 后面的catch就没有意义了
 */

//下面的程序只会执行一个异常。应为异常冲int a=10/0 就跳到catch中被人处理了
public class DemoExceptionTryCatchs {
	public static void main(String[] args) {
		try {
			int a=10/0;//除0异常
			int[] c=new int[1];
			System.out.println(c[2]);//数组越界异常
			String arr=null;//空指针异常
			System.out.println(arr.charAt(1));
		}catch(ArithmeticException e){
			System.out.println("0不能做除数");
		}catch(NullPointerException e) {
			System.out.println("空指针异常");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("数组越界异常");
			//大异常放后面。否则小异常没用了
		}catch(Exception e) {//父类引用指向子类对象 Exceptption e= new XXX();异常
			System.out.println("出错了");
		}
		
		
	}
}
