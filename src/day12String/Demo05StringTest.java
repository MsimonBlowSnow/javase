package day12String;
/*������
 	*1. String str ="abc";
		String str1 = "abc";
		//����������û�оʹ���������str���о�ֱ������
		System.out.println(str==str1);//true,ע����true��
		System.out.println(str.equals(str1));//true
 	*2.String str =new String("abc");�����˼�������
 		*����new�˾��ڶ�����
 		*�������Ȳ鿴�����������Ƿ���"abc"��û�д���һ���ڳ��������棬Ȼ����copy һ��������������� 	
 	*3.String str=new String("ab");
 		*String str1= "ab";
 		*str1==str//false
 		*str1.eqauls(str);true
 			*ԭ��:str1��ָ�����صģ�str��ָ����ڴ��,��ֵַ��һ
 	*4.
 		�����str��str1//byte a=3+4;	//�ڱ���ʱ���Ͱ�7��ֵ����a�������Ż�����
		String str="a"+"b"+"c";	//����ʱ������ָ�����������"abc"��	
		String str1="abc";		//ָ�����������"abc".
		System.out.println(str==str1);//true
		System.out.println(str.equals(str1));//true	
 	*5.String str="ab";
		String str1="abc";
		String str2=str+"c";
		System.out.println(str1==str2);//false��str2ָ����ڴ������"abc",str1ָ�����������
		System.out.println(str2.equals(str1));//true
			*+���ȴ���һ��stringBuffer��Stringbuilder�����ڵ���append()������
			*Ȼ���ڵ���toStringװ���ַ��������Ѹ��ַ�����ֵ��str2��
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
		//byte a=3+4;	//�ڱ���ʱ���Ͱ�7��ֵ����a�������Ż�����
		String str="a"+"b"+"c";	//����ʱ������ָ�����������"abc"��	
		String str1="abc";		//ָ�����������"abc".
		System.out.println(str==str1);//true
		System.out.println(str.equals(str1));//true
	}

	private static void method3() {
		String str2=new String("ab");
		String str1="ab";
		//str2��ָ�������ģ�str1��ָ����������ģ�����==Ϊfalse��equalsΪtrue
		System.out.println(str1==str2);//false
		System.out.println(str2.equals(str1));//true
	}

	private static void method2() {
		//��������������һ���ڶ����棬һ���ڳ��������棬strָ��������(������)
		String str =new String("abc1");
	}

	private static void method1() {
		String str ="abc";
		String str1 = "abc";
		//����������û�оʹ���������str���о�ֱ������
		System.out.println(str==str1);//true,ע����true��
		System.out.println(str.equals(str1));//true
	}
}
