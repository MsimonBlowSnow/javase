package day10package;

public class DemoInClass4 {
		public static void main(String[] args) {
			Outer4 o = new Outer4();
			o.method();
		}
}
		
//局部内部类
class Outer4 {
		public void method() {
			final int num = 10;//必须定义为final
			class Inner {
				public void print() {
					System.out.println(num);//必须时final才可以访问
				}
			}

			Inner i = new Inner();
			i.print();
		}

		/*public void run() {
			Inner i = new Inner();				//局部内部类,只能在其所在的方法中访问
			i.print();
		}*/
	}
