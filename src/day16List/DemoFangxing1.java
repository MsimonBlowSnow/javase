package day16List;

import java.util.LinkedList;

/* A:泛型类概述<T>
	* 把泛型定义在类上
* B:定义格式
	* public class 类名<泛型类型1,…>
* C:注意事项	
	* 泛型类型必须是引用类型
* D:案例演示
	* 泛型类的使用
 * 
 * 
 * */
public class DemoFangxing1 {
	public static void main(String[] args) {
		MyMath<String>  a=new MyMath<>();
		a.add("mmp");
		a.add("mmp1");
		a.add("mmp2");
		a.remove("mmp2");
		//a.add(1);//编译时就报错
		System.out.println(a.toString());
	}
}

class MyMath<String>{
	private LinkedList<String> a=new LinkedList<>();
	public void add(String c) {
		a.add(c);
	}
	public void remove(String c) {
		a.remove(c);
	}
	public String get(int c) {
		return a.get(c);
	}
	@Override
	public java.lang.String toString() {
		return a.toString();
	}
	
	
}

