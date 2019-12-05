package day18map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*hashmap遍历
 	* 通过keyset()方法获取map中的key集合
 	* 通过get(key)方法获取value
*/
public class DemoHashMap2 {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("张三",23);
		map.put("李四",24);
		map.put("王五",25);
		map.put("赵六",26);
		//通过set的迭代器遍历
		//methodBianli1(map);
		//通过for循环遍历
		mapBianli(map);
		//
	}

	private static void mapBianli(Map<String, Integer> map) {
		for (String string : map.keySet()) {
			System.out.println(string+""+map.get(string));
		}
	}

	private static void methodBianli1(Map<String, Integer> map) {
		Set<String> a=map.keySet();
		Iterator<String> Ia=a.iterator();
		while (Ia.hasNext()) {
			String Ia1=Ia.next();
			System.out.println(Ia1+""+map.get(Ia1));
		}
	}
}
