package day13regx;

public class DemoRegxChar {
//	[abc] a��b �� c�����ࣩ 
//	[^abc] �κ��ַ������� a��b �� c���񶨣� 
//	[a-zA-Z] a �� z �� A �� Z����ͷ����ĸ�������ڣ���Χ�� 
//	[a-d[m-p]] a �� d �� m �� p��[a-dm-p]�������� 
//	[a-z&&[def]] d��e �� f�������� 
//	[a-z&&[^bc]] a �� z������ b �� c��[ad-z]����ȥ�� 
//	[a-z&&[^m-p]] a �� z������ m �� p��[a-lq-z]����ȥ�� 
	public static void main(String[] args) {
		String regx="[a-z&&[^m-p]]";
		System.out.println("a".matches(regx));
		System.out.println("ab".matches(regx));
	}
	
}
