package day13regx;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*����ʽ����һ�����
 * ͨ��Calendar�е�Set�ѱ�Ϊ3��һ��
 * ͨ��Calendar�е�add������һ��Ϊ���·ݵ����һ��
 * ���day_of_Month���ж������껹��ƽ�ꡣ
 * */
public class IsRuanNian {
	public static void main(String[] args) throws ParseException {
		Scanner a=new Scanner(System.in);
		System.out.println("������������:��ʽΪ(YYYY)");
		String year=a.nextLine();
		int year1=Integer.parseInt(year);
		Calendar c=Calendar.getInstance();
		c.set(Calendar.YEAR, year1);
		c.set(Calendar.MONTH, 2);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		int flag=c.get(Calendar.DAY_OF_MONTH);
		if(flag==29) {
			System.out.println(year+"����һ������");
		}
		else 
			System.out.println("����һ��ƽ��"+flag);
		}
}
