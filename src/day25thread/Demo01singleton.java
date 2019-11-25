package day25thread;
/* ###25.01_多线程(单例设计模式)(掌握)
* 单例设计模式：保证类在内存中只有一个对象。

* 如何保证类在内存中只有一个对象呢？
	* (1)控制类的创建，不让其他类来创建本类的对象。private
	* (2)在本类中定义一个本类的对象。Singleton s;
	* (3)提供公共的访问方式。  public static Singleton getInstance(){return s}
* 单例写法两种：
	* (1)饿汉式 开发用这种方式。
	* 
			//饿汉式
			class Singleton {
				//1,私有构造函数
				private Singleton(){}
				//2,创建本类对象
				private static Singleton s = new Singleton();
				//3,对外提供公共的访问方法
				public static Singleton getInstance() {
					return s;
				}
				
				public static void print() {
					System.out.println("11111111111");
				}
			}
	* (2)懒汉式 面试写这种方式。多线程的问题？
	* 
			//懒汉式,单例的延迟加载模式
			class Singleton {
				//1,私有构造函数
				private Singleton(){}
				//2,声明一个本类的引用
				private static Singleton s;
				//3,对外提供公共的访问方法
				public static Singleton getInstance() {
					if(s == null)
						//线程1,线程2
						s = new Singleton();
					return s;
				}
				
				public static void print() {
					System.out.println("11111111111");
				}
			}
	* (3)第三种格式
	* 
			class Singleton {
				private Singleton() {}
			
				public static final Singleton s = new Singleton();//final是最终的意思,被final修饰的变量不可以被更改
			}

 * 
 * 
 * */
public class Demo01singleton {

}
