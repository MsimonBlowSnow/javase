package day2value;

public class DemoChar {
	public static void main(String[] args) {
		char c = 'a';
		System.out.println(c);

		byte b = -128;//-128--127
		char c1 = 97;		//0 - 65535
		System.out.println(c1);
		//char c2=-1;//����Χ��0 - 65535
		System.out.println("Byte���ֵ��"+Byte.MAX_VALUE+"\n"+"Byte��Сֵ:"+Byte.MIN_VALUE);
		char c2 = 3;
		char c3 = 4;
		char c4 = 5;
		char c5 = 6;

		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);

		//char�����Ƿ���Դ洢����
		//java�в���unicode���룬charΪ�����ֽڣ�һ������Ҳ�������ֽ�
		char c6 = '��';
		System.out.println(c6);
	}
}