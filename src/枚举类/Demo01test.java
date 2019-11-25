package 枚举类;
/* A:枚举概述
* 是指将变量的值一一列出来,变量的值只限于列举出来的值的范围内。举例：一周只有7天，一年只有12个月等。
* B:回想单例设计模式：单例类是一个类只有一个实例
* 那么多例类就是一个类有多个实例，但不是无限个数的实例，而是有限个数的实例。这才能是枚举类。
* C:案例演示
* 自己实现枚举类
1,自动拆装箱
2,泛型
3,可变参数
4,静态导入
5,增强for循环
6,互斥锁
7,枚举
*/	
public class Demo01test {
	public static void main(String[] args) {
		//自定义枚举的第一种方式
		method();
		//第二种自定义枚举的方法
		method2();
		//第三种自定义枚举方法
		method3();
	}

	private static void method3() {
		Week03 monWeek1= Week03.MON;
		Week03 tuesWeek1= Week03.TUES;
		Week03 wedWeek1= Week03.WED;
		monWeek1.show();
	}
	
	private static void method2() {
		Week02 monWeek1= Week02.MON;
		Week02 tuesWeek1= Week02.TUES;
		Week02 wedWeek1= Week02.WED;
		System.out.println(monWeek1.getName());
	}
	
	//自定义枚举的第一种方式
	private static void method() {
		Week01 monWeek1= Week01.MON;
		Week01 tuesWeek1= Week01.TUES;
		Week01 wedWeek1= Week01.WED;
	}
}
