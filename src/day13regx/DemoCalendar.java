package day13regx;

import java.util.Calendar;

/* Calendar ����һ�������࣬��Ϊ�ض�˲����һ������ YEAR��MONTH��DAY_OF_MONTH��HOUR �������ֶ�֮���ת���ṩ��һЩ��������Ϊ���������ֶΣ������������ڵ����ڣ��ṩ��һЩ������
* B:��Ա����
	* public static Calendar getInstance()
	* public int get(int field)
		*filed�Ĳ������� 
		* Calendar.YEAR		//���
		* Calendar.MONTH	//�·�-1 ��Ϊһ�·���0��
		* Calendar.DAY_OF_YEAR	//һ���еĵڼ���
		* Calendar.DAY_OF_MONTH	//һ�����еĵڼ���
		* Calendar.DAY_OF_WEEK	//������Ϊ0
*Calendar�е�get()set()����
*add()�޸��ֶ� 
*set()�����ֶ�
*/
public class DemoCalendar {
	public static void main(String[] args) {
		Calendar a=Calendar.getInstance();
		System.out.println(a);
		System.out.println(a.get(Calendar.YEAR));//���
		System.out.println(a.get(Calendar.MONTH));//�·�-1  ��Ϊһ�·���0��
		System.out.println(a.get(Calendar.DAY_OF_YEAR));//һ���еĵڼ���
		System.out.println(a.get(Calendar.DAY_OF_MONTH));//һ�����еĵڼ���
		System.out.println(a.get(Calendar.DAY_OF_WEEK));//������Ϊ1
		System.out.println(YYYY_XX_DD(a));
		a.set(Calendar.YEAR, 2000);//��ݱ�Ϊ2000
		System.out.println(YYYY_XX_DD(a));
		a.add(Calendar.YEAR,-1);//��ݱ�Ϊ2000-1
		System.out.println(YYYY_XX_DD(a));
	}
	private static String getWeekday(int a) {
		String[] c={"","������","����һ","���ڶ�","������","������","������","������"};
		return c[a];
	}
	private static String getMonth(int a) {
		return (a+1>9)?a+1+"��":"0"+(a+1)+"��";
	}
	private static String getDayOfMonth(int a) {
		return (a>9)?a+"��":"0"+a+"��";
	}
	private static String YYYY_XX_DD(Calendar a) {
		return a.get(Calendar.YEAR)+"��"+
		getMonth(a.get(Calendar.MONTH))+
		getDayOfMonth(a.get(Calendar.DAY_OF_MONTH))+
		getWeekday(a.get(Calendar.DAY_OF_WEEK));
		
	}
}
