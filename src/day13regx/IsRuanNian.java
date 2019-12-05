package day13regx;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*按格式输入一个年份
 * 通过Calendar中的Set把变为3月一日
 * 通过Calendar中的add方法减一变为二月份的最后一天
 * 输出day_of_Month来判段是闰年还是平年。
 * */
public class IsRuanNian {
	public static void main(String[] args) throws ParseException {
		Scanner a=new Scanner(System.in);
		System.out.println("请输入你的年份:格式为(YYYY)");
		String year=a.nextLine();
		int year1=Integer.parseInt(year);
		Calendar c=Calendar.getInstance();
		c.set(Calendar.YEAR, year1);
		c.set(Calendar.MONTH, 2);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		int flag=c.get(Calendar.DAY_OF_MONTH);
		if(flag==29) {
			System.out.println(year+"年是一个闰年");
		}
		else 
			System.out.println("这是一个平年"+flag);
		}
}
