package day16List;

import java.util.ArrayList;
import java.util.List;

/* 泛型的由来:通过Object转型问题引入
* 早期的Object类型可以接收任意的对象类型，但是在实际的使用中，会有类型转换的问题。
*也就存在这隐患，所以Java提供了泛型来解决这个安全问题。
*通过使用范型使集合统一致。如下:
*/
public class DemoFangXing2 {
	public static void main(String[] args) {
		List a =new ArrayList();
		a.add(1);
		a.add("1");
		a.add(new Student("1","1"));
		for(Object i:a) {
			Student c=(Student)i;//向下转型,不能判断是否是Student的子类，
			//集合没用泛型不报错，执行有错,1和"1"不是Student对象 ClassCastException
			//如果使用泛型,在编译期就会报错，用eclip直接可以看到
			System.out.println(c);
		}
	}
}
