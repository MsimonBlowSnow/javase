package day29Reflect;
/*
* A:�������
	* JAVA���������������״̬�У���������һ���࣬���ܹ�֪���������������Ժͷ�����
	* ��������һ�����󣬶��ܹ�������������һ�����������ԣ�
	* ���ֶ�̬��ȡ����Ϣ�Լ���̬���ö���ķ����Ĺ��ܳ�Ϊjava���Եķ�����ơ�
	* Ҫ�����һ����,������Ҫ��ȡ��������ֽ����ļ�����
	* ������ʹ�õľ���Class���еķ�����������Ҫ��ȡ��ÿһ���ֽ����ļ���Ӧ��Class���͵Ķ���

* B:���ַ�ʽ
	* a:Object���getClass()����,�ж����������Ƿ���ͬһ���ֽ����ļ�
	* b:��̬����class,������
	* c:Class���о�̬����forName(),��ȡ�����ļ�
* C:������ʾ
	* ��ȡclass�ļ���������ַ�ʽ 
 * */
public class Demo02reflect {
	public static void main(String[] args) throws ClassNotFoundException {
		Class class1=Class.forName("java.lang.String");
		Class class2=String.class;
		String aString="mmp";
		Class class3=aString.getClass();
		System.out.println(class1==class2);
		System.out.println(class2==class3);
	}
}
