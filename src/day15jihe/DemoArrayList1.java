package day15jihe;

import java.util.ArrayList;
import java.util.Collection;

/** A:������ʾ
* 
		��All�Ĺ�����ʾ
		
		boolean addAll(Collection c)//����һ�������ڵ�����Ԫ��
		boolean removeAll(Collection c)//ɾ��һ�����ϵĽ���
		boolean containsAll(Collection c)//�жϼ����Ƿ������������
		boolean retainAll(Collection c)//ȡ���������ؽ����boolean
		���������false,����ı���true
*
*/

public class DemoArrayList1 {
	public static void main(String[] args) {
		Collection a= new ArrayList();
		Collection a1= new ArrayList();
		Collection a2=new ArrayList();
		//methodAddAll(a, a1);//���һ�����ϵ�����Ԫ��
		//methodRemoveAll(a, a1);//ɾ��һ��������Դ���ϵĽ���������Ԫ��
		//methodContains(a, a1, a2);//�жϼ����Ƿ������������
		methodRetainall(a, a1, a2);//ȡ���������ؽ����boolean
		//���������false,����ı���true
	}

	private static void methodRetainall(Collection a, Collection a1, Collection a2) {
		a.add("a1");
		a.add("a2");
		a.add("a3");
		a.add("a4");
		
		a1.add("a2");
		a1.add("a3");
		a1.add("a4");
		
		a2.add("a1");
		a2.add("a2");
		a2.add("a3");
		a2.add("a4");
		if(a.retainAll(a1)) {//a=[a2,a3,a4]����ı���
			System.out.println(a+"a�Ľ���ı�");
		}else {
			System.out.println(a+"a�Ľ�����ı�");
		}
		if(a.retainAll(a2)) {//a=[a2,a3,a4]������ı�ע�������Ѿ��ı���a
			System.out.println(a+"a�Ľ���ı�");
		}else {
			System.out.println(a+"a�Ľ�����ı�");
		}
	}

	private static void methodContains(Collection a, Collection a1, Collection a2) {
		a.add("a1");
		a.add("a2");
		a.add("a3");
		a.add("a4");
		
		a1.add("a2");
		a1.add("a3");
		a1.add("a4");
		
		a2.add("a2");
		a2.add("a3");
		a2.add("a5");
		if(a.containsAll(a1)) {//�жϼ����Ƿ������������
			System.out.println("a����a1");
		}
		else {
			System.out.println("a������a1");
		}
		if(a.containsAll(a2)) {
			System.out.println("a����a2");
		}
		else {
			System.out.println("a������a2");
		}
	}

	private static void methodRemoveAll(Collection a, Collection a1) {
		a.add("a1");
		a.add("a2");
		a.add("a3");
		a.add("a4");
		
		a1.add("a2");
		a1.add("a3");
		a1.add("a4");
		
		a.removeAll(a1);//ɾ��һ�����ϵĽ���
		System.out.println(a);
	}

	private static void methodAddAll(Collection a, Collection a1) {
		a.add("a1");
		a.add("a2");
		a.add("a3");
		a.add("a4");
		
		a1.add("a1");
		a1.add("a2");
		a1.add("a3");
		a1.add("a4");
		a.add(a1);//add�ӽ�ȥ��һ���������
		System.out.println(a);
		a.addAll(a1);//��a1�е�Ԫ��ȫ���ӽ�ȥ��
		System.out.println(a);
	}
}
