package day17Exceptioon;
/* A:异常的概述
* 异常就是Java程序在运行过程中出现的错误。
* B:异常的分类
* 通过API查看Throwable
* Error
	* 服务器宕机,数据库崩溃等
* Exception
C:异常的继承体系
* Throwable
	* Error	
	* Exception
		* RuntimeException 运行时异常

*/
public class DemoExecption {
	public static void main(String[] args) {
		int[] a={1,2,3,4,5};
		System.out.println(a[6]);//ArrayIndexOutOfBoundsException数组越界异常
	}
}
