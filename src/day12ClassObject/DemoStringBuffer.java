package day12ClassObject;

public class DemoStringBuffer {
/*String 和StringBuffer的区别
 * String一旦创建对象就不能在修改通过+和重新赋值是构建了另一个对象
 * StringBuffer相当于String的缓冲区，创建后可以修改。
 * */
	public static void main(String[] args) {
		String a=new String("abc");
		a="abc11";//两个对象
		for (int i=0;i<5;i++) {
			System.out.println(a.charAt(i));
		}
		
		/*四种构造方法
		 * StringBuffer():构造一个其中不带字符的字符串缓冲区，其初始容量为 16 个字符。
		 *
		 * public java.lang.StringBuilder(CharSequence seq) 
		 * 构造一个字符串缓冲区，它包含与指定的 CharSequence 相同的字符。
		 * StringBuffer(CharSequence seq));
		 *
		 *构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容。
		 * StringBuffer(String str)
		 * 
		 * 构造一个不带字符，但具有指定初始容量的字符串缓冲区。
		 * StringBuffer(int capacity)
		 * */
		StringBuffer b=new StringBuffer();
		System.out.println(b.length());//返回该缓冲区的字符串长度
		System.out.println(b.capacity());//返回该缓冲区的长度
		
		StringBuffer c=new StringBuffer(10);
		System.out.println(c.length());//0
		System.out.println(c.capacity());//10
		
		StringBuffer d=new StringBuffer("ljh");
		System.out.println(d.length());//3
		System.out.println(d.capacity());//19，字符缓冲区的初始长度+length
	}
}
