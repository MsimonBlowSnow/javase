package day9poly;
/*��̬���������ָ���������
 * 1.��Ա����
 * ���뿴���࣬���п����ࡣ
 * 2.��Ա����
 * ���뿴���࣬���п����ࡣ
 * 3.static����
 * ���뿴���࣬���п����ࡣ
 * */
public class Demo1poly {
	public static void main(String[] args) {
		Animal a=new Cat();
		a.eat();//����,����
		System.out.println(a.num);//10,����
		a.sleep();//˯��������
	}
}

class Animal{
	int num=10;
	public void eat() {
		System.out.println("�Զ���");
	}
	public static void sleep() {
		System.out.println("˯��");
	}
}

class Cat extends Animal{
	int num=20;
	public void eat() {
		System.out.println("����");
	}
	public static void sleep() {
		System.out.println("��˯��");
	}
}