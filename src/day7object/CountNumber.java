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
			System.out.println("开始游戏:");
			System.out.println("请输入一个1-100的整数，你有10次机会");
			flag=10;
			while (flag != 0) {
				count = 0;
				flag--;
				count = sc.nextInt();
				if (mun.guess(count)) {
					flag1 = true;
					System.out.println("恭喜你答对了!");
					break;
				} else {
					if (mun.bigorsmall(count)) {
						System.out.println("你输入的数大了!");
					} else {
						System.out.println("你输入的数小了!");
					}
				}
			}
			if (flag1) {
				System.out.println("恭喜你猜对了!");
			} else {
				System.out.println("很可惜,你失败了!正确答案是:" + mun.getNumber1());
			}
			System.out.println("请决定是否继续：[0退出/1继续]");
			flag3 = sc.nextInt();
		}
	}
}
