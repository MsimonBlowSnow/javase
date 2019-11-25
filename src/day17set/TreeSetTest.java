package day17set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

/* ��һ�������д洢���������ظ����ַ���,����һ������,��������(�ֵ�˳��),���һ�����ȥ����
 *  �Լ����е�Ԫ������,�������ظ�
*���������
	*1.����һ����������List�������ò������ݹ�ȥ
	*2.����һ��TreeSet���ϣ���ʵ�ֱȽ�����
	*3.�Ƚ������ж��������������ȣ��Ż�-1�� ��֤����ȥ��
	* ͨ��String�е�compareto()����ʵ���ֵ�����
* */
public class TreeSetTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("ccc");
		list.add("ccc");
		list.add("aaa");
		list.add("aaa");
		list.add("bbb");
		list.add("ddd");
		list.add("ddd");

		sort(list);
		System.out.println(list);
	}

	private static void sort(ArrayList<String> list) {
		// TODO Auto-generated method stub
		TreeSet<String> a = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1!=null&&o2!=null) {
					if(o1.equals(o2)) {
						return -1;
					}
					else
						return o1.compareTo(o2);
				}
				if(o1==null)
					return -1;
				else
					return 1;
			}

		});
		a.addAll(list);
		list.clear();
		list.addAll(a);
	}
}
