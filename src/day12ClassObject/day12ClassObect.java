package day12ClassObject;

import com.ming.domain.User;

/*Object 对象
 * 该对象是所有的无父类的默认继承对象里,
 * 该对象面有这几种常用的方法
 * hashCode(),toString(),getClass(),equals等方法
 * hashcode():返回一个对象的hash值
 * getClass():返回一个对象的字节码文件,通过这个可以生成一个对象
 * toString():不重写的情况下是getClass().getName()+"@"+ Integer.toHexString(hashCode())
 * equals():object中equals方法没有经过重写，所以object中equals方法比较的是两个对象的地址值，和==一样
 * 一般建议重写，如和String对象和DemoStudHelp中的equals()方法一样。
 * ==与equals()的区别
 * equals()只能比较引用值,并且在没有重写之前和==差不多，比较地址值
 * */

public class day12ClassObect {

	public static void main(String[] args) {
		Object a = new Object();
		User b = new User();// 通过自己做的jar包创建对象
		System.out.println(a.toString());
		System.out.println(b.hashCode());
		System.out.println(b.getClass().getName());
		DemoStudHelp c = new DemoStudHelp("张三", "27");
		DemoStudHelp d = new DemoStudHelp("张三", "27");
		System.out.println(d.toString());//经重写
		System.out.println(c.equals(d));//true,没重写比地址值时为false，
										//但是该方法已经重写
	}

}
