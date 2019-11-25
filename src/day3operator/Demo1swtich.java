package day3operator;

import java.util.Scanner;
//switch 1.7版本支持String ,
//1.5版本支持枚举
//1.7以前支持int,byte,short,char

public class Demo1swtich {
	public static void main(String[] args) {
		/*选择语句
		 * switch
		 * */
		//switch 语句
		/*Scanner sc= new Scanner(System.in);
		System.out.println("请输入一个月:");
		int a=sc.nextInt();
		switch(a){
			case 12:
			case 1:
			case 2:System.out.println("春季");break;
			case 3:
			case 4:
			case 5:System.out.println("夏季");break;
			case 6:
			case 7:
			case 8:System.out.println("秋季");break;
			case 9:
			case 10:
			case 11:System.out.println("冬季");break;
			default:
					System.out.println("输入的月份错误");break;
			
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
