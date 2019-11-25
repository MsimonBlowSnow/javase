package day29Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo07Methods {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class class1=Class.forName("day29Reflect.Person2901");
		Class class2=Person2901.class;
		Person2901 aPerson2901=new Person2901("明",12,"男");
		Class class3 =aPerson2901.getClass();
		
		//获取无参参数eat()方法
		Method aMethod=class1.getMethod("eat");
		aMethod.invoke(aPerson2901);
		
		//获取有参数的eat(int num);
		Method bMethod=class1.getMethod("eat",int.class); //获取有参参数的eat(int num)方法
		bMethod.invoke(aPerson2901,10);
		
	}
}

