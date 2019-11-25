package day12ClassObject;
/*StringBuffer和String的相互转化*/
public class DemoStringBuffer3 {
	public static void main(String[] args) {
		//String转化为StringBuffer
		System.out.println(StrChSb());
		//StringBuffer转化为String
		SbChStr();
	}

	public static void SbChStr() {
		StringBuffer b=new StringBuffer("ming");
		//通过构造方法转化
		String c=new String(b);
		//通过substring方法截取
		String c1=b.substring(0);
		String c2=b.substring(0,b.length());
	}

	public static StringBuffer StrChSb() {
		//通过构造方法转化
		StringBuffer a=new StringBuffer("true");
		//通过StringBuffer的append方法转化
		StringBuffer b=new StringBuffer();
		b.append("ming");
		return a;
	}
}
