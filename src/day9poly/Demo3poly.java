package day9poly;
/*ʹ�ö�̬�ĺô���instanof
 * ��̬���ڴ���
 * 
 * */
public class Demo3poly {
	//ʹ�ö�̬���� �ȿ���New Cat() �ֿ���New Dog(),������ʹ�ö���
	public static void print(Animal3 a) {
		if (a instanceof Cat3) {
			Cat3 c = (Cat3) a;
			a.eat();
			c.catchMouse();
		}else if(a instanceof dog) {
			dog d=(dog) a;
			a.eat();
			d.lookhome();
		}else {
			a.eat();
		}
	}
	public static void main(String[] args) { 
		print(new Cat3());
		print(new dog());
	}
	
}

class Animal3{
	public void eat() {
		System.out.println("�Զ���");
	}
}

class Cat3 extends Animal3{
	public void eat() {
		System.out.println("è����");
	}
	public void catchMouse() {
		System.out.println("Cat can Catch mouses!");
	}
}

class dog extends Animal3{
	public void eat() {
		System.out.println("������");
	}
	public void lookhome() {
		System.out.println("Dog can look home!");
	}
}