package day12ClassObject;
/*string��StringBuffer��StringBuilder
 * 1.StringBuffer��StringBuilder�����ַ����Ļ�����������������������:
 * 		StringBuffer��һ�����̰߳�ȫ����.���ȱȽ���
 * 		StringBuilderһ�����̲߳���ȫ�Ļ���,���ȽϿ�
 * 2.String��StringBuffer�Ĵ���
 * 		String��ȻΪ�����������Ͳ����������ͻ�����������һ��
 * 		StringBuffer�����������ʹ���
 * */
public class DemoStrAndSb {
	public static void main(String[] args) {
		String a=new String("Ming");
		StringBuffer b=new StringBuffer("Ming");
		change(a);
		change1(b);
		System.out.println(a);
		System.out.println(b);
	}

	private static StringBuffer change1(StringBuffer b) {
		return b.append("handsome");
	}

	private static String change(String a) {
		return a="lalala";//�ı���ָ�����
	}
}
