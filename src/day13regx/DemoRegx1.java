package day13regx;
/* ��ָһ��������������ƥ��һϵ�з���ĳ���﷨������ַ����ĵ����ַ�����
 * ��ʵ����һ�ֹ������Լ������Ӧ�á�
* ����:����ע������,�������û���������,һ���������Ƴ���,
* ������Ƴ��ȵ��������������ʽ����
*/

/* ����У��qq����.
* 1:Ҫ�������5-15λ����
* 2:0���ܿ�ͷ
* 3:���붼������
* a:��������ʽʵ��
* b:������ʽʵ��
* String flag="[1-9]\\d{4,14}";
* */

public class DemoRegx1 {
	public static void main(String[] args) {
		String a="123456781121";
		String b="01212212";
		System.out.println(regxqq(a));
		System.out.println(regxqq(b));
		System.out.println(noregxqq(a));
		System.out.println(noregxqq(b));
	}

	private static boolean noregxqq(String a) {
		char[] c=a.toCharArray();
		if(c[0]!='0') {
			if(c.length<=15) {
				for(char i:c) {
					if(!(i<'9'&&i>'0')) {
						return false;
					}
					return true;
				}
			}
		
		}
		return false;
	}

	private static boolean regxqq(String a) {
		String flag="[1-9]\\d{4,14}";
		return a.matches(flag);
	}
	
}
