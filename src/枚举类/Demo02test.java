package ö����;
/* A:������ʾ
* ����ö����Ҫ�ùؼ���enum
* ����ö���඼��Enum������
* ö����ĵ�һ���ϱ�����ö������һ��ö�����ķֺ��ǿ���ʡ�Եģ��������ö�����������Ķ���������ֺžͲ���ʡ�ԡ����鲻Ҫʡ��
* ö��������й���������������private�ģ���Ĭ�ϵ�Ҳ��private�ġ�
* ö����Ҳ�����г��󷽷�������ö���������д�÷���
* ö����switch����е�ʹ��*/
public class Demo02test {
	public static void main(String[] args) {
		//ö�ٵĵ�һ�ַ�ʽ
		method();
		//�ڶ���ö�ٵķ���
		method2();
		//������ö�ٷ���
		method3();
		Week13 monWeek1= Week13.MON;
		switch (monWeek1) {
		case MON:
			System.out.println("����һ");break;
		case TUES:
			System.out.println("���ڶ�");break;
		case WED:
			System.out.println("������");break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + monWeek1);
		}
	}

	private static void method3() {
		Week13 monWeek1= Week13.MON;
		Week13 tuesWeek1= Week13.TUES;
		Week13 wedWeek1= Week13.WED;
		monWeek1.show();
	}
	
	private static void method2() {
		Week12 monWeek1= Week12.MON;
		Week12 tuesWeek1= Week12.TUES;
		Week12 wedWeek1= Week12.WED;
		System.out.println(monWeek1.getName());
	}
	
	//�Զ���ö�ٵĵ�һ�ַ�ʽ
	private static void method() {
		Week11 monWeek1= Week11.MON;
		Week11 tuesWeek1= Week11.TUES;
		Week11 wedWeek1= Week11.WED;
	}
}
