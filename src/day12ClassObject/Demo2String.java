package day12ClassObject;

public class Demo2String {
	public static void main(String[] args) {
		String str="123456";
		String str1="u123456";
		String str2="s12345";
		String str3="a2";
		String str4=" ";
		String str5="";
		System.out.println(str.charAt(3));//�Żض�Ӧ�������ַ�
		
		//�Ƚ������ַ����Ĵ�С,��ȷ���0,���߷Ż�һ����Ϊ0����
		System.out.println(str.compareTo(str1));
		
		//���ض�Ӧ������acsll��
		System.out.println(str3.codePointAt(0));//97
		
		//�ж��Ƿ��Ը��ַ�����β��
		System.out.println(str2.endsWith("34"));//false
		System.out.println(str2.endsWith("345"));//true
		
		//�ж��Ƿ�������ַ�
		System.out.println(str1.contains("34"));//true
		System.out.println(str1.contains("314"));//false
	
		/*��д��object�е�equals()�������ж��ַ����Ƿ����
		��compareto()�������ƣ�һ���Ż�int,һ���Ż�boolean*/
		System.out.println(str1.equals("s"));//false
		System.out.println(str1.equals("u123456"));//true
		//�ж��ַ����Ƿ�Ϊ�գ�����null��shi str=="";
		System.out.println(str4.isEmpty());//false
		System.out.println(str5.isEmpty());//true
		//ͨ���м�ķָ�Ϊ����ַ���
		String a[]=str2.split("4");
		System.out.println(str5);
	}
}
