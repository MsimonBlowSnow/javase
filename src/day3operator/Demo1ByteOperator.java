package day3operator;

public class Demo1ByteOperator {
	public static void main(String[] args) {
		/*λ�����
		 * &,|,~,^,<<,>>,<<<,>>>
		 * ���е�λ����������Բ������ʽ���е�
		 * �������ֶ�������int��Ϊ�˷��������8λ����
		 * */
		System.out.println("& λ��:");
		//                            ����                         ����                     ����                     ����                     Դ��
		System.out.println(-6&3);//2  11111010&00000011 00000010 00000010 00000010
		System.out.println(7&2);//2  */
		
		System.out.println("| λ��:");
		System.out.println(-6|3);//-5 11111010|00000011 11111011 11111010 10000101
		System.out.println(5|2);//7 
		
		System.out.println("~ λ��");
		System.out.println(~6);//-7 ~00000110            11111001 10000111
		System.out.println(~2);//-3 
		
		System.out.println("^ ���");
		System.out.println(-6^2);//-8    11111010^00000010 11111000 10001000
		System.out.println(5^1);//4    00000101^00000001 00000100
		
		
		
	}
}
