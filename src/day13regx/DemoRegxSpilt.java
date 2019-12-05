package day13regx;

public class DemoRegxSpilt {
	public static void main(String[] args) {
		String[] b;
		/*String a= "1 2 3 4 5 6 7";
		b=a.split(" ");
		for(String i:b) {
			System.out.println(i.toString());
		}*/
		String c="1.2.3.4.5.6.7.8.9";
		b=c.split(".");//.的正则为任意字符
		for(String i:b) {
			System.out.println(i.toString());
		}//为空，以为.w为任意字符，想用.切割要转义，如下：
		b=c.split("\\.");
		for(String i:b) {
			System.out.println(i.toString());
		}
	}
	
}
