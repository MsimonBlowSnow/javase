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
		System.out.println(a.size());//���ϵĳ���
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));//��̬������Student�е�tostring����
		}
		//ͨ������ת�ͣ�����get����
		System.out.println("==================================");
		System.out.println("ͨ������ת�ͣ�����get����:");
		for(int i=0;i<a.size();i++) {
			Student stud=(Student) a.get(i);
			System.out.println(stud.getAge()+":"+stud.getName());//��̬������Student�е�tostring����
		}
	}
}