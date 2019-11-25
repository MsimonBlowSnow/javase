package day29Reflect;

import java.lang.reflect.Field;

/*Field
	* Class.getField(String)�������Ի�ȡ���е�ָ���ֶ�(�ɼ���), 
	* �����˽�еĿ�����getDeclaedField("name")������ȡ,
	* ͨ��set(obj, "����")������������ָ�������ϸ��ֶε�ֵ, 
	* �����˽�е���Ҫ�ȵ���setAccessible(true)���÷���Ȩ��,
	* �û�ȡ��ָ�����ֶε���get(obj)���Ի�ȡָ�������и��ֶε�ֵ
*2.��ط���
	* Class�ķ���:getField(name);//��ȡһ������ֵ��˽�еĲ��ܻ�ȡ
	* Class�ķ���:getDeclaredField();//������ȡ��˽�е�Ҳ���Ի�ȡ
	* Field�ķ���:setAccessible(true);//ȥ��Ȩ��
 * */
public class Demo06Field {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		//��ȡ�ֽ�������ַ���
		Class class1=Class.forName("day29Reflect.Person2901");
		Class class2=Person2901.class;
		Person2901 p=new Person2901();
		Class class3= p.getClass();
		System.out.println(p);
		//��ȡ��Ա����
		//Field field=class1.getField("name"); //�׳��쳣������ִ�У�name��˽�е�
		Field field=class1.getDeclaredField("name");//������ȡ
		field.setAccessible(true);	//ȥ��Ȩ��
		field.set(p, "ming1");		//�ı�һ�����������ֵ
		System.out.println(p);
	}
}
