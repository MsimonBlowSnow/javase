package day17set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashTest2 {
	public static void main(String[] args) {
		List<String> a= new ArrayList();
		for(int i=0;i<10;i++) {
			a.add(""+i);
		}
		for(int i=0;i<5;i++) {
			a.add(""+i);
		}
		System.out.println(a);
		System.out.println("去重之后:");
		method1(a);
		System.out.println(a);
	}

	private static void method1(List<String> a) {
		// TODO Auto-generated method stub
		HashSet<String> c=new HashSet<>();
		c.addAll(a);
		a.clear();
		a.addAll(c);
	}
}
