package day12String;

import java.util.Scanner;

/*1.Scanner
 	*����Scanner(InputStream); 
 	*���뷽�� nextInt,nextString(��nextһ��)��next(Ĭ��nextString)��nextLine()
 	*�жϷ�����hasnextInt 
 * */
public class Demo01Scanner {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//������жϣ���������һ����int�����׳�InputMismatchException�쳣
		/*
		 * try { 
		 * 		int a=sc.nextInt(); System.out.println(a); 
		 * } catch (Exception e) { 
		 * //TODO Auto-generated catch block 
		 * System.out.println("������"); }
		 */
		
		if (sc.hasNextInt()) {
			int a= sc.nextInt();
		}else {
			System.out.println("������");
		}
	}
}
