package day13regx;

import java.util.Date;

/* A:Date类的概述
* 类 Date 表示特定的瞬间，精确到毫秒。 
* B:构造方法
* public Date()
* public Date(long date)
* C:成员方法
* public long getTime()//获取毫秒值
* public void setTime(long time)//传入毫秒值改变时间对象
*/
public class DemoDate {
	public static void main(String[] args) {
		Date a=new Date();
		Date c=new Date(0);
		Date b=new Date(1000);
		System.out.println(a+" "+a.getTime()+" ");
		System.out.println(System.currentTimeMillis());
		System.out.println(a.getTime());
		System.out.println(b+" "+b.getTime()+" ");
		System.out.println(System.currentTimeMillis());
		System.out.println(c+" "+c.getTime()+" ");
		System.out.println(System.currentTimeMillis());
	}
}
