package day15jihe;

import java.util.ArrayList;
import java.util.List;

/* A:List���ϵ����й��ܸ���
* void add(int index,E element)
* E remove(int index)
* E get(int index)
* E set(int index,E element)
*/
public class DemoList {
	public static void main(String[] args) {
		//method1();
		List a=new ArrayList();
		a.remove(1);//��DemoArrayList�е�remove��һ����
		//DemoArrayList�е�remove����Boolean�����remove������object
	}

	private static void method1() {
		List a=new ArrayList();
		a.add(0,"a");
		a.add(1, "1");
		a.add(2, "2");
		a.add(3,"3");
		//a.add(10,"2");����Խ��indexOutOfBoundsException
		System.out.println(a);
		Object c=a.remove(3);//ͨ������ɾ����Ԫ�أ������ء�
		//a.remove(6);����Խ��indexOutOfBoundsException
		System.out.println(c);
		System.out.println(a);
		a.get(2);
		System.out.println(a);
		a.set(0, "1");
		System.out.println(a);
	}	
}
