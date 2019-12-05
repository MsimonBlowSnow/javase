package day2value;
/*	String a="12456543"
 * String b="12456543";
  *  是在常量中找不会创建对象,所以
 * a==b(判断地址值)或者a.equals(b)(String 重新定义equals()方法，判断内容一致);//为true
 * 
 * 
 * String a=new string("avc");在堆中创建了一个对象
 * String b=new string("avc");又在堆中创建了一个对象
 * a==b//false 地址值不一样 a.equals(b)//true
 * 
 * String a="1"+"2";//12
 * int c=3;
 * String b="1+"c;重新new了一个对象
 * 
 */
public class DemoString {
	public static void main(String[] args) {
		String a,b;
		a="1";
		b="1";
		System.out.println(a==b);//true
		a=new String("1");
		System.out.println(a==b);//false
		
	}
}
