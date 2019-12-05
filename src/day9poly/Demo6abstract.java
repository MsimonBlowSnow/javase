package day9poly;

public class Demo6abstract {
	public static void main(String[] args) {
		Cat6 a=new Cat6(10,"汤姆");
		System.out.println(a.getAge()+a.getName());
		Dog6 c=new Dog6(8,"哮天犬");
		System.out.println(c.getAge()+a.getName());
	}
}

abstract class Animal6{
	int age;
	String name;
	abstract void eat();
	Animal6(){}
	Animal6(int age, String name){
		this.age=age;
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

class Cat6 extends Animal6{
	Cat6(){}
	Cat6(int a,String b){
		super(a,b);
	}
	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}
}

class Dog6 extends Animal6{
	Dog6(){}
	Dog6(int a,String b){
		super(a,b);
	}
	@Override
	public void eat() {
		System.out.println("狗吃肉");
	}
}