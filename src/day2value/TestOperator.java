package day2value;

public class TestOperator {
	public static void main(String[] args) {
		System.out.println("��һ��:");
		int a = 10;
		int b = 10;
		int c = 10;
	
		a = b++;					//a = 10 ,b = 11
		c = --a;					//a = 9, c = 9			
		b = ++a;					//a = 10, b = 10	
		a = c--;					//a = 9, c = 8			
		
		System.out.println("a = " + a + ",b = " + b + ",c = " + c);

		System.out.println("�ڶ���");
		int x = 4;
		//		4	+	6+	60
		int y = (x++)+(++x)+(x*10);//70

		System.out.println("x = " + x + ",y = " +  y);

		System.out.println("���������ľ�ᱨ��,Ϊʲô ");
		byte u= 10;
		u++;					//b = (byte)(b + 1)
		//u = u + 1;				//��byte��int���л�������ʱ��,������Ϊint����,����int��ӵĽ������int,��ֵ��byte����ʧ����
		System.out.println("b = " + b);
		
		System.out.println("������:������ĳ����Ƿ������⣬��������⣬��ָ����˵������");
				//short s=1;s = s+1;			//��short��int���������ʱ��,������Ϊint����,����int������ӵĽ��Ҳ��int����
				short s=1;s+=1;					//s = (short)(s + 1);

				System.out.println(s);
	}
}
