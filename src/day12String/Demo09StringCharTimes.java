package day12String;

import java.util.Scanner;

/*ͳ��һ���ַ�������ĸ�ĸ���:
*
 * */
public class Demo09StringCharTimes {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int flag=0;
		String str="";
		while (true) {
			System.out.println("������һ���ַ���(quit�˳�):");
			 str=scanner.nextLine();
			if(str.equals("quit"))
				break;
			for (int i = 0; i < str.length(); i++) {
				char ch=str.charAt(i);
				if(ch<='z'&&ch>='A')
					flag++;
			}
			System.out.println("���ַ�����"+flag+"����ĸ!");
		}
	}
}
