package day3operator;

public class Demo1Operator {
	//&,|,^,!
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		
		//& ��
		System.out.println("& ��:");
		System.out.println(a<b&b<c);//true true&true
		System.out.println(a<b&b>c);//false true&false
		System.out.println(a>b&b<c);//false false&true
		System.out.println(a>b&b>c);//false false&false		
		
		
		// | ��
		System.out.println("| ��:"); 
		System.out.println(a<b|b<c);//true true|true
		System.out.println(a<b|b>c);//true true|false
		System.out.println(a>b|b<c);//true false|true
		System.out.println(a>b|b>c);//false false|false		
		
		// ^ ���
		System.out.println("^ ���:");
		System.out.println(a<b^b<c);//false true|true
		System.out.println(a<b^b>c);//true true|false
		System.out.println(a>b^b<c);//true false|true
		System.out.println(a>b^b>c);//false false|false
		
		// ! ��
		System.out.println("! ��");
		System.out.println(!true);//false
		System.out.println(!false);//true
		
		//&& ��·��
		System.out.println("&& ��·��");
		System.out.println((a++)>b&&(a++)>c);//
		System.out.println(a);//a=11  a++>b false ���Բ���ִ��(a++)>c ��ִ�С� 
		
		//|| ��·��
		System.out.println("|| ��·��");
		System.out.println((a++)<b||(a++)>c);
		System.out.println(a);//a=11 (a++)<b Ϊtrue ��ִ��
		
		
	}
}
