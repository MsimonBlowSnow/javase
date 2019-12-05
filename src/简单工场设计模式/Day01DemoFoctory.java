package 简单工场设计模式;
/* A:工厂方法模式概述
 	* 工厂方法模式中抽象工厂类负责定义创建对象的接口，具体对象的创建工作由继承抽象工厂的具体类实现。
* B:优点
	* 客户端不需要在负责对象的创建，从而明确了各个类的职责，如果有新的对象增加，
	* 只需要增加一个具体的类和具体的工厂类即可，不影响已有的代码，后期维护容易，增强了系统的扩展性
* C:缺点
	* 需要额外的编写代码，增加了工作量
* D:案例演示
* 
	动物抽象类：public abstract Animal { public abstract void eat(); }
	工厂接口：public interface Factory {public abstract Animal createAnimal();}
	具体狗类：public class Dog extends Animal {}
	具体猫类：public class Cat extends Animal {}
	开始，在测试类中每个具体的内容自己创建对象，但是，创建对象的工作如果比较麻烦，
	就需要有人专门做这个事情，所以就知道了一个专门的类来创建对象。发现每次修改代码太麻烦，
	用工厂方法改进，针对每一个具体的实现提供一个具体工厂。
	狗工厂：public class DogFactory implements Factory {
		public Animal createAnimal() {…}
	        }
	猫工厂：public class CatFactory implements Factory {
		public Animal createAnimal() {…}
	        }  */
public class Day01DemoFoctory {
	public static void main(String[] agrs) {
		Day01Dog adog=(Day01Dog) Day01Foctory.Amianl("Dog");
		Day01Cat aCat=(Day01Cat) Day01Foctory.Amianl("Cat");
		adog.eat();
		aCat.eat();
	}
}
