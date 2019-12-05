package day29Reflect;

import java.lang.reflect.Field;

/*Field
	* Class.getField(String)方法可以获取类中的指定字段(可见的), 
	* 如果是私有的可以用getDeclaedField("name")方法获取,
	* 通过set(obj, "李四")方法可以设置指定对象上该字段的值, 
	* 如果是私有的需要先调用setAccessible(true)设置访问权限,
	* 用获取的指定的字段调用get(obj)可以获取指定对象中该字段的值
*2.相关方法
	* Class的方法:getField(name);//获取一个属性值，私有的不能获取
	* Class的方法:getDeclaredField();//暴力获取，私有的也可以获取
	* Field的方法:setAccessible(true);//去处权限
 * */
public class Demo06Field {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		//获取字节码的三种方法
		Class class1=Class.forName("day29Reflect.Person2901");
		Class class2=Person2901.class;
		Person2901 p=new Person2901();
		Class class3= p.getClass();
		System.out.println(p);
		//获取成员变量
		//Field field=class1.getField("name"); //抛出异常，不能执行，name是私有的
		Field field=class1.getDeclaredField("name");//暴力获取
		field.setAccessible(true);	//去处权限
		field.set(p, "ming1");		//改变一个对象的属性值
		System.out.println(p);
	}
}
