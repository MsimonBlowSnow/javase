package ö����;
/* A:ö�ٸ���
* ��ָ��������ֵһһ�г���,������ֵֻ�����оٳ�����ֵ�ķ�Χ�ڡ�������һ��ֻ��7�죬һ��ֻ��12���µȡ�
* B:���뵥�����ģʽ����������һ����ֻ��һ��ʵ��
* ��ô���������һ�����ж��ʵ�������������޸�����ʵ�����������޸�����ʵ�����������ö���ࡣ
* C:������ʾ
* �Լ�ʵ��ö����
1,�Զ���װ��
2,����
3,�ɱ����
4,��̬����
5,��ǿforѭ��
6,������
7,ö��
*/	
public class Demo01test {
	public static void main(String[] args) {
		//�Զ���ö�ٵĵ�һ�ַ�ʽ
		method();
		//�ڶ����Զ���ö�ٵķ���
		method2();
		//�������Զ���ö�ٷ���
		method3();
	}

	private static void method3() {
		Week03 monWeek1= Week03.MON;
		Week03 tuesWeek1= Week03.TUES;
		Week03 wedWeek1= Week03.WED;
		monWeek1.show();
	}
	
	private static void method2() {
		Week02 monWeek1= Week02.MON;
		Week02 tuesWeek1= Week02.TUES;
		Week02 wedWeek1= Week02.WED;
		System.out.println(monWeek1.getName());
	}
	
	//�Զ���ö�ٵĵ�һ�ַ�ʽ
	private static void method() {
		Week01 monWeek1= Week01.MON;
		Week01 tuesWeek1= Week01.TUES;
		Week01 wedWeek1= Week01.WED;
	}
}
