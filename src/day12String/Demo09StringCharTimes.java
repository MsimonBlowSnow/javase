package day12String;

import java.util.Scanner;

/*统计一个字符串中字母的个数:
*
 * */
public class Demo09StringCharTimes {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int flag=0;
		String str="";
		while (true) {
			System.out.println("请输入一个字符串(quit退出):");
			 str=scanner.nextLine();
			if(str.equals("quit"))
				break;
			for (int i = 0; i < str.length(); i++) {
				char ch=str.charAt(i);
				if(ch<='z'&&ch>='A')
					flag++;
			}
			System.out.println("该字符串有"+flag+"个字母!");
		}
	}
}
