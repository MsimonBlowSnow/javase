package day15jihe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/*ListIterator�еķ���
 * hasNext();�ж�ָ���һλ�Ƿ�Ϊ��
 * nextָ�������һλ
 * hasPrevious();�ж�ָ����һλ�Ƿ�Ϊ��
 * previousָ����ǰ��һλ
*/
public class DemoList2 {
	public static void main(String[] args) {
		List a=new ArrayList();
		a.add("0");
		a.add("1");
		a.add("2");
		a.add("3");
		a.add("4");
		ListIterator c=a.listIterator();
		while(c.hasNext()) {//�ж�ָ���һλ�Ƿ�Ϊ��
			System.out.println(c.next());//ָ�������һλ
		}
		System.out.println("============================");
		while(c.hasPrevious()) {//�ж�ָ����һλ�Ƿ�Ϊ��
			System.out.println(c.previous());//ָ����ǰ��һλ
		}
	}
}
