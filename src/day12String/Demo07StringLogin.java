package day12String;

import java.util.Scanner;

/*ģ���û�����һ������������
 * ������˺Ŷ���admin
 * ���������ʾ����������˺Ŵ������ʾʣ�����
 * */
public class Demo07StringLogin {
	public static void main(String[] args) {
		String account="admin";
		String password="admin";
		Scanner sc=new Scanner(System.in);
		int flag=3;
		while(true) {
			if(flag==0) {
				System.out.println("ӦΪ����������,����˺Ž�������");
				break;
			}
			if(flag!=3) {
				System.out.println("�㻹��"+flag+"�λ���");
			}
				System.out.println("�������˺�:");
				String str1=sc.nextLine();
				System.out.println("�������������:");
				String str2=sc.nextLine();
				if(str1.equals(account)) {
					if(str2.equals(password)) 
						break;
					else 
						System.out.println("�������!");
				}else {
					System.out.println("�˺Ŵ���!");
				}
				flag--;
		}
		if(flag!=0) {
			System.out.println("�ɹ�����");
		}
	}
}
