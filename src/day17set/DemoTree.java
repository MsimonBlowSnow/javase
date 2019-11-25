package day17set;

import java.util.TreeSet;

/*TreeSet 中不允许重复元素
 * TreeSet按照一定的排序方法排序 completeto()方法
 * */
public class DemoTree {
	public static void main(String[] args) {
		TreeSet<Integer> a=new TreeSet<>();
		a.add(3);
		a.add(3);
		a.add(2);
		a.add(1);
		System.out.println(a);
	}
}
