package day13regx;

import java.util.Random;

/*Random
 * 两张构造
 * Random();//更具纳秒值来产生随机数
 * Random(int n);根据种子产生随机数
 * */
public class DemoRandom {
	public static void main(String[] args) {
		Random a=new Random();
		Random b= new Random(10);
		Random c=new Random(10);
		System.out.println(a.nextInt());//随机产生一个随机整数
		System.out.println(a.nextInt(100));//随机产生一个0-99的数
		System.out.println(b.nextInt());//随机产生一个随机整数
		System.out.println(c.nextInt());//随机产生一个随机整数
		System.out.println(b.nextInt(100));//随机产生一个0-99随机整数
		System.out.println(c.nextInt(100));//随机产生一个0-99随机整数
		System.out.println("bc产生的随机数相等，应为种子是一样的");
	}
}
