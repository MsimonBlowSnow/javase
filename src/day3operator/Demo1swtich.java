package day3operator;

import java.util.Scanner;
//switch 1.7�汾֧��String ,
//1.5�汾֧��ö��
//1.7��ǰ֧��int,byte,short,char

public class Demo1swtich {
	public static void main(String[] args) {
		/*ѡ�����
		 * switch
		 * */
		//switch ���
		/*Scanner sc= new Scanner(System.in);
		System.out.println("������һ����:");
		int a=sc.nextInt();
		switch(a){
			case 12:
			case 1:
			case 2:System.out.println("����");break;
			case 3:
			case 4:
			case 5:System.out.println("�ļ�");break;
			case 6:
			case 7:
			case 8:System.out.println("�＾");break;
			case 9:
			case 10:
			case 11:System.out.println("����");break;
			default:
					System.out.println("������·ݴ���");break;
			
		}*/
		int x = 2;
		int y = 3;
		switch(x){
			
			default:
				y++;
				case 3:
				y++;
				case 4:
				y++;
		}
		System.out.println("y="+y);//y=6
	}
}
