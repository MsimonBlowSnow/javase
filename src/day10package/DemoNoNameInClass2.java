package day10package;

public class DemoNoNameInClass2 {
	public static void method(interNo3 a) {
		a.print();
	}
	
	public static void main(String[] args) {
		Inter31 a=new Inter31();
		method(a);
		method(new interNo3(){
			@Override
			public void print() {
				System.out.println("ͨ��ʵ�ִ��������ڲ���");
			}
		});
	}
}

interface interNo3{
	abstract public void print();
}

class Inter31 implements interNo3{
	@Override
	public void print() {
		System.out.println("ͨ������ʵ�ֽӿ�");		
	}
}