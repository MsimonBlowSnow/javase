package day3operator;

public class Demo1Operator {
	//&,|,^,!
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		
		//& 与
		System.out.println("& 与:");
		System.out.println(a<b&b<c);//true true&true
		System.out.println(a<b&b>c);//false true&false
		System.out.println(a>b&b<c);//false false&true
		System.out.println(a>b&b>c);//false false&false		
		
		
		// | 或
		System.out.println("| 或:"); 
		System.out.println(a<b|b<c);//true true|true
		System.out.println(a<b|b>c);//true true|false
		System.out.println(a>b|b<c);//true false|true
		System.out.println(a>b|b>c);//false false|false		
		
		// ^ 异或
		System.out.println("^ 异或:");
		System.out.println(a<b^b<c);//false true|true
		System.out.println(a<b^b>c);//true true|false
		System.out.println(a>b^b<c);//true false|true
		System.out.println(a>b^b>c);//false false|false
		
		// ! 非
		System.out.println("! 非");
		System.out.println(!true);//false
		System.out.println(!false);//true
		
		//&& 短路与
		System.out.println("&& 短路与");
		System.out.println((a++)>b&&(a++)>c);//
		System.out.println(a);//a=11  a++>b false 所以不用执行(a++)>c 不执行。 
		
		//|| 短路或
		System.out.println("|| 短路或");
		System.out.println((a++)<b||(a++)>c);
		System.out.println(a);//a=11 (a++)<b 为true 不执行
		
		
	}
}
