package day9poly;
/*多态，父类变量指向子类对象
 * 1.成员变量
 * 编译看父类，运行看父类。
 * 2.成员方法
 * 编译看父类，运行看子类。
 * 3.static方法
 * 编译看父类，运行看父类。
 * */
public class Demo1poly {
	public static void main(String[] args) {
		Animal a=new Cat();
		a.eat();//吃鱼,子类
		System.out.println(a.num);//10,父类
		a.sleep();//睡觉，父类
	}
}

class Animal{
	int num=10;
	public void eat() {
		System.out.println("吃东西");
	}
	public static void sleep() {
		System.out.println("睡觉");
	}
}

class Cat extends Animal{
	int num=20;
	public void eat() {
		System.out.println("吃鱼");
	}
	public static void sleep() {
		System.out.println("不睡觉");
	}
}