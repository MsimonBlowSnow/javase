package day12ClassObject;
/*数组转化为字符串
 * 分析：可以通过String和StringBuffer两种方法
 * */
public class DemoStringBuffer4 {
	public static void main(String[] args) {
		int[] a=new int[] {1,2,3,4};
		//通过StringBuffer来转化，不会制造太多的垃圾
		System.out.println(array2String(a));
		//通过String来转化有很多垃圾String产生
		System.out.println(array2String2(a));
	}

	public static String array2String2(int[] a) {
		String b="[";
		for(int i:a) {
			if(i==a.length) {
				b=b+i+"]";//String从新赋值,使原来的String成为垃圾
			}else {
				b=b+i+",";//String从新赋值,使原来的String成为垃圾
			}
		}
		return b.substring(0,b.length());
	}

	public static String array2String(int[] a) {
		StringBuffer b=new StringBuffer();
		b.append("[");
		for(int i:a) {
			if(i==a.length) {
				b.append(i+"]");
			}else
				b.append(i+",");
		}
		return b.substring(0);
	}
}
