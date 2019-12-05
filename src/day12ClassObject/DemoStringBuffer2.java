package day12ClassObject;

/*StringBuffer常用的方法
 * replace()方法
 * reverse()方法
 * substring()方法
 * */
public class DemoStringBuffer2 {
	public static void main(String[] args) {
		StringBuffer a=new StringBuffer();
		a.append("true1");
		/*第一个参数开始索引，第二个为字符串长度，
		 * 第三个参数为变为什么字符串*/
		System.out.println(a.replace(0, 4, "ming"));
		//倒转字符串方法,方法返回一个字符串
		System.out.println(a.reverse());
		//截取一个字符串,从索引为参数的字符的开始，对原字符无影响
		System.out.println(a.substring(2));
		System.out.println(a);
		//截取一个字符串，从参数为第一个参数(包括)到第二个参数(不包括)的第二个参数。
		System.out.println(a.substring(1,3));
	}
}
