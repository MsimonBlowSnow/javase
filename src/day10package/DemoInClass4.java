package day10package;

public class DemoInClass4 {
		public static void main(String[] args) {
			Outer4 o = new Outer4();
			o.method();
		}
}
		
//�ֲ��ڲ���
class Outer4 {
		public void method() {
			final int num = 10;//���붨��Ϊfinal
			class Inner {
				public void print() {
					System.out.println(num);//����ʱfinal�ſ��Է���
				}
			}

			Inner i = new Inner();
			i.print();
		}

		/*public void run() {
			Inner i = new Inner();				//�ֲ��ڲ���,ֻ���������ڵķ����з���
			i.print();
		}*/
	}
