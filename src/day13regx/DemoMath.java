package day13regx;
/* A:Math类概述
* Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。 
* B:成员方法
* public static int abs(int a)//取绝对值
* public static double ceil(double a)//大于或者等于a的最小整数
* public static double floor(double a)//小于或等于的最小整数
* public static int max(int a,int b) min自学
* public static double pow(double a,double b)
* public static double random()
* public static int round(float a) 参数为double的自学
* public static double sqrt(double a)
*/
import java.math.*;
public class DemoMath {
	public static void main(String[] args) {
		System.out.println(Math.abs(-10));//10绝对值
		System.out.println(Math.PI);//PI=3.1415926
		System.out.println(Math.ceil(8.9));//9向上取整
		System.out.println(Math.floor(8.9));//8向下取整
		System.out.println(Math.max(10,8));//10，比较两数大小，返回大的
		System.out.println(Math.min(10, 8));//8,比较两数大小，返回小的
		System.out.println(Math.pow(10,3));//1000 返回10^3
		System.out.println(Math.round(9.8));//10 四舍五入
		System.out.println(Math.sqrt(4));//2 返回算术平方根
		for(int i=0;i<10;i++) {
			System.out.println(Math.random());// 返回带正号的 double 值，该值大于等于 0.0 且小于 1.0。
		}
	}
}
