package day16List;

public class DemoFangXing3 {
	public static void main(String[] args) {
		A<Integer> a=new A<>(1);
		//A<Integer> a=new A<>("f1");编译时报错,构造方法中没用参数是Integer的对象
	}
}


//Q创建对象使用的范型
class A<Q>{
	private Q e;
	A(){}
	A(Q e){
		this.e=e;
	}
	public  void print() {
		System.out.println(e);
	}
	public void print1(Q q) {};
	//Q q 代表存传入的泛型，而T t 没用
	public<T> void print2(T t) {}//方法泛型最好是和类范型一致,
								//如果不一致，则在public 加一个泛型
	public static<W> void print3(W w) {}//静态方法必需有自己的泛型
										//他是在类的实例创建之前就有的
}
