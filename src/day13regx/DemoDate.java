package day13regx;

import java.util.Date;

/* A:Date��ĸ���
* �� Date ��ʾ�ض���˲�䣬��ȷ�����롣 
* B:���췽��
* public Date()
* public Date(long date)
* C:��Ա����
* public long getTime()//��ȡ����ֵ
* public void setTime(long time)//�������ֵ�ı�ʱ�����
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
