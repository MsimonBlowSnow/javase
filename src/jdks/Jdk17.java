package jdks;
/*27.17_JDK7新特性(JDK7的六个新特性回顾和讲解)
 	* A:二进制字面量
 	* B:数字字面量可以出现下划线
 	* C:switch 语句可以用字符串
 	* D:泛型简化,菱形泛型
 	* E:异常的多个catch合并,每个异常用或|
 	* F:try-with-resources 语句
 * 
 * */


public class Jdk17 {
	public static void main(String[] args) {
		method17();
	}

	private static void method17() {
		//1.7支持
		System.out.println(0b1111);
		//1.7支持，方便观察
		System.out.println(100_000);
		//1.7支持，System.out.println(0b_100_100);//不合理不能在字符串之间
		System.out.println(0b1_00_100);
	}
}
