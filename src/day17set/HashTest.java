package day17set;

import java.util.HashSet;
import java.util.Random;

/* A:案例演示
* 需求：编写一个程序，获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台。
*/
public class HashTest {
	public static void main(String[] args) {
		int a;
		HashSet<Integer> flag=new HashSet<>();
		while(flag.size()!=10) {
			a=(int)(Math.floor(Math.random()*10)+10);
			flag.add(a);
		}
		System.out.println(flag);
		for (Integer integer : flag) {
			System.out.println(integer);
		}
	}
}
