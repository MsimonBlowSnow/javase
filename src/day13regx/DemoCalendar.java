package day13regx;

import java.util.Calendar;

/* Calendar 类是一个抽象类，它为特定瞬间与一组诸如 YEAR、MONTH、DAY_OF_MONTH、HOUR 等日历字段之间的转换提供了一些方法，并为操作日历字段（例如获得下星期的日期）提供了一些方法。
* B:成员方法
	* public static Calendar getInstance()
	* public int get(int field)
		*filed的参数类型 
		* Calendar.YEAR		//年份
		* Calendar.MONTH	//月份-1 以为一月份用0了
		* Calendar.DAY_OF_YEAR	//一年中的第几天
		* Calendar.DAY_OF_MONTH	//一个月中的第几天
		* Calendar.DAY_OF_WEEK	//星期日为0
*Calendar中的get()set()方法
*add()修改字段 
*set()设置字段
*/
public class DemoCalendar {
	public static void main(String[] args) {
		Calendar a=Calendar.getInstance();
		System.out.println(a);
		System.out.println(a.get(Calendar.YEAR));//年份
		System.out.println(a.get(Calendar.MONTH));//月份-1  因为一月份用0了
		System.out.println(a.get(Calendar.DAY_OF_YEAR));//一年中的第几天
		System.out.println(a.get(Calendar.DAY_OF_MONTH));//一个月中的第几天
		System.out.println(a.get(Calendar.DAY_OF_WEEK));//星期日为1
		System.out.println(YYYY_XX_DD(a));
		a.set(Calendar.YEAR, 2000);//年份变为2000
		System.out.println(YYYY_XX_DD(a));
		a.add(Calendar.YEAR,-1);//年份变为2000-1
		System.out.println(YYYY_XX_DD(a));
	}
	private static String getWeekday(int a) {
		String[] c={"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		return c[a];
	}
	private static String getMonth(int a) {
		return (a+1>9)?a+1+"月":"0"+(a+1)+"月";
	}
	private static String getDayOfMonth(int a) {
		return (a>9)?a+"号":"0"+a+"号";
	}
	private static String YYYY_XX_DD(Calendar a) {
		return a.get(Calendar.YEAR)+"年"+
		getMonth(a.get(Calendar.MONTH))+
		getDayOfMonth(a.get(Calendar.DAY_OF_MONTH))+
		getWeekday(a.get(Calendar.DAY_OF_WEEK));
		
	}
}
