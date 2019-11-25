package day5array;

import java.util.Arrays;

/*fill()·½·¨
 * 
 * 
 * */
public class Demo1Array1 {
	public static void main(String[] args) {
		int[] a=new int[3];
		Arrays.fill(a,8);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
