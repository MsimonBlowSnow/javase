package day10package;

/*匿名内部类适用于重写一个方法,且不能向下转型。
 * 例如
 * 
 * */
public class DemoNoNameClass1 {
	public static void main(String[] args) {
		OuterNoname2 a=new OuterNoname2();
		a.method();
	}
}

interface Inter2{
	abstract void print1();
	abstract void print2();
}

class OuterNoname2{
	public void method() {
		new Inter2() {

			@Override
			public void print1() {
				System.out.println("print1");
			}

			@Override
			public void print2() {
				System.out.println("print2");
			}
		}.print1();
		
		new Inter2() {

			@Override
			public void print1() {
				System.out.println("print1");
			}

			@Override
			public void print2() {
				System.out.println("print2");
			}
		}.print2();
		
		Inter2 a=new Inter2() {//父类引用指向子类对象
			@Override
			public void print1() {
				System.out.println("父类引用指向子类对象：print1");
			}
			@Override
			public void print2() {
				System.out.println("父类引用指向子类对象：print2");
			}
			public void print3() {
				System.out.println("print3");
			}
		};
		a.print1();
		a.print2();
		//a.print3();//错误父类引用指子类对象，不能向下转型
	}
}
