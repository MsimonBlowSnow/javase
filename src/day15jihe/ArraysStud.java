package day15jihe;

import java.util.Arrays;


public class ArraysStud {
	public static void main(String[] args) {
		Student[] a=new Student[5];
		a[0]=new Student("张三","12");
		a[1]=new Student("张三1","12");
		a[2]=new Student("张三2","12");
		a[3]=new Student("张三3","12");
		a[4]=new Student("张三4","12");
		System.out.println(Arrays.toString(a));
	}
}
 