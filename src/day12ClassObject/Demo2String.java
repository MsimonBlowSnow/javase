package day12ClassObject;

public class Demo2String {
	public static void main(String[] args) {
		String str="123456";
		String str1="u123456";
		String str2="s12345";
		String str3="a2";
		String str4=" ";
		String str5="";
		System.out.println(str.charAt(3));//放回对应索引的字符
		
		//比较两个字符串的大小,相等返回0,否者放回一个不为0的数
		System.out.println(str.compareTo(str1));
		
		//返回对应索引的acsll码
		System.out.println(str3.codePointAt(0));//97
		
		//判断是否以该字符串结尾的
		System.out.println(str2.endsWith("34"));//false
		System.out.println(str2.endsWith("345"));//true
		
		//判断是否包括该字符
		System.out.println(str1.contains("34"));//true
		System.out.println(str1.contains("314"));//false
	
		/*重写了object中的equals()方法，判断字符串是否相等
		与compareto()方法类似，一个放回int,一个放回boolean*/
		System.out.println(str1.equals("s"));//false
		System.out.println(str1.equals("u123456"));//true
		//判断字符串是否为空，不是null，shi str=="";
		System.out.println(str4.isEmpty());//false
		System.out.println(str5.isEmpty());//true
		//通过中间的分割为多个字符串
		String a[]=str2.split("4");
		System.out.println(str5);
	}
}
