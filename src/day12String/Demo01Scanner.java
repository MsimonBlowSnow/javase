package day12String;

import java.util.Scanner;

/*1.Scanner
 	*构造Scanner(InputStream); 
 	*输入方法 nextInt,nextString(和next一样)，next(默认nextString)，nextLine()
 	*判断方法，hasnextInt 
 * */
public class Demo01Scanner {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//如果不判断，可能输入一个非int导致抛出InputMismatchException异常
		/*
		 * try { 
		 * 		int a=sc.nextInt(); System.out.println(a); 
		 * } catch (Exception e) { 
		 * //TODO Auto-generated catch block 
		 * System.out.println("出错了"); }
		 */
		
		if (sc.hasNextInt()) {
			int a= sc.nextInt();
		}else {
			System.out.println("出错了");
		}
	}
}
