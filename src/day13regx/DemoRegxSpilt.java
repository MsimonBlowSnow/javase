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
		b=c.split(".");//.������Ϊ�����ַ�
		for(String i:b) {
			System.out.println(i.toString());
		}//Ϊ�գ���Ϊ.wΪ�����ַ�������.�и�Ҫת�壬���£�
		b=c.split("\\.");
		for(String i:b) {
			System.out.println(i.toString());
		}
	}
	
}
