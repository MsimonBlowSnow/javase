package day2value;

public class Demodatatype {
	public static void main(String[] args) {
		//��������
		byte b = 10;			//ռһ���ֽ�,-128 �� 127
		short s = 20;			//ռ�����ֽ�
		int i = 30;				//ռ�ĸ��ֽ�			����Ĭ�ϵ��������;���int����
		long x = 8888888888L;	//ռ�˸��ֽ�	���long���ͺ����L���б�ʶ��üӴ�L,��ΪСl̫��һ��
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(x);
		System.out.println("int�����ֵ:"+Integer.MAX_VALUE+"\n"+"int����Сֵ:"+Integer.MIN_VALUE);
		System.out.println(2111111111+2111111111);//-72745074,Խ��
		//��һ��L��ΪLong�ͣ���ֹԽ��
		System.out.println(2111111111+2111111111L);
		//��������
		float f = 12.3F;		//ռ�ĸ��ֽ� Ĭ��С��Ϊdouble,����floatҪ��f
		double d = 33.4;		//ռ�˸��ֽ�			С��Ĭ�ϵ�����������double,double���ͺ���Ҳ������D��d��ʶ,����һ�㲻��
		System.out.println(f);
		System.out.println(d);

		//�ַ�����
		char c = 'a';			//ռ�����ֽڣ����Դ溺�֣���Ϊ��unicod����,���ܴ�գ�0-9��A-z���������
		System.out.println(c);

		//��������
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
	}
}
