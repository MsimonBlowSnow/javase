package day17Exceptioon;
/* A:JVM默认是如何处理异常的
* main函数收到这个问题时,有两种处理方式:
	* a:自己将该问题处理,然后继续运行
	* b:自己没有针对的处理方式,只有交给调用main的jvm来处理,不能运行
* jvm有一个默认的异常处理机制,就将该异常进行处理.
* 并将该异常的名称,异常的信息.异常出现的位置打印在了控制台上,同时将程序停止运行
* B:案例演示
* JVM默认如何处理异常
*/


public class DemoExceptionJVM {
	public static void main(String[] args) {
		int c=chu(10,0);//main方法没有处理，交给jvm，jvm打印出错误的信息
		System.out.println(c);
	}

	private static int chu(int i, int j) {
		return i/j; //产生异常并抛main方法  newArithmeticException("/ by zero") 
	}
}
