package day13regx;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*你来到世界多少天
 * 通过输入你的生日来计算你一共活了多少天
 * 
 * */
public class DemoBirthDayToDay {
	public static void main(String[] args) throws ParseException {
		Scanner a=new Scanner(System.in);
		System.out.println("请输入你的生日:格式如(yyyy/MM/dd/)");
		String date12=a.nextLine();
		a.close();
		SimpleDateFormat c= new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(c.parse(date12));
		System.out.println("你的生日为:"+c.format(c.parse(date12)));
		Date date1=new Date();
		System.out.println("现在时间为:"+c.format(date1));
		long day=((date1.getTime()-c.parse(date12).getTime())/1000/3600/24);
		System.out.println("你一共活了"+day+"天");
		/*String birthday = "1983年07月08日";
		String today = "2088年6月6日";
		//2,定义日期格式化对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		//3,将日期字符串转换成日期对象
		Date d1 = sdf.parse(birthday);
		Date d2 = sdf.parse(today);
		System.out.println(sdf.format(sdf.parse(birthday)));
		//4,通过日期对象后期时间毫秒值
		long time = d2.getTime() - d1.getTime();
		//5,将两个时间毫秒值相减除以1000,再除以60,再除以60,再除以24得到天
		System.out.println(time / 1000 / 60 / 60 / 24 );*/
	}
}
