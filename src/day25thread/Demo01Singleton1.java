package day25thread;

/*单例加载模式
 	*一个类只有一个有效对象
 	*有三种方法，
 *1.饿汉式(开发时候推荐)
 *2.懒汉式(多线程不安全)
 *3.无名
 */
public class Demo01Singleton1 {
	public static void main(String[] args) {
		
	}
}
//饿汉式，开发时候用，多线程安全
class Demo01{
	//私有化对象，不能创建
	private Demo01() {}
	//不能访问，必须借助get方法
	private static Demo01 aDemo01=new Demo01();
	public static Demo01 getDemo01(){
		return aDemo01;
	}
}

//懒汉式，单线程安全，多线程不安全，不推荐使用，会面式
class Demo011{
	//私有化对象，不能创建
	private Demo011() {}
	//不能访问，必须借助get方法
	private static Demo011 aDemo01=null;
	public static Demo011 getDemo01(){
		if(aDemo01==null) {
			//有一个线程执行到这里，被另一个线程抢去了，就会有不同的对象
			aDemo01=new Demo011();
		}
		return aDemo01;
	}
}

class Demo0111{
	//用final 修饰不能修改
	private Demo0111() {}
	public final static Demo0111 a= new Demo0111();
} 