package day12String;
/*A.String类里面的判断方法
 	*boolean equals(Object obj):比较两个字符串(不包括地址值)是否相等，区分大小写
 	*boolean equalsIgnoreCase(String str):比较字符串的内容是否相等，忽略大小写
 	*boolean contains(String str)：判断大字符串里面是否包括小字符串
 	*startWith(String str):判断字符串是否以蘑菇指定字符串开头的
 	*endwith(String str):判断字符串是否已指定字符串结尾 
 	*isEmpty()判断字符串是否为空(注意为空是"",不是null)
 * 
 * */	
public class Demo06StringPanDuan {
	public static void main(String[] args) {
		String str1 =new String("abc");
		String str2=new String("abc1");
		String str="abc";
		String str3="ABC";
		//equals
		System.out.println(str1.equals(str));//true
		System.out.println(str1.equals(str3));//false
	
		//equalsIngnoreCase
		System.out.println(str1.equalsIgnoreCase(str));//true
		System.out.println(str1.equalsIgnoreCase(str3));//true
		
		//contains
		System.out.println(str2.concat(str1));//true
		System.out.println(str1.equals(str2));//false
		
		//startWith
		System.out.println(str1.startsWith("a"));//true
		System.out.println(str2.startsWith("c"));//false
		
		//endWith()
		System.out.println(str1.endsWith("a"));//false
		System.out.println(str2.endsWith("c"));//true
		
		//isEpmty
		System.out.println(str.isEmpty());//false
		str="";
		System.out.println(str.isEmpty());//true
	}
}
