package day3operator;

import java.util.Scanner;

public class Demo1ScannerMax {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一个整数:");
		int a=sc.nextInt();
		System.out.println("请输入第二个整数:");
		int b=sc.nextInt();
		System.out.println((a<b?a:b)+"比较小!");
		System.out.println((a<b?b:a)+"比较大");
	}
}
