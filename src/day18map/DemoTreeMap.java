package day18map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/*TreeMap 有一定的顺序
 * 保证顺序和去重通过的两种方法，和TreeSet一样
 	* 1.实现comparable接口里的compareto()方法
 	* 2.通过new构造器，并实现里面的compare()方法
 * 如果没用写compareto()方法,将会报 java.lang.ClassCastException的异常
 * */
public class DemoTreeMap {
	public static void main(String[] args) {
		//通过Student实现comparable接口里面的compareto()方法
		//method1();
		TreeMap<Student,String> a= new TreeMap<>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				int num=o1.getName().compareTo(o2.getName());
				return num==0?o1.getAge()-o2.getAge():num;
			}
			
		}); 
		a.put(new Student(1,"mmp"),"mmp1");
		a.put(new Student(2,"nmp"),"nmp2");
		a.put(new Student(1,"laji"),"laji1");
		a.put(new Student(1,"slliy"),"slliy1");
		a.put(new Student(1,"slliy"),"slliy2");//通过compareto去重
		System.out.println(a);
	}

	private static void method1() {
		TreeMap<Student,String> a= new TreeMap(); 
		a.put(new Student(1,"mmp"),"mmp1");
		a.put(new Student(2,"nmp"),"nmp2");
		a.put(new Student(1,"laji"),"laji1");
		a.put(new Student(1,"slliy"),"slliy1");
		a.put(new Student(1,"slliy"),"slliy2");//通过compareto去重
		System.out.println(a);
	}
}
