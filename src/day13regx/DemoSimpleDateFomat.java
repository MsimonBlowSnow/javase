package day13regx;
/*DateFormat��SimpleDateFormat�ĳ�����,
 * DateFormatֻ�ṩ����protect���εĹ��췽��������ʹ��
 *  A:DateFormat��ĸ���
	* DateFormat ������/ʱ���ʽ������ĳ����࣬�����������޹صķ�ʽ��ʽ�����������ڻ�ʱ�䡣�ǳ����࣬����ʹ��������SimpleDateFormat
* B:SimpleDateFormat���췽��
	* public SimpleDateFormat()//Ĭ�ϸ�ʽ
	* public SimpleDateFormat(String pattern)//�Լ����Ƹ�ʽ
* C:��Ա����
	* public final String format(Date date)//����date��ʱ��
	* public Date parse(String source)//��sourceת��Ϊָ����ʽ��ʱ�����
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
		String source="2019/8/15 ����9:17";
		SimpleDateFormat b=new SimpleDateFormat();
		SimpleDateFormat b1=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		System.out.println(c);
		System.out.println(b.format(c));
		System.out.println(b1.format(c));
		System.out.println(b.parse(source));//����һ��date
		System.out.println(b1.format(b.parse(source)));
	}
}
