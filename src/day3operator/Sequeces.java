package day3operator;

import java.util.Scanner;

public class Sequeces {
	/*�ṹ��
	 * 1.˳��ṹ
	 * 2.ѡ��ṹ
	 * */
	public static void main(String[] args) {
		System.out.println("˳��ṹ:");
		System.out.println("˳��ṹ1");
		System.out.println("˳��ṹ2");
		
		//ѡ��ṹ
		System.out.println("ѡ��ṹ:");
		Scanner sc =new Scanner(System.in);
		System.out.println("������һ���ɼ�");
		int grades= sc.nextInt();
		if(grades<60) {
			System.out.println("����:"+grades+"Ϊ������!");
		}
		else if(grades>60&&grades<70){
			System.out.println("����:"+grades+"Ϊ����!");
		}else if(grades>70&&grades<80) {
			System.out.println("����:"+grades+"Ϊ��!");
		}else if(grades>80&&grades<90) {
			System.out.println("����:"+grades+"Ϊ����!");
		}else {
			System.out.println("����:"+grades+"�ǳ���!");
		}
		
	}
}
