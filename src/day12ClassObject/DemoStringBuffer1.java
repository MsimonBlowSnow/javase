package day12ClassObject;

//StringBuffer �������󣬻ᴴ��һ����ڴ棬����Ϊ16���ַ�����
//�ٵ�����ӷ���ʱ���ᴴ��
/*StringBuffer�еĳ��ö��󷽷�
 * append();
 * insert(int a,String b)
 * toString()
 *delete()
 *deleteCharAt()
 * */
public class DemoStringBuffer1 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("abc");
		StringBuffer sb1=sb.append(true);
		StringBuffer sb2=sb.append("ming");
		StringBuffer sb3=sb.append("��Ы");
		//sb,sb1,sb2,sb3�ĸ�����ͬһ��������StringBuffer
		//��д��toString����
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		//����������ָ���ַ���,����������Χ����ᱨ��
		sb3.insert(1, "lalala");
		System.out.println(sb3);
		//ɾ��ָ���������ַ�
		System.out.println(sb3.deleteCharAt(2));
		//delete ɾ���ӵ�һ���������������ڶ�������,�Ż�ɾ������ַ�
		System.out.println(sb.delete(0,3));
		//����ַ���(0,length())
		System.out.println(sb.delete(0, sb3.length()));
		
		/*sb3=new StringBuffer();
		 * �����ø÷���������ø÷�����գ��ᵼ����һ�������������
		 * �����´�����һ������,�˷��ڴ�
		 * */
		
	}
}
