package day15jihe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/*�⣺
 * ͨ�����������������е�Ԫ�أ������
 * ming ���ں������һ�� handsome
 * Iterator ��û��add()���������ö�̬
 * ListIterator���и÷���
 * */
public class DemoLsitIterator {
	public static void main(String[] args) {
		List<String> a=new ArrayList<>();
		a.add("Lihua");
		a.add("Ming");
		a.add("DingXiang");
		a.add("ChenXiang");
		a.add("YanJian");
		a.add("NaZe");
		a.add("HongHaiEr");
		/*Iterator c=a.iterator();
		while(c.hasNext()) {
			String str=(String) c.next();//����ת��
			if(str.equals("Ming")) {
				a.add("handsome");
				//ConcurrentModificationException
				//�����޸��쳣
			}
		}*/
		ListIterator c=a.listIterator();
		while(c.hasNext()) {
			String str=(String) c.next();//����ת��
			if(str.equals("Ming")) {
				/* ����ͨ��List�������
				 * a.add("handsome"); 
				 * ConcurrentModificationException 
				 * �����޸��쳣
				 */
				//ListIterator�ṩ��һ�����������
				c.add("Handsome");			
			}
		}
		System.out.println(a);
	}
}
