package day12ClassObject;

import java.util.Scanner;

/*
 * ���ַ�����ת

 * */
public class DemostringBuffer5 {
	public static void main(String[] args) {
		String a=new String("ming");
		//ͨ��������String���з�ת
		StringArray(a);
		Scanner b= new Scanner(System.in);
		String c=b.nextLine();//��ȡһ������
		StringArray(c);
	}

	public static void StringArray(String a) {
		StringBuffer b=new StringBuffer(a);
		System.out.println(b.reverse().toString());
	}
}
