package day12ClassObject;

public class DemoStringBuffer {
/*String ��StringBuffer������
 * Stringһ����������Ͳ������޸�ͨ��+�����¸�ֵ�ǹ�������һ������
 * StringBuffer�൱��String�Ļ�����������������޸ġ�
 * */
	public static void main(String[] args) {
		String a=new String("abc");
		a="abc11";//��������
		for (int i=0;i<5;i++) {
			System.out.println(a.charAt(i));
		}
		
		/*���ֹ��췽��
		 * StringBuffer():����һ�����в����ַ����ַ��������������ʼ����Ϊ 16 ���ַ���
		 *
		 * public java.lang.StringBuilder(CharSequence seq) 
		 * ����һ���ַ�������������������ָ���� CharSequence ��ͬ���ַ���
		 * StringBuffer(CharSequence seq));
		 *
		 *����һ���ַ��������������������ݳ�ʼ��Ϊָ�����ַ������ݡ�
		 * StringBuffer(String str)
		 * 
		 * ����һ�������ַ���������ָ����ʼ�������ַ�����������
		 * StringBuffer(int capacity)
		 * */
		StringBuffer b=new StringBuffer();
		System.out.println(b.length());//���ظû��������ַ�������
		System.out.println(b.capacity());//���ظû������ĳ���
		
		StringBuffer c=new StringBuffer(10);
		System.out.println(c.length());//0
		System.out.println(c.capacity());//10
		
		StringBuffer d=new StringBuffer("ljh");
		System.out.println(d.length());//3
		System.out.println(d.capacity());//19���ַ��������ĳ�ʼ����+length
	}
}
