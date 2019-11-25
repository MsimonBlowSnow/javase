package day12String;
/*A.String��������жϷ���
 	*boolean equals(Object obj):�Ƚ������ַ���(��������ֵַ)�Ƿ���ȣ����ִ�Сд
 	*boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ȣ����Դ�Сд
 	*boolean contains(String str)���жϴ��ַ��������Ƿ����С�ַ���
 	*startWith(String str):�ж��ַ����Ƿ���Ģ��ָ���ַ�����ͷ��
 	*endwith(String str):�ж��ַ����Ƿ���ָ���ַ�����β 
 	*isEmpty()�ж��ַ����Ƿ�Ϊ��(ע��Ϊ����"",����null)
 * 
 * */	
public class Demo06StringPanDuan {
	public static void main(String[] args) {
		String str1 =new String("abc");
		String str2=new String("abc1");
		String str="abc";
		String str3="ABC";
		//equals
		System.out.println(str1.equals(str));//true
		System.out.println(str1.equals(str3));//false
	
		//equalsIngnoreCase
		System.out.println(str1.equalsIgnoreCase(str));//true
		System.out.println(str1.equalsIgnoreCase(str3));//true
		
		//contains
		System.out.println(str2.concat(str1));//true
		System.out.println(str1.equals(str2));//false
		
		//startWith
		System.out.println(str1.startsWith("a"));//true
		System.out.println(str2.startsWith("c"));//false
		
		//endWith()
		System.out.println(str1.endsWith("a"));//false
		System.out.println(str2.endsWith("c"));//true
		
		//isEpmty
		System.out.println(str.isEmpty());//false
		str="";
		System.out.println(str.isEmpty());//true
	}
}
