package day2value;

public class DemoOperator {
	public static void main(String[] args) {
		int a=3;
		/*���������
		 * + - * / % ++ --
 		 */ 
		System.out.println(10/3);//3������������������  
		System.out.println(10/3.0);//������double����ת��Ϊdouble���ٳ�
		System.out.println(-12%5);//-2 ����λ�͵�һ����һ��
		System.out.println(12%-5);//2 ����λ�͵�һ����һ��
		System.out.println(++a);//�ȼ�һ������
		System.out.println(a++);//���һ������
		//��ϵ���������booleanֵ
		System.out.println(4 == 3);
		System.out.println(4 != 3);
		System.out.println(4 > 4);
		System.out.println(4 >= 4);
		System.out.println(4 < 3);
		System.out.println(4 <= 3);
	}
}
