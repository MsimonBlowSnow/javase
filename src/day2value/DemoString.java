package day2value;
/*	String a="12456543"
 * String b="12456543";
  *  ���ڳ������Ҳ��ᴴ������,����
 * a==b(�жϵ�ֵַ)����a.equals(b)(String ���¶���equals()�������ж�����һ��);//Ϊtrue
 * 
 * 
 * String a=new string("avc");�ڶ��д�����һ������
 * String b=new string("avc");���ڶ��д�����һ������
 * a==b//false ��ֵַ��һ�� a.equals(b)//true
 * 
 * String a="1"+"2";//12
 * int c=3;
 * String b="1+"c;����new��һ������
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
