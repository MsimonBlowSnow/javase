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
			 System.out.println("���Ǿ�̬�ڲ���һ�㷽��!");
		 }
		public static void inter22(){
			System.out.println("���Ǿ�̬�ⲿ�ྲ̬����!");
		}
	 }
}