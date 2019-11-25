package day17Exceptioon;
/* 键盘录入一个int类型的整数,对其求二进制表现形式
* 如果录入的整数过大,给予提示,录入的整数过大请重新录入一个整数BigInteger
* 如果录入的是小数,给予提示,录入的是小数,请重新录入一个整数
* 如果录入的是其他字符,给予提示,录入的是非法字符,请重新录入一个整数*/

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个int型整数");
		int flag=0;
		int intnum=0;
		String str;
		BigInteger bignum;
		while(true) {
			str=sc.nextLine();
			if(str.equals("quit"))
				break;
			try {
			if(flag==0) {
				intnum=Integer.parseInt(str);
			}}catch(NumberFormatException e) {
				try {
					new BigInteger(str);
					System.out.println("输入的数太大了");
				}catch (Exception sfd) {
					try {
						new BigDecimal(str);
						System.out.println("输入小数无效，请输入整数");
					}catch(Exception sfd1) {
						System.out.println("输入的字符为非法字符");
					}
					}
			}
			
		}
	}
}
