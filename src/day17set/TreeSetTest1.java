package day17set;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/* �Ӽ��̽���һ���ַ���, ��������������ַ���������,�����������:
 *  helloitcast�����ӡ:acehillostt 
 * */
public class TreeSetTest1 {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		String str=a.nextLine();
		char[] cr=str.toCharArray();
		sort(cr);
	}

	private static void sort(char... cr) {
		// TODO Auto-generated method stub
		TreeSet<Character> tree=new TreeSet<>(new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				int num=o1.compareTo(o2);
				return num==0?-1:num;
			}
		});
		for (Character  character: cr) {
			tree.add(character);
		}
		for (Character character : tree) {
			System.out.print(character);
		}
	}
}
