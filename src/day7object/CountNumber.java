package day7object;

import java.lang.Math;
import java.util.Scanner;
public class CountNumber {
	public static void main(String[] args) {
		int flag=10;
		boolean flag1=false;
		int count;
		
		int flag3=10;
		Scanner sc= new Scanner(System.in);
		Munber1 mun;
		while (flag3!= 0) {
			flag1=false;
			mun= new Munber1();
			System.out.println("��ʼ��Ϸ:");
			System.out.println("������һ��1-100������������10�λ���");
			flag=10;
			while (flag != 0) {
				count = 0;
				flag--;
				count = sc.nextInt();
				if (mun.guess(count)) {
					flag1 = true;
					System.out.println("��ϲ������!");
					break;
				} else {
					if (mun.bigorsmall(count)) {
						System.out.println("�������������!");
					} else {
						System.out.println("���������С��!");
					}
				}
			}
			if (flag1) {
				System.out.println("��ϲ��¶���!");
			} else {
				System.out.println("�ܿ�ϧ,��ʧ����!��ȷ����:" + mun.getNumber1());
			}
			System.out.println("������Ƿ������[0�˳�/1����]");
			flag3 = sc.nextInt();
		}
	}
}
