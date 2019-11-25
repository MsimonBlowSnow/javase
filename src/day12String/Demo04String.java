package day12String;
/*String() 的构造方法
 	* String()
	初始化一个新创建的 String 对象，使其表示一个空字符序列。 
	
	String(byte[] bytes) 
	通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String。 

	String(byte[] bytes, Charset charset) 
	通过使用指定的 charset 解码指定的 byte 数组，构造一个新的 String。 

	String(byte[] bytes, int offset, int length) 
	通过使用平台的默认字符集解码指定的 byte 子数组，构造一个新的 String。 

	String(byte[] bytes, int offset, int length, Charset charset) 
	通过使用指定的 charset 解码指定的 byte 子数组，构造一个新的 String。 

	String(byte[] bytes, int offset, int length, String charsetName) 
	通过使用指定的字符集解码指定的 byte 子数组，构造一个新的 String。 

	String(byte[] bytes, String charsetName) 
	通过使用指定的 charset 解码指定的 byte 数组，构造一个新的 String。 

	String(char[] value) 
	分配一个新的 String，使其表示字符数组参数中当前包含的字符序列。 
	
	String(char[] value, int offset, int count) 
	分配一个新的 String，它包含取自字符数组参数一个子数组的字符。 

	String(int[] codePoints, int offset, int count) 
	分配一个新的 String，它包含 Unicode 代码点数组参数一个子数组的字符。 
	
	String(String original) 
	初始化一个新创建的 String 对象，使其表示一个与参数相同的字符序列；换句话说，新创建的字符串是该参数字符串的副本。 

	String(StringBuffer buffer) 
	分配一个新的字符串，它包含字符串缓冲区参数中当前包含的字符序列。 
	String(StringBuilder builder)  
*/
public class Demo04String {
	public static void main(String[] args) {
		String  str =new String(new byte[]{97,98,99});
		System.out.println(str);//abc
		
		char[] a=new char[] {'a','b','c','d'};
		String Str1=new String(a);
		System.out.println(Str1);
		
		String Str12=new String(a,1,2);
		System.out.println(Str12);
		
		String Str2= new String(new byte[] {97,98,99},1,2);//两个索引
		System.out.println(Str2);
		
		String str3=new String("hello");
		System.out.println(str3);
	}
}
