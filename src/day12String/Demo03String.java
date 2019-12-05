package day12String;
/*String类
 * String 类代表字符串。Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现。 

字符串是常量；它们的值在创建之后不能更改。字符串缓冲区支持可变的字符串。因为 String 对象是不可变的，所以可以共享。例如： 


     String str = "abc";
 等效于： 


     char data[] = {'a', 'b', 'c'};
     String str = new String(data);
 下面给出了一些如何使用字符串的更多示例： 


     System.out.println("abc");
     String cde = "cde";
     System.out.println("abc" + cde);
     String c = "abc".substring(2,3);
     String d = cde.substring(1, 2);
 * 
 * */
public class Demo03String {
	public static void main(String[] args) {
		//相当于person a= new person()
		String str ="abc";
		str ="abc1";//应为str一旦赋值就不能够，使得"abc"变为垃圾
		System.out.print(str);
		
	}
}
