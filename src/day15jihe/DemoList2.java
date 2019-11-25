package day15jihe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/*ListIterator中的方法
 * hasNext();判断指针后一位是否为空
 * next指针向后移一位
 * hasPrevious();判断指针上一位是否为空
 * previous指针向前移一位
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
		while(c.hasNext()) {//判断指针后一位是否为空
			System.out.println(c.next());//指针向后移一位
		}
		System.out.println("============================");
		while(c.hasPrevious()) {//判断指针上一位是否为空
			System.out.println(c.previous());//指针向前移一位
		}
	}
}
