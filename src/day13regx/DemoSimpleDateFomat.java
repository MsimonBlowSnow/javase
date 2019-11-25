package day13regx;
/*DateFormat是SimpleDateFormat的抽象父类,
 * DateFormat只提供了有protect修饰的构造方法让子类使用
 *  A:DateFormat类的概述
	* DateFormat 是日期/时间格式化子类的抽象类，它以与语言无关的方式格式化并解析日期或时间。是抽象类，所以使用其子类SimpleDateFormat
* B:SimpleDateFormat构造方法
	* public SimpleDateFormat()//默认格式
	* public SimpleDateFormat(String pattern)//自己控制格式
* C:成员方法
	* public final String format(Date date)//输入date的时间
	* public Date parse(String source)//把source转化为指定格式的时间对象
 * 
 * 
 * */
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoSimpleDateFomat {
	public static void main(String[] args) throws ParseException {
		DateFormat a=DateFormat.getDateInstance();
		Date c=new Date();
		String source="2019/8/15 上午9:17";
		SimpleDateFormat b=new SimpleDateFormat();
		SimpleDateFormat b1=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println(c);
		System.out.println(b.format(c));
		System.out.println(b1.format(c));
		System.out.println(b.parse(source));//返回一个date
		System.out.println(b1.format(b.parse(source)));
	}
}
