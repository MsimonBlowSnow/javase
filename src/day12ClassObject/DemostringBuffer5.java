package day12ClassObject;

import java.util.Scanner;

/*
 * 将字符串反转

 * */
public class DemostringBuffer5 {
	public static void main(String[] args) {
		String a=new String("ming");
		//通过方法把String进行反转
		StringArray(a);
		Scanner b= new Scanner(System.in);
		String c=b.nextLine();//获取一行数据
		StringArray(c);
	}

	public static void StringArray(String a) {
		StringBuffer b=new StringBuffer(a);
		System.out.println(b.reverse().toString());
	}
}
