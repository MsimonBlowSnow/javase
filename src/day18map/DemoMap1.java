package day18map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 	* A:Map集合的功能概述
	* a:添加功能
		* V put(K key,V value):添加元素。
			* 如果键是第一次存储，就直接存储元素，返回null
			* 如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
	* b:删除功能
		* void clear():移除所有的键值对元素
		* V remove(Object key)：根据键删除键值对元素，并把值返回
	* c:判断功能
		* boolean containsKey(Object key)：判断集合是否包含指定的键
		* boolean containsValue(Object value):判断集合是否包含指定的值
		* boolean isEmpty()：判断集合是否为空
	* d:获取功能
		* Set<Map.Entry<K,V>> entrySet():
		* V get(Object key):根据键获取值
		* Set<K> keySet():获取集合中所有键的集合
		* Collection<V> values():获取集合中所有值的集合
	* e:长度功能
		* int size()：返回集合中的键值对的个数
 * 
 * */
public class DemoMap1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Integer l1 = map.put("张三", 26);// null
		Integer l2 = map.put("李四", 25);// null
		Integer l3 = map.put("王五", 24);// null
		Integer l4 = map.put("赵六", 23);// null
		Integer l5 = map.put("张三", 22);// 26,返回被覆盖了的值。
		System.out.println(l1 + " " + l2 + " " + l3 + " " + l4 + " " + l5);// null null null null 26,f返回被覆盖了的值
		// remove 删除并返回。
		System.out.println(map.remove("张三"));// 22
		System.out.println(map);// {李四=25, 王五=24, 赵六=23}张三被删除
		// 判断语句containsKey()方法和 containsValue()方法
		//methodPanduan(map);
		//获取功能,获取里面的值
		Collection<Integer> a=map.values();
		System.out.println(a);
	}

	private static void methodPanduan(Map<String, Integer> map) {
		System.out.println(map.containsKey("李四"));
		System.out.println(map.containsKey("张三"));// 张三被删掉了
		System.out.println(map.containsValue(23));
		System.out.println(map.containsValue(22));
		if (map.isEmpty()) {
			System.out.println("不是");
		} else {
			map.clear();// 清除所有元素
			System.out.println("是");
		}
	}
}
