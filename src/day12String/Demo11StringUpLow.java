package day12String;

import java.util.Arrays;

/*��һ���ַ���������ĸ��ɴ�д�����Ķ�Сд*/

/*������ת��Ϊ�ַ���*/
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
