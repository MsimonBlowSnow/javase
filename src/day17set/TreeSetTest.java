package day17set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

/* 在一个集合中存储了无序并且重复的字符串,定义一个方法,让其有序(字典顺序),而且还不能去除重
 *  对集合中的元素排序,并保留重复
*解决方法：
	*1.创建一个方法，把List当作引用参数传递过去
	*2.创建一个TreeSet集合，并实现比较器，
	*3.比较器中判断如果两个对象相等，放回-1， 保证不会去重
	* 通过String中的compareto()方法实现字典排序
* */
public class TreeSetTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("ccc");
		list.add("ccc");
		list.add("aaa");
		list.add("aaa");
		list.add("bbb");
		list.add("ddd");
		list.add("ddd");

		sort(list);
		System.out.println(list);
	}

	private static void sort(ArrayList<String> list) {
		// TODO Auto-generated method stub
		TreeSet<String> a = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1!=null&&o2!=null) {
					if(o1.equals(o2)) {
						return -1;
					}
					else
						return o1.compareTo(o2);
				}
				if(o1==null)
					return -1;
				else
					return 1;
			}

		});
		a.addAll(list);
		list.clear();
		list.addAll(a);
	}
}
