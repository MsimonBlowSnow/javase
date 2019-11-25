package day29Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/*Constructor
	* Class类的newInstance()方法是使用该类无参的构造函数创建对象, 
	* 如果一个类没有无参的构造函数, 就不能这样创建了,
	* 可以调用Class类的getConstructor(String.class,int.class)方法获取一个指定的构造函数
	* 然后再调用Constructor类的newInstance("张三",20)方法创建对象
*通过字节码对象来调用newInstancce()构造
	*该方法只用与空参数构造，如果字节码的类没有空参数构造就会报错
*/
public class Demo05ReflectContructorHas {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class class1=Person2901.class;	  //类名.class 获取class字节码
		Class class0=Class.forName("day29Reflect.Person2901");  //通过Class.forName(类名)获取字节码
	 	Class class2= new Person2901().getClass(); //通过对象获取字节码
	 	
	 	//newInstance()获取空参数构造实例,如果对象中没有空参构造方法就会报错
	 	Person2901 person1=(Person2901) class0.newInstance();
	 	System.out.println(person1);
	 	
	 	//通过获取构造方法来构造该对象，
	 	//不知道构造的参数就用getConstructors();获取构造数据进行遍历
	 	  Constructor aConstructor=class1.getConstructor(String.class,int.class,String.class);
	 	  person1 =(Person2901) aConstructor.newInstance("小明",19,"男");
	 	  System.out.println(person1);
	}
}
