package day15jihe;

import java.util.ArrayList;
import java.util.Collection;

/** A:������ʾ	
		����������ʾ
		  
		boolean add(E e)//���һ������������ʲô�������Ͷ�����
		boolean remove(Object o)//�Ƴ�һ������
		void clear()//��ռ���
		boolean contains(Object o)//�Ƿ�����ö���
		boolean isEmpty()//�жϼ����Ƿ��ǿյ�
		int size()//���ؼ����ڶ���ĸ���

* B:ע��:
* 
		collectionXxx.javaʹ����δ�����򲻰�ȫ�Ĳ���.
		ע��:Ҫ�˽���ϸ��Ϣ,��ʹ�� -Xlint:unchecked���±���.
		java��������Ϊ�ó�����ڰ�ȫ����
		��ܰ��ʾ:�ⲻ�Ǳ���ʧ��,�����Ȳ������,��ѧ�˷������֪���� 
 * */
@SuppressWarnings({ "rawtypes", "unchecked" })//��ѧ�˷������֪����
public class DemoArrayList{
	public static void main(String[] args) {
		Collection a=new ArrayList();
		a.add("mmp");
		a.add(1);//Arraylist����ֵһ����true
		a.add("laji");
		if(a.contains("mmp")) {
			System.out.println("��Ҷ���������!");
		}
		System.out.println(a.toString()+a.size());
		a.remove(1);
		System.out.println(a.toString()+a.size());
		a.clear();
		if(a.isEmpty()) {
			System.out.println("����һ���ռ���!");
		}
		if(a.contains("mmp")) {
			System.out.println("��Ҷ���������!");
		}
	}
}

