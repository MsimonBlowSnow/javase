package day16List;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoFangXing {
	/**
	 * A:���͸��� 
	 * B:���ͺô� ��߰�ȫ��(�������ڵĴ���ת����������) ʡȥǿת���鷳
	 *  C:���ͻ���ʹ�� <>�зŵı����������������� 
	 *  D:����ʹ��ע������
	 * ǰ��ķ��ͱ���һ��,���ߺ���ķ��Ϳ���ʡ�Բ�д(1.7�����������η���) 
	 */
	public static void main(String[] args) {
		// demo1();
		// int[] arr = new byte[5]; //����Ҫ��֤ǰ�����������һ��
		// ArrayList<Object> list = new ArrayList<Person>(); //���ϵķ���Ҫ��֤ǰ�����������һ��
		// ArrayList<Object> list = new ArrayList<>(); //1.7�汾��������,���η���
		ArrayList<Object> list = new ArrayList<>(); // ������ò�Ҫ�����Object,û������
		list.add("aaa");
		list.add(true);
	}

	public static void demo1() {
		ArrayList<Student> list = new ArrayList<Student>();
		// list.add(110);
		// list.add(true);
		list.add(new Student("����", "23"));
		list.add(new Student("����", "24"));

		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			// System.out.println(it.next());

			// System.out.println(it.next().getName() + "..." +
			// it.next().getAge());//next����ֻ�ܵ���һ��,������ö�λὫָ������ƶ����
			Student p = it.next();
			System.out.println(p.getName() + "..." + p.getAge());
		}
	}

}
