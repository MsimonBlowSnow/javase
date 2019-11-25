package day15jihe;

import java.util.ArrayList;
import java.util.Collection;

/** A:案例演示	
		基本功能演示
		  
		boolean add(E e)//添加一个对象无论是什么数据类型都可以
		boolean remove(Object o)//移除一个对象
		void clear()//清空集合
		boolean contains(Object o)//是否包含该对象
		boolean isEmpty()//判断集合是否是空的
		int size()//返回集合内对象的个数

* B:注意:
* 
		collectionXxx.java使用了未经检查或不安全的操作.
		注意:要了解详细信息,请使用 -Xlint:unchecked重新编译.
		java编译器认为该程序存在安全隐患
		温馨提示:这不是编译失败,所以先不用理会,等学了泛型你就知道了 
 * */
@SuppressWarnings({ "rawtypes", "unchecked" })//等学了泛型你就知道了
public class DemoArrayList{
	public static void main(String[] args) {
		Collection a=new ArrayList();
		a.add("mmp");
		a.add(1);//Arraylist返回值一定是true
		a.add("laji");
		if(a.contains("mmp")) {
			System.out.println("大家都是文明人!");
		}
		System.out.println(a.toString()+a.size());
		a.remove(1);
		System.out.println(a.toString()+a.size());
		a.clear();
		if(a.isEmpty()) {
			System.out.println("这是一个空集合!");
		}
		if(a.contains("mmp")) {
			System.out.println("大家都是文明人!");
		}
	}
}

