package day17set;

import java.util.LinkedHashSet;
import java.util.Scanner;

/* ʹ��Scanner�Ӽ��̶�ȡһ������,ȥ�������ظ��ַ�, ��ӡ����ͬ����Щ�ַ�
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
