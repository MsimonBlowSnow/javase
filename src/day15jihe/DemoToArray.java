package day15jihe;

import java.util.ArrayList;
import java.util.Collection;
/*ArrayList toArray();
 * 
 * */

public class DemoToArray {
	public static void main(String[] args) {
		Collection a=new ArrayList();
		a.add(new Student("1","2"));
		a.add(new Student("12","21"));
		a.add(new Student("13","31"));
		a.add(new Student("14","41"));
		Object[] c=a.toArray();
		for(Object i:c) {
			
			System.out.println(i);//��̬
			Student j=(Student)i;//����ת��
			System.out.println(j.getAge()+" "+j.getName());
		}
	}
}

