package day9poly;
/*使用多态的好处和instanof
 * 多态用于传递
 * 
 * */
public class Demo3poly {
	//使用多态参数 既可以New Cat() 又可以New Dog(),当参数使用对象
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
		System.out.println("吃东西");
	}
}

class Cat3 extends Animal3{
	public void eat() {
		System.out.println("猫吃鱼");
	}
	public void catchMouse() {
		System.out.println("Cat can Catch mouses!");
	}
}

class dog extends Animal3{
	public void eat() {
		System.out.println("狗吃肉");
	}
	public void lookhome() {
		System.out.println("Dog can look home!");
	}
}