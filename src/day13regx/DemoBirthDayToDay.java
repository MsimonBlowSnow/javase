package day13regx;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*���������������
 * ͨ���������������������һ�����˶�����
 * 
 * */
public class DemoBirthDayToDay {
	public static void main(String[] args) throws ParseException {
		Scanner a=new Scanner(System.in);
		System.out.println("�������������:��ʽ��(yyyy/MM/dd/)");
		String date12=a.nextLine();
		a.close();
		SimpleDateFormat c= new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(c.parse(date12));
		System.out.println("�������Ϊ:"+c.format(c.parse(date12)));
		Date date1=new Date();
		System.out.println("����ʱ��Ϊ:"+c.format(date1));
		long day=((date1.getTime()-c.parse(date12).getTime())/1000/3600/24);
		System.out.println("��һ������"+day+"��");
		/*String birthday = "1983��07��08��";
		String today = "2088��6��6��";
		//2,�������ڸ�ʽ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		//3,�������ַ���ת�������ڶ���
		Date d1 = sdf.parse(birthday);
		Date d2 = sdf.parse(today);
		System.out.println(sdf.format(sdf.parse(birthday)));
		//4,ͨ�����ڶ������ʱ�����ֵ
		long time = d2.getTime() - d1.getTime();
		//5,������ʱ�����ֵ�������1000,�ٳ���60,�ٳ���60,�ٳ���24�õ���
		System.out.println(time / 1000 / 60 / 60 / 24 );*/
	}
}
