package day9poly;

/*接口
 * 接口支持多实现而类却不能
 * 接口没有构造方法
 * 接口定义的方法都是抽象方法，数据都是最终数据类型
 * 接口与类的区别
 * 接口可以单实现接口，也可以多实现接口
 * 类只能单继承类
 * 接口可单以继承现接口也可以多继承接口。
 * */
public class Demo1Interface {
	public static void main(String[] args) {
	}
}
/*接口中没有构造方法 接口中成员变量都是默认有final public static 修饰的变量*/
/*接口中的抽象方法一定有public 修饰，如果没有默认会是public*/
interface inter1{
	public static final int  num=10;//
	int b=9;//默认public static final
	public abstract void print();
	public abstract  void print1();
}

interface inter2 extends inter1{
	
}


class print extends Object implements  inter1,inter2{
	public print(){
		super();//Object里面的super()方法
	}
	@Override
	public void print1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
