package day12String;
/*String() �Ĺ��췽��
 	* String()
	��ʼ��һ���´����� String ����ʹ���ʾһ�����ַ����С� 
	
	String(byte[] bytes) 
	ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ���� byte ���飬����һ���µ� String�� 

	String(byte[] bytes, Charset charset) 
	ͨ��ʹ��ָ���� charset ����ָ���� byte ���飬����һ���µ� String�� 

	String(byte[] bytes, int offset, int length) 
	ͨ��ʹ��ƽ̨��Ĭ���ַ�������ָ���� byte �����飬����һ���µ� String�� 

	String(byte[] bytes, int offset, int length, Charset charset) 
	ͨ��ʹ��ָ���� charset ����ָ���� byte �����飬����һ���µ� String�� 

	String(byte[] bytes, int offset, int length, String charsetName) 
	ͨ��ʹ��ָ�����ַ�������ָ���� byte �����飬����һ���µ� String�� 

	String(byte[] bytes, String charsetName) 
	ͨ��ʹ��ָ���� charset ����ָ���� byte ���飬����һ���µ� String�� 

	String(char[] value) 
	����һ���µ� String��ʹ���ʾ�ַ���������е�ǰ�������ַ����С� 
	
	String(char[] value, int offset, int count) 
	����һ���µ� String��������ȡ���ַ��������һ����������ַ��� 

	String(int[] codePoints, int offset, int count) 
	����һ���µ� String�������� Unicode ������������һ����������ַ��� 
	
	String(String original) 
	��ʼ��һ���´����� String ����ʹ���ʾһ���������ͬ���ַ����У����仰˵���´������ַ����Ǹò����ַ����ĸ����� 

	String(StringBuffer buffer) 
	����һ���µ��ַ������������ַ��������������е�ǰ�������ַ����С� 
	String(StringBuilder builder)  
*/
public class Demo04String {
	public static void main(String[] args) {
		String  str =new String(new byte[]{97,98,99});
		System.out.println(str);//abc
		
		char[] a=new char[] {'a','b','c','d'};
		String Str1=new String(a);
		System.out.println(Str1);
		
		String Str12=new String(a,1,2);
		System.out.println(Str12);
		
		String Str2= new String(new byte[] {97,98,99},1,2);//��������
		System.out.println(Str2);
		
		String str3=new String("hello");
		System.out.println(str3);
	}
}
