package day2value;

public class DemodatatypeConversion {
	public static void main(String[] args) {
		//��������ת��֮��ʽת��

		/*int x = 3;
		byte b = 4;

		x = x + b;

		System.out.println(x);*/

		//��������ת��֮ǿ��ת��
		/*int x = 3;
		byte b = 4;

		b = (byte)(x + b);
		System.out.println(b);*/

		//00000000 00000000 00000000 10000010			130�Ķ�����
		//10000010										-126����
		//00000001										+1����
		//10000001										-126����
		//11111110										-126ԭ��
		
		//01111110
		//126����     +4����=-126�Ĳ���
		//01111110+00000100=10000010
		byte b = (byte)(126 + 4);
		System.out.println(b);//-126
		//00000000 00000000 00000001 00101100			300�Ķ�����
		//00101100
		byte b2 = (byte)300;
		System.out.println(b2);
		
		//System.out.println('a' + 1);			//98,��Ϊ��ASCII���,a�ַ���Ӧ����int���͵�97
				//System.out.println((char)('a' + 1));

				System.out.println("hello"+'a'+1);		//�κ�����������+���ַ��������Ӷ�������µ��ַ���
				System.out.println('a'+1+"hello");

				System.out.println(" 5 + 5 = " + (5 + 5));
	}
}
