package day15jihe;

import java.util.ArrayList;
import java.util.List;

public class DemLsit1 {
	public static void main(String[] args) {
		List a = new ArrayList();
		a.add(new Student("mmp", "0"));//Object a= new Student("mmp", "0");
		a.add(new Student("mmp1", "1"));
		a.add(new Student("mmp2", "2"));
		a.add(new Student("mmp3", "3"));
		a.add(new Student("mmp4", "4"));
		System.out.println(a.size());//集合的长度
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));//多态，调用Student中的tostring方法
		}
		//通告向下转型，调用get方法
		System.out.println("==================================");
		System.out.println("通告向下转型，调用get方法:");
		for(int i=0;i<a.size();i++) {
			Student stud=(Student) a.get(i);
			System.out.println(stud.getAge()+":"+stud.getName());//多态，调用Student中的tostring方法
		}
	}
}