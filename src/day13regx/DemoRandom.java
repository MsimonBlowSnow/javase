package day13regx;

import java.util.Random;

/*Random
 * ���Ź���
 * Random();//��������ֵ�����������
 * Random(int n);�������Ӳ��������
 * */
public class DemoRandom {
	public static void main(String[] args) {
		Random a=new Random();
		Random b= new Random(10);
		Random c=new Random(10);
		System.out.println(a.nextInt());//�������һ���������
		System.out.println(a.nextInt(100));//�������һ��0-99����
		System.out.println(b.nextInt());//�������һ���������
		System.out.println(c.nextInt());//�������һ���������
		System.out.println(b.nextInt(100));//�������һ��0-99�������
		System.out.println(c.nextInt(100));//�������һ��0-99�������
		System.out.println("bc�������������ȣ�ӦΪ������һ����");
	}
}
