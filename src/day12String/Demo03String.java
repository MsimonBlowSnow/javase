package day12String;
/*String��
 * String ������ַ�����Java �����е������ַ�������ֵ���� "abc" ������Ϊ�����ʵ��ʵ�֡� 

�ַ����ǳ��������ǵ�ֵ�ڴ���֮���ܸ��ġ��ַ���������֧�ֿɱ���ַ�������Ϊ String �����ǲ��ɱ�ģ����Կ��Թ������磺 


     String str = "abc";
 ��Ч�ڣ� 


     char data[] = {'a', 'b', 'c'};
     String str = new String(data);
 ���������һЩ���ʹ���ַ����ĸ���ʾ���� 


     System.out.println("abc");
     String cde = "cde";
     System.out.println("abc" + cde);
     String c = "abc".substring(2,3);
     String d = cde.substring(1, 2);
 * 
 * */
public class Demo03String {
	public static void main(String[] args) {
		//�൱��person a= new person()
		String str ="abc";
		str ="abc1";//ӦΪstrһ����ֵ�Ͳ��ܹ���ʹ��"abc"��Ϊ����
		System.out.print(str);
		
	}
}
