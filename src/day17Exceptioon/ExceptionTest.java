package day17Exceptioon;
/* ����¼��һ��int���͵�����,����������Ʊ�����ʽ
* ���¼�����������,������ʾ,¼�����������������¼��һ������BigInteger
* ���¼�����С��,������ʾ,¼�����С��,������¼��һ������
* ���¼����������ַ�,������ʾ,¼����ǷǷ��ַ�,������¼��һ������*/

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ��int������");
		int flag=0;
		int intnum=0;
		String str;
		BigInteger bignum;
		while(true) {
			str=sc.nextLine();
			if(str.equals("quit"))
				break;
			try {
			if(flag==0) {
				intnum=Integer.parseInt(str);
			}}catch(NumberFormatException e) {
				try {
					new BigInteger(str);
					System.out.println("�������̫����");
				}catch (Exception sfd) {
					try {
						new BigDecimal(str);
						System.out.println("����С����Ч������������");
					}catch(Exception sfd1) {
						System.out.println("������ַ�Ϊ�Ƿ��ַ�");
					}
					}
			}
			
		}
	}
}
