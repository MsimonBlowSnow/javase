package day29Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/*Constructor
	* Class���newInstance()������ʹ�ø����޲εĹ��캯����������, 
	* ���һ����û���޲εĹ��캯��, �Ͳ�������������,
	* ���Ե���Class���getConstructor(String.class,int.class)������ȡһ��ָ���Ĺ��캯��
	* Ȼ���ٵ���Constructor���newInstance("����",20)������������
*ͨ���ֽ������������newInstancce()����
	*�÷���ֻ����ղ������죬����ֽ������û�пղ�������ͻᱨ��
*/
public class Demo05ReflectContructorHas {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class class1=Person2901.class;	  //����.class ��ȡclass�ֽ���
		Class class0=Class.forName("day29Reflect.Person2901");  //ͨ��Class.forName(����)��ȡ�ֽ���
	 	Class class2= new Person2901().getClass(); //ͨ�������ȡ�ֽ���
	 	
	 	//newInstance()��ȡ�ղ�������ʵ��,���������û�пղι��췽���ͻᱨ��
	 	Person2901 person1=(Person2901) class0.newInstance();
	 	System.out.println(person1);
	 	
	 	//ͨ����ȡ���췽��������ö���
	 	//��֪������Ĳ�������getConstructors();��ȡ�������ݽ��б���
	 	  Constructor aConstructor=class1.getConstructor(String.class,int.class,String.class);
	 	  person1 =(Person2901) aConstructor.newInstance("С��",19,"��");
	 	  System.out.println(person1);
	}
}
