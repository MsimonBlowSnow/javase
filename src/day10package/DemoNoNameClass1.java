package day10package;

/*�����ڲ�����������дһ������,�Ҳ�������ת�͡�
 * ����
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
		
		Inter2 a=new Inter2() {//��������ָ���������
			@Override
			public void print1() {
				System.out.println("��������ָ���������print1");
			}
			@Override
			public void print2() {
				System.out.println("��������ָ���������print2");
			}
			public void print3() {
				System.out.println("print3");
			}
		};
		a.print1();
		a.print2();
		//a.print3();//����������ָ������󣬲�������ת��
	}
}
