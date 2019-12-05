package day10package;

public class DemoNoNameInClass {
	/** A:匿名内部类
	* 就是内部类的简化写法。
* B:前提：存在一个类或者接口
	* 这里的类可以是具体类也可以是抽象类。
* C:格式：
* 
		new 类名或者接口名(){
			重写方法;
		}
* D:本质是什么呢?
	* 是一个继承了该类或者实现了该接口的子类匿名对象。
* E:案例演示
	* 按照要求来一个匿名内部类*/
	public static void main(String[] args) {
		Outer1 a=new Outer1();
		a.method();
	}
}

interface Inter1{
	abstract public void print();
}

class  Outer1{
	
		class inter implements Inter1{
			@Override
			public void print() {
				System.out.println("内部内继承接口实现抽象方法");
			}
		}	
		
		public void method(){
			inter a= new inter();
			a.print();
			new Inter1() {
				@Override
				public void print() {
				System.out.println("直接实现接口的方法");	
				}
			}.print();
		}
	}
