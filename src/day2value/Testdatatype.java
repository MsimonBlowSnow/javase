package day2value;
/*ת����ϵ
 * byte char short --int--long--float--double
 * 
 * 
 * */
public class Testdatatype {
	public static void main(String[] args) {
		//������:������ĳ����Ƿ������⣬��������⣬��ָ����˵�����ɡ�
		byte b1 = 3;
		byte b2 = 4;
		//byte b3 = b1 + b2;//����
		/*
		��������
		1,byte��byte(��short,char)���������ʱ�������Ϊint,����int������ӵĽ��Ҳ��int����
		2,b1��b2����������,�����洢��ֵ�Ǳ仯,�ڱ����ʱ���޷��ж���������ֵ,����п��ܻᳬ��byte��ȡֵ��Χ
		*/
		//System.out.println(b3);
		byte b4 = 3 + 4;			//��ȷ��java�������г����Ż�����
		//byte b4 = 7;
		System.out.println(b4);
		
		//float��long
		float a=1.2f;
		long b=1000L;
		a=b;
		//b=a;����long��floatС���ᶪʧ����
	}
}
