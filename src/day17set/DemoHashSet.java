package day17set;

import java.util.HashSet;
import java.util.Set;

/*此类实现 Set 接口，由哈希表（实际上是一个 HashMap 实例）支持。
 * 它不保证 set 的迭代顺序；特别是它不保证该顺序恒久不变。此类允许使用 null 元素。 (没有固定顺序，无序)
 * set 不能存储一样的对象，否则放回false
 * */
public class DemoHashSet {
	public static void main(String[] args) {
		Set<String> a= new HashSet<>();
		boolean c=a.add("1");
		boolean c1=a.add("1");//重复放回错误
		a.add("3");
		a.add("4");
		a.add("2");
		a.add("5");
		System.out.println(c);
		System.out.println(c1);
		for(String string:a) {
			System.out.println(string);
		}
	}
}
