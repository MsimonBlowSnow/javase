package day12String;

import java.util.Scanner;

/*模拟用户登入一共有三处机会
 * 密码和账号都是admin
 * 登入错误提示密码错误还是账号错误和提示剩余机会
 * */
public class Demo07StringLogin {
	public static void main(String[] args) {
		String account="admin";
		String password="admin";
		Scanner sc=new Scanner(System.in);
		int flag=3;
		while(true) {
			if(flag==0) {
				System.out.println("应为多次输入错误,你的账号将被冻结");
				break;
			}
			if(flag!=3) {
				System.out.println("你还有"+flag+"次机会");
			}
				System.out.println("请输入账号:");
				String str1=sc.nextLine();
				System.out.println("请输入你的密码:");
				String str2=sc.nextLine();
				if(str1.equals(account)) {
					if(str2.equals(password)) 
						break;
					else 
						System.out.println("密码错误!");
				}else {
					System.out.println("账号错误!");
				}
				flag--;
		}
		if(flag!=0) {
			System.out.println("成功登入");
		}
	}
}
