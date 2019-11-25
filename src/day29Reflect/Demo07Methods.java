package day29Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo07Methods {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class class1=Class.forName("day29Reflect.Person2901");
		Class class2=Person2901.class;
		Person2901 aPerson2901=new Person2901("��",12,"��");
		Class class3 =aPerson2901.getClass();
		
		//��ȡ�޲β���eat()����
		Method aMethod=class1.getMethod("eat");
		aMethod.invoke(aPerson2901);
		
		//��ȡ�в�����eat(int num);
		Method bMethod=class1.getMethod("eat",int.class); //��ȡ�вβ�����eat(int num)����
		bMethod.invoke(aPerson2901,10);
		
	}
}

