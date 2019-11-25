package day18map;

import java.util.HashMap;
import java.util.Map;

/*HashMap 存储自定义对象
 * 在键出储存自定义对象怎么保证自定义对象不唯一。
 * 通过Student中重写的hashcode()方法和equals保证键的唯一性
 * */
public class DemoHashMap3 {
	public static void main(String[] args) {
		Map<Student,String> a=new HashMap<>();
		a.put(new Student(12,"liming"), "江西");
		a.put(new Student(12,"liming"), "北京");//去重通过Student中重写的hashcode()方法和equals
		a.put(new Student(14,"lishi"), "上海");
		a.put(new Student(13,"liwu"), "深圳");
		System.out.println(a);
	}	
}




