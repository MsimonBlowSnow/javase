package day18map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*hashmap����
 	* ͨ��keyset()������ȡmap�е�key����
 	* ͨ��get(key)������ȡvalue
*/
public class DemoHashMap2 {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("����",23);
		map.put("����",24);
		map.put("����",25);
		map.put("����",26);
		//ͨ��set�ĵ���������
		//methodBianli1(map);
		//ͨ��forѭ������
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
