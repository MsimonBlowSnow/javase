package day18map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/*TreeMap ��һ����˳��
 * ��֤˳���ȥ��ͨ�������ַ�������TreeSetһ��
 	* 1.ʵ��comparable�ӿ����compareto()����
 	* 2.ͨ��new����������ʵ�������compare()����
 * ���û��дcompareto()����,���ᱨ java.lang.ClassCastException���쳣
 * */
public class DemoTreeMap {
	public static void main(String[] args) {
		//ͨ��Studentʵ��comparable�ӿ������compareto()����
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
		a.put(new Student(1,"slliy"),"slliy2");//ͨ��comparetoȥ��
		System.out.println(a);
	}

	private static void method1() {
		TreeMap<Student,String> a= new TreeMap(); 
		a.put(new Student(1,"mmp"),"mmp1");
		a.put(new Student(2,"nmp"),"nmp2");
		a.put(new Student(1,"laji"),"laji1");
		a.put(new Student(1,"slliy"),"slliy1");
		a.put(new Student(1,"slliy"),"slliy2");//ͨ��comparetoȥ��
		System.out.println(a);
	}
}
