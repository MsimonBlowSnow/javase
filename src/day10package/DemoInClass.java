package day10package;
/** A:内部类概述
* B:内部类访问特点
	* a:内部类可以直接访问外部类的成员，包括私有。
	* b:外部类要访问内部类的成员，必须创建对象。
	* 外部类名.内部类名 对象名 = 外部类对象.内部类对象;
* C:案例演示
	* 内部类极其访问特点
*/
public class DemoInClass {
	public static void main(String[] args) {
		Outer.Inter a=new Outer().new Inter();
		a.method();
		Outer2 b=new Outer2();
		b.Omethod();
	}
}

class Outer{
	private int num1;
	class Inter{
		int num;///////
		public void method() {
			System.out.println("我是内部类");
		}
	}
	
}

//成员内部类是由使用
class Outer2{
	private int num1;
	private class Inter2{
		int num;///////
		public void method() {
			System.out.println("我是内部类2");
		}
	}
	public void Omethod() {
		Inter2 in2=new Inter2();
		in2.method();	
	}
	
}