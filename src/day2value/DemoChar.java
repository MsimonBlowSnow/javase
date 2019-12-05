package day2value;

public class DemoChar {
	public static void main(String[] args) {
		char c = 'a';
		System.out.println(c);

		byte b = -128;//-128--127
		char c1 = 97;		//0 - 65535
		System.out.println(c1);
		//char c2=-1;//错误范围是0 - 65535
		System.out.println("Byte最大值："+Byte.MAX_VALUE+"\n"+"Byte最小值:"+Byte.MIN_VALUE);
		char c2 = 3;
		char c3 = 4;
		char c4 = 5;
		char c5 = 6;

		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);

		//char类型是否可以存储中文
		//java中采用unicode编码，char为两个字节，一个中文也是两个字节
		char c6 = '中';
		System.out.println(c6);
	}
}