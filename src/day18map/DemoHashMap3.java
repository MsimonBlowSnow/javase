package day18map;

import java.util.HashMap;
import java.util.Map;

/*HashMap �洢�Զ������
 * �ڼ��������Զ��������ô��֤�Զ������Ψһ��
 * ͨ��Student����д��hashcode()������equals��֤����Ψһ��
 * */
public class DemoHashMap3 {
	public static void main(String[] args) {
		Map<Student,String> a=new HashMap<>();
		a.put(new Student(12,"liming"), "����");
		a.put(new Student(12,"liming"), "����");//ȥ��ͨ��Student����д��hashcode()������equals
		a.put(new Student(14,"lishi"), "�Ϻ�");
		a.put(new Student(13,"liwu"), "����");
		System.out.println(a);
	}	
}




