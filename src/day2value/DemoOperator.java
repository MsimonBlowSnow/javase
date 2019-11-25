package day2value;

public class DemoOperator {
	public static void main(String[] args) {
		int a=3;
		/*算术运算符
		 * + - * / % ++ --
 		 */ 
		System.out.println(10/3);//3整数除整数等于整数  
		System.out.println(10/3.0);//整数除double型先转化为double型再除
		System.out.println(-12%5);//-2 符号位和第一个数一致
		System.out.println(12%-5);//2 符号位和第一个数一致
		System.out.println(++a);//先加一后运算
		System.out.println(a++);//后加一先运算
		//关系运算符反回boolean值
		System.out.println(4 == 3);
		System.out.println(4 != 3);
		System.out.println(4 > 4);
		System.out.println(4 >= 4);
		System.out.println(4 < 3);
		System.out.println(4 <= 3);
	}
}
