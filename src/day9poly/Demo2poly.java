package day9poly;
/*
 * �۲��̬�ı׶�
 * �������ָ���������
 * ����������ķ���
 * */
public class Demo2poly {
	public static void main(String[] args) {
		Person a=new SuperMan();
		System.out.println(a.name);//����
		a.eat();//����
		//a.fly();���಻�ܵ��ø���ķ�����û�ڿ��⴩
		SuperMan superman=(SuperMan) a;
		superman.fly();//����ת��  �ڿ��⴩
	}
}

class Person{
	String name="joke";
	public void eat() {
		System.out.println("�Զ���");
	}
}

class SuperMan extends Person{
	String name ="superman";
	public void eat() {
		System.out.println("�Զ���");
	}
	public void fly() {
		System.out.println("I can fly!");
	}
}