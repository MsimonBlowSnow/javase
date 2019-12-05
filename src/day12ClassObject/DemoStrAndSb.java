package day12ClassObject;
/*string和StringBuffer和StringBuilder
 * 1.StringBuffer和StringBuilder都是字符串的缓存区，不过他们区别如下:
 * 		StringBuffer是一个多线程安全缓存.数度比较慢
 * 		StringBuilder一个多线程不安全的缓存,数度较快
 * 2.String和StringBuffer的传参
 * 		String虽然为引用数据类型不过传参数和基本数据类型一至
 * 		StringBuffer引用数据类型传参
 * */
public class DemoStrAndSb {
	public static void main(String[] args) {
		String a=new String("Ming");
		StringBuffer b=new StringBuffer("Ming");
		change(a);
		change1(b);
		System.out.println(a);
		System.out.println(b);
	}

	private static StringBuffer change1(StringBuffer b) {
		return b.append("handsome");
	}

	private static String change(String a) {
		return a="lalala";//改变了指向对象
	}
}
