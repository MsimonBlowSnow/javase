package day17set;

import java.util.HashSet;

/*set集合是如何保证每个元素不相等的
 * 自定义元素：
 * 先调用hashcode方法，看hashcode 是否相同，
 * 相同:调用equals
 * 不同:直接不去掉重复
 * 为了提高代码的执行效率,要使每个元素的hashcode 的返回值在不同对象时是不同的
 * */


/*面试例题：
 * hashset里面是如何实现去重的
 * * 1.HashSet原理
	* 我们使用Set集合都是需要去掉重复元素的, 如果在存储的时候逐个equals()比较, 效率较低,哈希算法提高了去重复的效率, 降低了使用equals()方法的次数
	* 当HashSet调用add()方法存储对象的时候, 先调用对象的hashCode()方法得到一个哈希值, 然后在集合中查找是否有哈希值相同的对象
		* 如果没有哈希值相同的对象就直接存入集合
		* 如果有哈希值相同的对象, 就和哈希值相同的对象逐个进行equals()比较,比较结果为false就存入, true则不存
* 2.将自定义类的对象存入HashSet去重复
	* 类中必须重写hashCode()和equals()方法
	* hashCode(): 属性相同的对象返回值必须相同, 属性不同的返回值尽量不同(提高效率)
	* equals(): 属性相同返回true, 属性不同返回false,返回false的时候存储

 * */
public class DemoHashSet1 {
	public static void main(String[] args) {
		HashSet<Student17> a= new HashSet<Student17>();
		HashSet<Student1> b=new HashSet<Student1>();//默认权限符同一个包下可以访问	
		//set集合没有去掉重复的元素，没有重写Hashcode方法
		b.add(new Student1(20,"李白"));
		b.add(new Student1(20,"李白"));
		b.add(new Student1(21,"杜甫"));
		b.add(new Student1(21,"杜甫"));
		System.out.println("b集合:"+b);
		//set没有重复的元素,重写Hashcode方法
		a.add(new Student17(20,"李白"));
		a.add(new Student17(20,"李白"));
		a.add(new Student17(21,"杜甫"));
		a.add(new Student17(21,"杜甫"));
		System.out.println(a);
	}
}
