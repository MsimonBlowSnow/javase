package day16List;

import java.util.ArrayList;
import java.util.List;

/*ȥ��
 * ȥ��һ���ƻ����ظ���Ԫ��
 * ˼·��
 * ������һ������
 *��������������ԭ��������һ���������ж��Ƿ����ظ�
 *ȥ�ض����������Ͳ�ͬ�в�ͬ��
 *contains����equals()����
 	*�����������ͣ��Լ����������󣬿��Ƿ���дequals()����
 	*�����������ͣ��Զ�װ�䣬���ö�Ӧ���������¶����equals();
 * */
public class DemoRemoveTimes {
	public static void main(String[] args) {
		List a = new ArrayList();
		List b = new ArrayList();
		//methodJiben(a, b);
		//�����������ͱ�����дequalsf����
		methodYingYong(a, b);
		
	}

	private static void methodYingYong(List a, List b) {
		a.add(new Student("zs","1"));
		a.add(new Student("lishi","2"));
		a.add(new Student("zs","1"));
		for(int i=0;i<a.size();i++) {
			Object c=a.get(i);
			if(!(b.contains(c))) 
				b.add(c);
		}
		System.out.println(a);
		System.out.println(b);
	}

	private static void methodJiben(List a, List b) {
		for(int i=0;i<15;i++) {
			a.add(i);	//object ������Զ�װ�� Integer������Interger�����equals
		}
		for(int i=0;i<10;i++) {
			a.add(i);
		}
		
		for(int i=0;i<a.size();i++) {
			Object c=a.get(i);
			if(!(b.contains(c))) 
				b.add(c);
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.get(0)+""+a.get(15));
		System.out.println(a.get(0) instanceof Integer);
	}
}
