package day10package;

import day10package.Outer.Inter;

/*•A:面试题
•按照要求，补齐代码
interface Inter { void show(); }
class Outer { //补齐代码 }
class OuterDemo {
    public static void main(String[] args) {
          Outer.method().show();
      }
}
要求在控制台输出”HelloWorld”*/



public class DemoNoInClassTest {
	public static void main(String[] args) {
		 Outer01.method().show();//链式编程，方法放回的是一个对象,所以才能继续调用方法
	} 
}

interface InterTest{
	void show();
}

class Outer01 {
	public static InterTest method() {
		return new InterTest() {
			@Override
			public void show(){
				System.out.println("HelloWorld");
			}
		};
	}
}

