package day12ClassObject;
/*����ת��Ϊ�ַ���
 * ����������ͨ��String��StringBuffer���ַ���
 * */
public class DemoStringBuffer4 {
	public static void main(String[] args) {
		int[] a=new int[] {1,2,3,4};
		//ͨ��StringBuffer��ת������������̫�������
		System.out.println(array2String(a));
		//ͨ��String��ת���кܶ�����String����
		System.out.println(array2String2(a));
	}

	public static String array2String2(int[] a) {
		String b="[";
		for(int i:a) {
			if(i==a.length) {
				b=b+i+"]";//String���¸�ֵ,ʹԭ����String��Ϊ����
			}else {
				b=b+i+",";//String���¸�ֵ,ʹԭ����String��Ϊ����
			}
		}
		return b.substring(0,b.length());
	}

	public static String array2String(int[] a) {
		StringBuffer b=new StringBuffer();
		b.append("[");
		for(int i:a) {
			if(i==a.length) {
				b.append(i+"]");
			}else
				b.append(i+",");
		}
		return b.substring(0);
	}
}
