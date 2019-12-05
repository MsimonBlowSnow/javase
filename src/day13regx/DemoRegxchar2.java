package day13regx;

public class DemoRegxchar2 {
//	预定义字符类 
//	. 任何字符（与行结束符可能匹配也可能不匹配） 
//	\d 数字：[0-9] 
//	\D 非数字： [^0-9] 
//	\s 空白字符：[ \t\n\x0B\f\r] 
//	\S 非空白字符：[^\s] 
//	\w 单词字符：[a-zA-Z_0-9] 
//	\W 非单词字符：[^\w] 
	public static void main(String[] args) {
		System.out.println("a".matches("."));//true
		System.out.println("ab".matches("."));//false
		System.out.println("ab".matches(".."));//true
		System.out.println("a".matches("\\d"));//false \为转义字符\d[0-9]
		System.out.println("a".matches("\\D"));//true
		System.out.println(" ".matches("\\s"));//true 一个空格
		System.out.println("	".matches("\\s"));//true 一个tab
		System.out.println("    ".matches("\\s"));//false 四个空格
		System.out.println("_".matches("\\w"));//true a-zA-Z_0-9
		System.out.println("%".matches("\\W"));//true
	}
}
