package day17Exceptioon;
/* A:为什么需要自定义异常
	* 举例：人的年龄
* B:自定义异常概述
	* 继承自Exception 不处理或者抛出编译时会有错误提示
	* 继承自RuntimeException 不处理或者抛出编译时没有错误提示，不过运行时会出错
* C:案例演示
	* 自定义异常的基本使用 
*/
public class DemoMakeExecption {
	public static void main(String[] args) {
		try {
			throw new MyException("mmp");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


class  MyException extends Exception{
	MyException(){}
	MyException(String message){
		super(message);
	}
}