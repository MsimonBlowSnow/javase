package day16List;

import java.util.ArrayList;
import java.util.List;

/* ���͵�����:ͨ��Objectת����������
* ���ڵ�Object���Ϳ��Խ�������Ķ������ͣ�������ʵ�ʵ�ʹ���У���������ת�������⡣
*Ҳ�ʹ���������������Java�ṩ�˷�������������ȫ���⡣
*ͨ��ʹ�÷���ʹ����ͳһ�¡�����:
*/
public class DemoFangXing2 {
	public static void main(String[] args) {
		List a =new ArrayList();
		a.add(1);
		a.add("1");
		a.add(new Student("1","1"));
		for(Object i:a) {
			Student c=(Student)i;//����ת��,�����ж��Ƿ���Student�����࣬
			//����û�÷��Ͳ�����ִ���д�,1��"1"����Student���� ClassCastException
			//���ʹ�÷���,�ڱ����ھͻᱨ����eclipֱ�ӿ��Կ���
			System.out.println(c);
		}
	}
}
