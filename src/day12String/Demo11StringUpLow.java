package day12String;

import java.util.Arrays;

/*把一个字符串的首字母变成大写其他的都小写*/

/*把数组转化为字符串*/
public class Demo11StringUpLow {
	public static void main(String[] args) {
		String str ="aaadsfffffqeirrFASDDDDDDDAkkkakvchbkdd";
		System.out.println(str.substring(0,1).toUpperCase().concat(str.substring(1).toLowerCase()));
		
		int[] arr=new int[] {1,2,3,4,56};
		String str1="[";
		int i=0;
		for (i=0;i<arr.length;i++) {
			if(i!=arr.length-1)
				str1=str1+arr[i]+", ";
			else {
				str1=str1+arr[i]+"]";
			}
		}
		System.out.println(str1);
		System.out.println(Arrays.toString(arr));
	}
}
