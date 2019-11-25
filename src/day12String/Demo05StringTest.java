package day12String;
/*面试题
 	*1. String str ="abc";
		String str1 = "abc";
		//常量池里面没有就创建对象如str，有就直接引用
		System.out.println(str==str1);//true,注意是true，
		System.out.println(str.equals(str1));//true
 	*2.String str =new String("abc");创建了几个对象
 		*凡是new了就在堆里面
 		*两个，先查看常量池里面是否有"abc"，没有创建一个在常量池里面，然后在copy 一个副本进入堆里面 	
 	*3.String str=new String("ab");
 		*String str1= "ab";
 		*str1==str//false
 		*str1.eqauls(str);true
 			*原因:str1是指向常量池的，str是指向堆内存的,地址值不一
 	*4.
 		下面的str和str1//byte a=3+4;	//在编译时，就把7赋值给了a，常理优化机制
		String str="a"+"b"+"c";	//编译时，就是指向常量池里面的"abc"。	
		String str1="abc";		//指向常量池里面的"abc".
		System.out.println(str==str1);//true
		System.out.println(str.equals(str1));//true	
 	*5.String str="ab";
		String str1="abc";
		String str2=str+"c";
		System.out.println(str1==str2);//false，str2指向堆内存里面的"abc",str1指向常量池里面的
		System.out.println(str2.equals(str1));//true
			*+是先创建一个stringBuffer或Stringbuilder对象在调用append()方法，
			*然后在调用toString装化字符串，并把该字符串赋值给str2，
			*
	*/
public class Demo05StringTest {
	public static void main(String[] args) {
		//method1();
		
		method2();
		
		method3();
		
		method4();
		
		method5();
	}

	private static void method5() {
		String str="ab";
		String str1="abc";
		String str2=str+"c";
		System.out.println(str1==str2);
		System.out.println(str2.equals(str1));
	}

	private static void method4() {
		//byte a=3+4;	//在编译时，就把7赋值给了a，常理优化机制
		String str="a"+"b"+"c";	//编译时，就是指向常量池里面的"abc"。	
		String str1="abc";		//指向常量池里面的"abc".
		System.out.println(str==str1);//true
		System.out.println(str.equals(str1));//true
	}

	private static void method3() {
		String str2=new String("ab");
		String str1="ab";
		//str2是指向堆里面的，str1是指向常量池里面的，所以==为false，equals为true
		System.out.println(str1==str2);//false
		System.out.println(str2.equals(str1));//true
	}

	private static void method2() {
		//创建了两个对象，一个在堆里面，一个在常量池里面，str指向堆里面的(即副本)
		String str =new String("abc1");
	}

	private static void method1() {
		String str ="abc";
		String str1 = "abc";
		//常量池里面没有就创建对象如str，有就直接引用
		System.out.println(str==str1);//true,注意是true，
		System.out.println(str.equals(str1));//true
	}
}
