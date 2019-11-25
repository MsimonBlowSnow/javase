package day16List;

import java.util.LinkedList;

import java.util.List;

/* A:LinkedList类概述
 	*一个底层用链式结构实现的集合
 	*查找慢，要一个一个的遍历
 	*插入修改方便 
* B:LinkedList类特有功能
* 增加一个元素,加在链头或者链位
	* public void addFirst(E e)及addLast(E e)
	* public E getFirst()及getLast()
	* public E removeFirst()及public E removeLast()
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
