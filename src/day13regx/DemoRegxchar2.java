package day13regx;

public class DemoRegxchar2 {
//	Ԥ�����ַ��� 
//	. �κ��ַ������н���������ƥ��Ҳ���ܲ�ƥ�䣩 
//	\d ���֣�[0-9] 
//	\D �����֣� [^0-9] 
//	\s �հ��ַ���[ \t\n\x0B\f\r] 
//	\S �ǿհ��ַ���[^\s] 
//	\w �����ַ���[a-zA-Z_0-9] 
//	\W �ǵ����ַ���[^\w] 
	public static void main(String[] args) {
		System.out.println("a".matches("."));//true
		System.out.println("ab".matches("."));//false
		System.out.println("ab".matches(".."));//true
		System.out.println("a".matches("\\d"));//false \Ϊת���ַ�\d[0-9]
		System.out.println("a".matches("\\D"));//true
		System.out.println(" ".matches("\\s"));//true һ���ո�
		System.out.println("	".matches("\\s"));//true һ��tab
		System.out.println("    ".matches("\\s"));//false �ĸ��ո�
		System.out.println("_".matches("\\w"));//true a-zA-Z_0-9
		System.out.println("%".matches("\\W"));//true
	}
}
