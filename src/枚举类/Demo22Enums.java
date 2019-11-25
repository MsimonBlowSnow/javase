package ö����;
/** A:ö����ĳ�������
	* int ordinal(	//ö���඼���б�ŵ�
	* int compareTo(E o) //�Ƚϱ��
	* String name()  
	* String toString()
	* <T> T valueOf(Class<T> type,String name)
	* values() 
	* �˷�����Ȼ��JDK�ĵ��в��Ҳ�������ÿ��ö���඼���и÷�����������ö���������ö��ֵ�ǳ�����
* B:������ʾ
	* ö����ĳ�������
*/
public class Demo22Enums {
	public static void main(String[] args) {
		method1();
		//valueOf(Class<T> type,String name) ͨ���ֽ����ļ���ȡö����
		Week13 aWeek13=Week13.valueOf(Week13.class,"MON");
		System.out.println(aWeek13);
		//values()�������,values()��������ö���������ж���
		Week13[] a=Week13.values();
		for (Week13 week13 : a) {
			System.out.println(week13);
		}
	}

	private static void method1() {
		Week13 monWeek1= Week13.MON;
		Week13 tuesWeek1= Week13.TUES;
		Week13 wedWeek1= Week13.WED;
		
		//ö���඼���б�ŵ�
		System.out.println(monWeek1.ordinal());
		System.out.println(tuesWeek1.ordinal());
		System.out.println(wedWeek1.ordinal());
		
		//�Ƚϱ��
		System.out.println(monWeek1.compareTo(wedWeek1));
		System.out.println(tuesWeek1.compareTo(monWeek1));
		System.out.println(wedWeek1.compareTo(monWeek1));
		
		//��ȡ����
		System.out.println(monWeek1.name());
		System.out.println(tuesWeek1.name());
		System.out.println(wedWeek1.name());
		
		//��дtoString()����
		System.out.println(monWeek1);
		System.out.println(tuesWeek1);
		System.out.println(wedWeek1);
	}
}
