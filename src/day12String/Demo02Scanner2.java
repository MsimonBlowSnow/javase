package day12String;

import java.util.Scanner;

/*Scanner��С���⣺
 *����: ������һ��Scannerʱ,����nextInt()����һ��int,����nextline()����һ��String�������
 	*ԭ��
 		*ScannerĬ����"\r\n"������������һ������ʱ������enter��ʱ�ڶ����ַ����ǿ��ַ���
 	*
 	*�������:
 		*1.��������Scanner
 		*2�ȶ���nextLine()��������������Integer.parseInt()ת��(�Ƽ�)
 *��������������������������������������������������������������������������������������������
 *ע�����
 *Scanner���洫����Ϊsystem.inʱ����Ҫ�������ر�����system.in�͹ر��ˣ�ӦΪϵͳĬ��һ��System.in��
 * */
public class Demo02Scanner2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("������һ������:");
		int a=sc.nextInt();
		System.out.println(a);
		System.out.println("������һ���ַ���:");
		String str=sc.nextLine();
		System.out.println(str.equals(""));//true ԭ��
		//ScannerĬ����"\r\n"������������һ������ʱ������enter��ʱ�ڶ����ַ����ǿ��ַ���
		//�������һ(���Ƽ�)ռ�ڴ�
		
		System.out.println("=============��һ�ַ���========================");
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		System.out.println("������һ������:");
		int a1=sc1.nextInt();
		System.out.println(a);
		System.out.println("������һ���ַ���:");
		String str1=sc2.nextLine();
		System.out.println(a1+" "+str1);
		
		
		//���������(�Ƽ�)
		System.out.println("=============�ڶ��ַ���========================");
		Scanner sc3= new Scanner(System.in);
		int a3=Integer.parseInt(sc3.nextLine());
		String str3= sc3.nextLine();
		System.out.println(a+" "+str1);
	}
}
