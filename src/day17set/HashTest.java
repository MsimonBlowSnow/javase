package day17set;

import java.util.HashSet;
import java.util.Random;

/* A:������ʾ
* ���󣺱�дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ����������յ���������������̨��
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
