package day12ClassObject;

/*StringBuffer���õķ���
 * replace()����
 * reverse()����
 * substring()����
 * */
public class DemoStringBuffer2 {
	public static void main(String[] args) {
		StringBuffer a=new StringBuffer();
		a.append("true1");
		/*��һ��������ʼ�������ڶ���Ϊ�ַ������ȣ�
		 * ����������Ϊ��Ϊʲô�ַ���*/
		System.out.println(a.replace(0, 4, "ming"));
		//��ת�ַ�������,��������һ���ַ���
		System.out.println(a.reverse());
		//��ȡһ���ַ���,������Ϊ�������ַ��Ŀ�ʼ����ԭ�ַ���Ӱ��
		System.out.println(a.substring(2));
		System.out.println(a);
		//��ȡһ���ַ������Ӳ���Ϊ��һ������(����)���ڶ�������(������)�ĵڶ���������
		System.out.println(a.substring(1,3));
	}
}
