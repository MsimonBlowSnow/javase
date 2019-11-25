package day9poly;
/*
 * 观察多态的弊端
 * 父类变量指向子类对象
 * 不能用子类的方法
 * */
public class Demo2poly {
	public static void main(String[] args) {
		Person a=new SuperMan();
		System.out.println(a.name);//父类
		a.eat();//子类
		//a.fly();子类不能调用父类的方法，没内裤外穿
		SuperMan superman=(SuperMan) a;
		superman.fly();//向上转型  内裤外穿
	}
}

class Person{
	String name="joke";
	public void eat() {
		System.out.println("吃东西");
	}
}

class SuperMan extends Person{
	String name ="superman";
	public void eat() {
		System.out.println("吃东西");
	}
	public void fly() {
		System.out.println("I can fly!");
	}
}