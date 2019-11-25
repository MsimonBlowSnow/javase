package jdks;

import day8object.test;

/** 接口中可以定义有方法体的方法,如果是非静态,必须用default修饰	
* 如果是静态的就不用了


		局部内部类在访问他所在方法中的局部变量必须用final修饰,为什么?
		因为当调用这个方法时,局部变量如果没有用final修饰,他的生命周期和方法的生命周期是一样的,
		当方法弹栈,这个局部变量也会消失,那么如果局部内部类对象还没有马上消失想用这个局部变量,就没有了,
		如果用final修饰会在类加载的时候进入常量池,即使方法弹栈,常量池的常量还在,也可以继续使用
 * 
 * */
public class Jdk18 {
	public static void main(String[] args) {
		//创建一个匿名类部类调用jdk18的default修饰的方法
		new jdk(){}.HelloMMP();
		//jdk18支持的静态有方法体的方法
		jdk.say();
		
		//创建匿名类并调用run()方法;测试局部内部类调用成员变量是否可以省略final(18以上支持)
		new Test().run();
	}
}


class Test {
	public void run() {
		int x = 10; //jdk1.8前面的final可以省略，不过系统会默认加上,不能修改 
		class Inner {
			public void method() {
				//x=20;
				System.out.println(x);
			}
		}

		Inner i = new Inner();
		i.method();
	}
	
}