package day17set;

import java.util.HashSet;
import java.util.Set;

/*����ʵ�� Set �ӿڣ��ɹ�ϣ��ʵ������һ�� HashMap ʵ����֧�֡�
 * ������֤ set �ĵ���˳���ر���������֤��˳���ò��䡣��������ʹ�� null Ԫ�ء� (û�й̶�˳������)
 * set ���ܴ洢һ���Ķ��󣬷���Ż�false
 * */
public class DemoHashSet {
	public static void main(String[] args) {
		Set<String> a= new HashSet<>();
		boolean c=a.add("1");
		boolean c1=a.add("1");//�ظ��Żش���
		a.add("3");
		a.add("4");
		a.add("2");
		a.add("5");
		System.out.println(c);
		System.out.println(c1);
		for(String string:a) {
			System.out.println(string);
		}
	}
}
