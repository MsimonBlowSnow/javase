package day16List;

import java.util.ArrayList;
import java.util.List;

public class DemoForeach {
	public static void main(String[] args) {
		String[] a= {"4","3","2","1"};		
		for (String string : a) {
			System.out.println(string);
		}
		List<Integer> c=new ArrayList<>();
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		c.add(5);
		for (Object i:c) {
			System.out.println(i);//∂‡Ã¨
		}
	}
}
