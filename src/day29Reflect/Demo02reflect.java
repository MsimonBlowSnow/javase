package day29Reflect;
/*
* A:反射概述
	* JAVA反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；
	* 对于任意一个对象，都能够调用它的任意一个方法和属性；
	* 这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制。
	* 要想解剖一个类,必须先要获取到该类的字节码文件对象。
	* 而解剖使用的就是Class类中的方法，所以先要获取到每一个字节码文件对应的Class类型的对象。

* B:三种方式
	* a:Object类的getClass()方法,判断两个对象是否是同一个字节码文件
	* b:静态属性class,锁对象
	* c:Class类中静态方法forName(),读取配置文件
* C:案例演示
	* 获取class文件对象的三种方式 
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
