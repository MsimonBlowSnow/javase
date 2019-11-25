package day16List;

import java.util.ArrayList;
import java.util.List;

/*去重
 * 去填一个计划中重复的元素
 * 思路：
 * 创建另一个集合
 *把这个集合里面的原属放入另一个集合中判断是否有重复
 *去重对象数据类型不同有不同的
 *contains中有equals()方法
 	*引用数据类型：自己定义的类对象，看是否重写equals()方法
 	*基本数据类型：自动装箱，会用对应的类中重新定义的equals();
 * */
public class DemoRemoveTimes {
	public static void main(String[] args) {
		List a = new ArrayList();
		List b = new ArrayList();
		//methodJiben(a, b);
		//引用数据类型必须重写equalsf方法
		methodYingYong(a, b);
		
	}

	private static void methodYingYong(List a, List b) {
		a.add(new Student("zs","1"));
		a.add(new Student("lishi","2"));
		a.add(new Student("zs","1"));
		for(int i=0;i<a.size();i++) {
			Object c=a.get(i);
			if(!(b.contains(c))) 
				b.add(c);
		}
		System.out.println(a);
		System.out.println(b);
	}

	private static void methodJiben(List a, List b) {
		for(int i=0;i<15;i++) {
			a.add(i);	//object 对象会自动装箱 Integer调用了Interger里面的equals
		}
		for(int i=0;i<10;i++) {
			a.add(i);
		}
		
		for(int i=0;i<a.size();i++) {
			Object c=a.get(i);
			if(!(b.contains(c))) 
				b.add(c);
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.get(0)+""+a.get(15));
		System.out.println(a.get(0) instanceof Integer);
	}
}
