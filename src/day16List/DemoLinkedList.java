package day16List;

import java.util.LinkedList;

import java.util.List;

/* A:LinkedList�����
 	*һ���ײ�����ʽ�ṹʵ�ֵļ���
 	*��������Ҫһ��һ���ı���
 	*�����޸ķ��� 
* B:LinkedList�����й���
* ����һ��Ԫ��,������ͷ������λ
	* public void addFirst(E e)��addLast(E e)
	* public E getFirst()��getLast()
	* public E removeFirst()��public E removeLast()
	* public E get(int index);
  */
public class DemoLinkedList {
	public static void main(String[] args) {
		//methodAdd();
		//methodGet();
		//mehtodRemove();
		
	}

	private static void mehtodRemove() {
		LinkedList a= new LinkedList();
		a.addFirst("i");
		a.addLast("n");
		a.addFirst("M");
		a.addLast("g");
		a.removeLast();
		System.out.println(a);//[M, i, n]
		a.removeFirst();
		System.out.println(a);//[i, n]	
	}

	private static void methodGet() {
		LinkedList a= new LinkedList();
		a.addFirst("i");
		a.addLast("n");
		a.addFirst("M");
		a.addLast("g");
		System.out.println(a.getFirst());//M
		System.out.println(a.getLast());//g
		System.out.println(a.get(1));
	}

	private static void methodAdd() {
		LinkedList a= new LinkedList();
		a.addFirst("i");
		a.addLast("n");
		a.addFirst("M");
		a.addLast("g");
		System.out.println(a);//[M, i, n, g]
	}
}
