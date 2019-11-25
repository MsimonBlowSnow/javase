package day17set;

import java.util.LinkedHashSet;
import java.util.Scanner;

/* 使用Scanner从键盘读取一行输入,去掉其中重复字符, 打印出不同的那些字符
 */
public class HashTest1 {	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] a=sc.nextLine().toCharArray();
		LinkedHashSet<Character> c=new LinkedHashSet<>();
		for (Character character : a) {
			c.add(character);
		}
		System.out.println(c);
	}
}
