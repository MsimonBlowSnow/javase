package day15jihe;

import java.util.ArrayList;
import java.util.Collection;

/** A:案例演示
* 
		带All的功能演示
		
		boolean addAll(Collection c)//加入一个集合内的所有元素
		boolean removeAll(Collection c)//删除一个集合的交集
		boolean containsAll(Collection c)//判断集合是否包含参数集合
		boolean retainAll(Collection c)//取交集，返回结果是boolean
		结果不变是false,结果改变是true
*
*/

public class DemoArrayList1 {
	public static void main(String[] args) {
		Collection a= new ArrayList();
		Collection a1= new ArrayList();
		Collection a2=new ArrayList();
		//methodAddAll(a, a1);//添加一个集合的所有元素
		//methodRemoveAll(a, a1);//删除一个集合与源集合的交集中所有元素
		//methodContains(a, a1, a2);//判断集合是否包含参数集合
		methodRetainall(a, a1, a2);//取交集，返回结果是boolean
		//结果不变是false,结果改变是true
	}

	private static void methodRetainall(Collection a, Collection a1, Collection a2) {
		a.add("a1");
		a.add("a2");
		a.add("a3");
		a.add("a4");
		
		a1.add("a2");
		a1.add("a3");
		a1.add("a4");
		
		a2.add("a1");
		a2.add("a2");
		a2.add("a3");
		a2.add("a4");
		if(a.retainAll(a1)) {//a=[a2,a3,a4]结果改变了
			System.out.println(a+"a的结果改变");
		}else {
			System.out.println(a+"a的结果不改变");
		}
		if(a.retainAll(a2)) {//a=[a2,a3,a4]结果不改变注意上面已经改变了a
			System.out.println(a+"a的结果改变");
		}else {
			System.out.println(a+"a的结果不改变");
		}
	}

	private static void methodContains(Collection a, Collection a1, Collection a2) {
		a.add("a1");
		a.add("a2");
		a.add("a3");
		a.add("a4");
		
		a1.add("a2");
		a1.add("a3");
		a1.add("a4");
		
		a2.add("a2");
		a2.add("a3");
		a2.add("a5");
		if(a.containsAll(a1)) {//判断集合是否包含参数集合
			System.out.println("a包括a1");
		}
		else {
			System.out.println("a不包括a1");
		}
		if(a.containsAll(a2)) {
			System.out.println("a包括a2");
		}
		else {
			System.out.println("a不包括a2");
		}
	}

	private static void methodRemoveAll(Collection a, Collection a1) {
		a.add("a1");
		a.add("a2");
		a.add("a3");
		a.add("a4");
		
		a1.add("a2");
		a1.add("a3");
		a1.add("a4");
		
		a.removeAll(a1);//删除一个集合的交集
		System.out.println(a);
	}

	private static void methodAddAll(Collection a, Collection a1) {
		a.add("a1");
		a.add("a2");
		a.add("a3");
		a.add("a4");
		
		a1.add("a1");
		a1.add("a2");
		a1.add("a3");
		a1.add("a4");
		a.add(a1);//add加进去了一个数组对象
		System.out.println(a);
		a.addAll(a1);//把a1中的元素全部加进去了
		System.out.println(a);
	}
}
