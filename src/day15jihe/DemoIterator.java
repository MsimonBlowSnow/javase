package day15jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoIterator {
	public static void main(String[] args) {
		Collection a=new ArrayList();
		a.add(new Student("����","23"));	//�൱��object obj=new studnet2();
		a.add(new Student("����","24"));
		a.add(new Student("����","25"));
		a.add(new Student("����","26"));
		//����һ��������
		Iterator b=a.iterator();
		while(b.hasNext()) {
			//System.out.println(b.next());//Ĭ�ϵ���toString����
			//�����get���� ͨ��b.next().getXXX()�ǲ��еģ�ӦΪĬ����object
			//object���ܵ������෽������������ת��
			Student stud=(Student) b.next();
			System.out.println(stud.getAge()+stud.getName());
		}
	}
}

