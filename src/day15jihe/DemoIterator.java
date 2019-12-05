package day15jihe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoIterator {
	public static void main(String[] args) {
		Collection a=new ArrayList();
		a.add(new Student("张三","23"));	//相当于object obj=new studnet2();
		a.add(new Student("李四","24"));
		a.add(new Student("王五","25"));
		a.add(new Student("赵六","26"));
		//创建一个迭代器
		Iterator b=a.iterator();
		while(b.hasNext()) {
			//System.out.println(b.next());//默认调用toString方法
			//像调用get方法 通过b.next().getXXX()是不行的，应为默认是object
			//object不能调用子类方法，必须向下转型
			Student stud=(Student) b.next();
			System.out.println(stud.getAge()+stud.getName());
		}
	}
}

