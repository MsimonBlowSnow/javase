package day18map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* A:Collections�����
	* ��Լ��ϲ��� �Ĺ�����
* B:Collections��Ա����
* 
		public static <T> void sort(List<T> list)
		public static <T> int binarySearch(List<?> list,T key)
		public static <T> T max(Collection<?> coll)
		public static void reverse(List<?> list)
		public static void shuffle(List<?> list)
*/
public class DemoCollections {
	public static void main(String[] args) {
		
		List<Character> a= new ArrayList<>();
		/*collections.sort() �Զ�����
		methodSort();
		*/
		
		/*Collections.binarySearch(a)
		 * ���ַ�����ֵ�Ե����������������������û�ж�Ӧ��Ԫ�أ��򷵻�-���������-1
		methodBinarySearch(a);
		*/
		
		/*����a������������Ԫ�ء�Collection.max(a);
		methodMax();
		*/
		
		/*��a���Ϸ�ת Collections.reverse(a);
		methodReverse();
		*/
		
		/*Colllections.shuffle(a)��a����ϴ��
		*/
		
		methodShuffle();
	}

	private static void methodShuffle() {
		List<Character> a= new ArrayList<>();
		a.add('a');
		a.add('b');
		a.add('c');
		a.add('d');
		a.add('e');
		a.add('f');
		System.out.println(a);
		Collections.shuffle(a);
		System.out.println(a);
	}

	private static void methodReverse() {
		List<Character> a= new ArrayList<>();
		a.add('a');
		a.add('b');
		a.add('c');
		a.add('d');
		a.add('e');
		a.add('f');
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
	}

	private static void methodMax() {
		List<Character> a= new ArrayList<>();
		a.add('a');
		a.add('b');
		a.add('c');
		a.add('d');
		a.add('e');
		a.add('f');
		System.out.println(Collections.max(a));
	}

	private static void methodBinarySearch() {
		List<Character> a= new ArrayList<>();
		a.add('a');
		a.add('b');
		a.add('c');
		a.add('d');
		a.add('e');
		a.add('f');
		int flag=Collections.binarySearch(a, 'b');
		System.out.println(flag);
		flag=Collections.binarySearch(a, 'g');
		System.out.println(flag);//����-���������-1
	}

	private static void methodSort() {
		List<Character> a= new ArrayList<>();
		a.add('a');
		a.add('f');
		a.add('e');
		a.add('d');
		a.add('c');
		a.add('b');
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
	}
}
