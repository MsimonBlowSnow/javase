package day16List;

import java.util.LinkedList;

/* A:���������<T>
	* �ѷ��Ͷ���������
* B:�����ʽ
	* public class ����<��������1,��>
* C:ע������	
	* �������ͱ�������������
* D:������ʾ
	* �������ʹ��
 * 
 * 
 * */
public class DemoFangxing1 {
	public static void main(String[] args) {
		MyMath<String>  a=new MyMath<>();
		a.add("mmp");
		a.add("mmp1");
		a.add("mmp2");
		a.remove("mmp2");
		//a.add(1);//����ʱ�ͱ���
		System.out.println(a.toString());
	}
}

class MyMath<String>{
	private LinkedList<String> a=new LinkedList<>();
	public void add(String c) {
		a.add(c);
	}
	public void remove(String c) {
		a.remove(c);
	}
	public String get(int c) {
		return a.get(c);
	}
	@Override
	public java.lang.String toString() {
		return a.toString();
	}
	
	
}

