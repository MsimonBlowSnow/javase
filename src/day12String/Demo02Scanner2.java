package day12String;

import java.util.Scanner;

/*Scanner的小问题：
 *问题: 当创建一个Scanner时,先用nextInt()输入一个int,再用nextline()输入一个String会出错误
 	*原因：
 		*Scanner默认以"\r\n"结束，当输入一个整数时，敲下enter键时第二个字符就是空字符了
 	*
 	*解决方案:
 		*1.建立两个Scanner
 		*2先都用nextLine()方法，整数再用Integer.parseInt()转化(推荐)
 *！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
 *注意事项：
 *Scanner里面传参数为system.in时，不要关流，关闭流了system.in就关闭了，应为系统默认一个System.in流
 * */
public class Demo02Scanner2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int a=sc.nextInt();
		System.out.println(a);
		System.out.println("请输入一个字符串:");
		String str=sc.nextLine();
		System.out.println(str.equals(""));//true 原因：
		//Scanner默认以"\r\n"结束，当输入一个整数时，敲下enter键时第二个字符就是空字符了
		//解决方法一(不推荐)占内存
		
		System.out.println("=============第一种方法========================");
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println("请输入一个整数:");
		int a1=sc1.nextInt();
		System.out.println(a);
		System.out.println("请输入一个字符串:");
		String str1=sc2.nextLine();
		System.out.println(a1+" "+str1);
		
		
		//解决方法二(推荐)
		System.out.println("=============第二种方法========================");
		Scanner sc3= new Scanner(System.in);
		int a3=Integer.parseInt(sc3.nextLine());
		String str3= sc3.nextLine();
		System.out.println(a+" "+str1);
	}
}
