package day3operator;

import java.util.Scanner;

public class Demo1ScannerMax {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ������:");
		int a=sc.nextInt();
		System.out.println("������ڶ�������:");
		int b=sc.nextInt();
		System.out.println((a<b?a:b)+"�Ƚ�С!");
		System.out.println((a<b?b:a)+"�Ƚϴ�");
	}
}
