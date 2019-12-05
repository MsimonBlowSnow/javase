package day17set;
/*程序启动后, 可以从键盘输入接收多个整数, 直到输入quit时结束输入. 把所有输入的整数倒序排列打印.
*/

import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetTest2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		TreeSet<Integer> tree =new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int num=o2-o1;//倒序打印，返回正数，o1在前面 ，负数o1在后面
				return num==0?1:num;
			}
		});
		int flag=0;
		while (true) {
			String str=sc.nextLine();
			if(str.equals("quit"))
				break;
			else
				try{
					flag=Integer.parseInt(str);
					tree.add(flag);
				}catch (Exception e) {
					System.out.println("请输入数字");
				}
				
		}
		for (Integer integer : tree) {
			System.out.print(integer+" ");
		}
	}
}
