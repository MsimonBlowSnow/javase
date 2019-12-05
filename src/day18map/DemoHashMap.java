package day18map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*HashMap的遍历
 * 使用HashMap中的entry()来进行遍历
 * 具体看根据键值对象获取.png
 * */
public class DemoHashMap {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("张三",23);
		map.put("李四",24);
		map.put("王五",25);
		map.put("赵六",26);
		//Map.Entry<String,Integer>,Entry是Map中的内部接口
		Set<Map.Entry<String, Integer>> mapEntry=map.entrySet();
		Iterator<Map.Entry<String, Integer>> a= mapEntry.iterator();
		while(a.hasNext()) {
			Map.Entry<String, Integer> entry=a.next();//父类引用指向子类对象
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		//通过for循环遍历
		for (Entry<String, Integer> entry : map.entrySet()) {//直接获取对象
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}
	
}
