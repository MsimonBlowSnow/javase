package day12ClassObject;
/*StringBuffer��String���໥ת��*/
public class DemoStringBuffer3 {
	public static void main(String[] args) {
		//Stringת��ΪStringBuffer
		System.out.println(StrChSb());
		//StringBufferת��ΪString
		SbChStr();
	}

	public static void SbChStr() {
		StringBuffer b=new StringBuffer("ming");
		//ͨ�����췽��ת��
		String c=new String(b);
		//ͨ��substring������ȡ
		String c1=b.substring(0);
		String c2=b.substring(0,b.length());
	}

	public static StringBuffer StrChSb() {
		//ͨ�����췽��ת��
		StringBuffer a=new StringBuffer("true");
		//ͨ��StringBuffer��append����ת��
		StringBuffer b=new StringBuffer();
		b.append("ming");
		return a;
	}
}
