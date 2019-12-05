package day15jihe;

import java.util.ArrayList;
import java.util.List;

/* A:List集合的特有功能概述
* void add(int index,E element)
* E remove(int index)
* E get(int index)
* E set(int index,E element)
*/
public class DemoList {
	public static void main(String[] args) {
		//method1();
		List a=new ArrayList();
		a.remove(1);//和DemoArrayList中的remove不一样，
		//DemoArrayList中的remove返回Boolean，这个remove返回是object
	}

	private static void method1() {
		List a=new ArrayList();
		a.add(0,"a");
		a.add(1, "1");
		a.add(2, "2");
		a.add(3,"3");
		//a.add(10,"2");数组越界indexOutOfBoundsException
		System.out.println(a);
		Object c=a.remove(3);//通告索引删除该元素，并返回。
		//a.remove(6);数组越界indexOutOfBoundsException
		System.out.println(c);
		System.out.println(a);
		a.get(2);
		System.out.println(a);
		a.set(0, "1");
		System.out.println(a);
	}	
}
