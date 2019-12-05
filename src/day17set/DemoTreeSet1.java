package day17set;

import java.util.Comparator;
import java.util.TreeSet;

public class DemoTreeSet1 {

			/**
			 * @param args
			 * TreeSet集合是用来对象元素进行排序的,同样他也可以保证元素的唯一
			 * 当compareTo方法返回0的时候集合中只有一个元素
			 * 当compareTo方法返回正数的时候集合会怎么存就怎么取
			 * 当compareTo方法返回负数的时候集合会倒序存储
			 */
			public static void main(String[] args) {
				demo1();
				demo2();
				//demo3();
				//demo4();
				//需求:将字符串按照长度排序
				//自定义比较器
				TreeSet<String> ts = new TreeSet<>(new CompareByLen());		//Comparator c = new CompareByLen();
				ts.add("aaaaaaaa");
				ts.add("z");
				ts.add("wc");
				ts.add("nba");
				ts.add("cba");
				System.out.println(ts);
			}

			public static void demo4() {
				TreeSet<Student17> ts = new TreeSet<>();
				ts.add(new Student17(23,"zhangsan"));
				ts.add(new Student17(13,"lisi"));
				ts.add(new Student17(33,"wangwu"));
				ts.add(new Student17(43, "zhaoliu"));
				ts.add(new Student17( 53,"aaaa"));
				System.out.println(ts);
			}

			public static void demo3() {
				TreeSet<Student17> ts = new TreeSet<>();
				ts.add(new Student17(13,"李四"));
				ts.add(new Student17(23,"张三"));
				ts.add(new Student17(43,"王五"));
				ts.add(new Student17(33,"赵六"));
				
				System.out.println('张' + 0);//不同的unicode
				System.out.println('李' + 0);//
				System.out.println('王' + 0);//
				System.out.println('赵' + 0);//
				
				System.out.println(ts);
			}

			public static void demo2() {
				TreeSet<Student17> ts = new TreeSet<>();
				ts.add(new Student17( 23,"张三"));
				ts.add(new Student17(13,"李四"));
				ts.add(new Student17(13,"周七"));
				ts.add(new Student17(43,"王五"));
				ts.add(new Student17(33,"赵六"));
				ts.add(new Student17( 23,"张三"));
				System.out.println(ts);
			}

			public static void demo1() {
				TreeSet<Integer> ts = new TreeSet<>();
				ts.add(3);
				ts.add(1);
				ts.add(1);
				ts.add(2);
				ts.add(2);
				ts.add(3);
				ts.add(3);
				
				System.out.println(ts);
			}

		}


		class CompareByLen /*extends Object*/ implements Comparator<String> {

			@Override
			public int compare(String s1, String s2) {		//按照字符串的长度比较
				int num = s1.length() - s2.length();		//长度为主要条件
				return num == 0 ? s1.compareTo(s2) : num;	//内容为次要条件
			}
			
		}
