package day13regx;
/* A:Math�����
* Math ���������ִ�л�����ѧ����ķ����������ָ����������ƽ���������Ǻ����� 
* B:��Ա����
* public static int abs(int a)//ȡ����ֵ
* public static double ceil(double a)//���ڻ��ߵ���a����С����
* public static double floor(double a)//С�ڻ���ڵ���С����
* public static int max(int a,int b) min��ѧ
* public static double pow(double a,double b)
* public static double random()
* public static int round(float a) ����Ϊdouble����ѧ
* public static double sqrt(double a)
*/
import java.math.*;
public class DemoMath {
	public static void main(String[] args) {
		System.out.println(Math.abs(-10));//10����ֵ
		System.out.println(Math.PI);//PI=3.1415926
		System.out.println(Math.ceil(8.9));//9����ȡ��
		System.out.println(Math.floor(8.9));//8����ȡ��
		System.out.println(Math.max(10,8));//10���Ƚ�������С�����ش��
		System.out.println(Math.min(10, 8));//8,�Ƚ�������С������С��
		System.out.println(Math.pow(10,3));//1000 ����10^3
		System.out.println(Math.round(9.8));//10 ��������
		System.out.println(Math.sqrt(4));//2 ��������ƽ����
		for(int i=0;i<10;i++) {
			System.out.println(Math.random());// ���ش����ŵ� double ֵ����ֵ���ڵ��� 0.0 ��С�� 1.0��
		}
	}
}
