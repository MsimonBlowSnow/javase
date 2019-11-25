package day13regx;

import java.util.Arrays;

public class TestString2String {
	public static void main(String[] args) {
		String a="33 44 22 11 77 55 66 88 99";
		int flag=0;
		String[] c=a.split(" ");
		int[] b=new int[c.length];
		for(String i:c) {
			b[flag]=Integer.parseInt(i);
			flag++;
		}
		Arrays.sort(b);//≈≈–Ú
		
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<b.length;i++) {
			if(i!=b.length)
				sb.append(b[i]+" ");
			else 
				sb.append(b[i]);
		}
		System.out.println(sb.toString());
	}
}
