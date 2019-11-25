package 模板设计模式;
/* A:模版设计模式概述
	* 模版方法模式就是定义一个算法的骨架，而将具体的算法延迟到子类中来实现
* B:优点和缺点
	* a:优点
		* 使用模版方法模式，在定义算法骨架的同时，可以很灵活的实现具体的算法，满足用户灵活多变的需求
	* b:缺点
		* 如果算法骨架有修改的话，则需要修改抽象类
1,装饰
2,单例
3,简单工厂
4,工厂方法
5,适配器
6,模版
 * 
 * 
 * */
public class Teplate_Demo {
	public static void main(String[] args) {
		Mingson aMingson=new Mingson();
		aMingson.run();
	}
}

abstract class Ming{
	//用final修饰防止子类
	public final void run(){
		long start=System.currentTimeMillis();
		code();
		long end=System.currentTimeMillis();
		System.out.println(end-start);
	}
	//给子类实现，提高灵活度
	abstract public void code();
}

class Mingson extends Ming{

	@Override
	public void code() {
		for(int i=0;i<1000000;i++){
			System.out.println(i);
		}
	}
}