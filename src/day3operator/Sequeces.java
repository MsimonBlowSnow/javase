package day3operator;

import java.util.Scanner;

public class Sequeces {
	/*结构：
	 * 1.顺序结构
	 * 2.选择结构
	 * */
	public static void main(String[] args) {
		System.out.println("顺序结构:");
		System.out.println("顺序结构1");
		System.out.println("顺序结构2");
		
		//选择结构
		System.out.println("选择结构:");
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入一个成绩");
		int grades= sc.nextInt();
		if(grades<60) {
			System.out.println("分数:"+grades+"为不及格!");
		}
		else if(grades>60&&grades<70){
			System.out.println("分数:"+grades+"为及格!");
		}else if(grades>70&&grades<80) {
			System.out.println("分数:"+grades+"为良!");
		}else if(grades>80&&grades<90) {
			System.out.println("分数:"+grades+"为优秀!");
		}else {
			System.out.println("分数:"+grades+"非常棒!");
		}
		
	}
}
