package day10package;

public class DemoInClass2 {
	public static void main(String[] args) {
		Outer21.Inter21.inter22();
		Outer21.Inter21 a=new Outer21.Inter21();
		a.method21();
	}
}

class Outer21{
	private int num;
	 static class Inter21{///
		 public void method21() {
			 System.out.println("我是静态内部类一般方法!");
		 }
		public static void inter22(){
			System.out.println("我是静态外部类静态方法!");
		}
	 }
}