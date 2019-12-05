package day18map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

/**A:案例演示
	* 需求：统计字符串中每个字符出现的次数
*/
public class TestMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		TreeMap<Character,Integer> map =new TreeMap<>();
		while(true) {
			map.clear();
			String str=sc.nextLine();
			if(str.equals("quit"))
				break;
			char[] chs=str.toCharArray();
			for (char c : chs) {
				if(map.containsKey(c)) {
					 a=map.get(c);
					 a++;
					 map.put(c,a);
				}
				else
					map.put(c, 1);
			}
			System.out.println(map);
		}
	}
}
