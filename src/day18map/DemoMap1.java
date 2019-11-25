package day18map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 	* A:Map���ϵĹ��ܸ���
	* a:��ӹ���
		* V put(K key,V value):���Ԫ�ء�
			* ������ǵ�һ�δ洢����ֱ�Ӵ洢Ԫ�أ�����null
			* ��������ǵ�һ�δ��ڣ�����ֵ����ǰ��ֵ�滻����������ǰ��ֵ
	* b:ɾ������
		* void clear():�Ƴ����еļ�ֵ��Ԫ��
		* V remove(Object key)�����ݼ�ɾ����ֵ��Ԫ�أ�����ֵ����
	* c:�жϹ���
		* boolean containsKey(Object key)���жϼ����Ƿ����ָ���ļ�
		* boolean containsValue(Object value):�жϼ����Ƿ����ָ����ֵ
		* boolean isEmpty()���жϼ����Ƿ�Ϊ��
	* d:��ȡ����
		* Set<Map.Entry<K,V>> entrySet():
		* V get(Object key):���ݼ���ȡֵ
		* Set<K> keySet():��ȡ���������м��ļ���
		* Collection<V> values():��ȡ����������ֵ�ļ���
	* e:���ȹ���
		* int size()�����ؼ����еļ�ֵ�Եĸ���
 * 
 * */
public class DemoMap1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Integer l1 = map.put("����", 26);// null
		Integer l2 = map.put("����", 25);// null
		Integer l3 = map.put("����", 24);// null
		Integer l4 = map.put("����", 23);// null
		Integer l5 = map.put("����", 22);// 26,���ر������˵�ֵ��
		System.out.println(l1 + " " + l2 + " " + l3 + " " + l4 + " " + l5);// null null null null 26,f���ر������˵�ֵ
		// remove ɾ�������ء�
		System.out.println(map.remove("����"));// 22
		System.out.println(map);// {����=25, ����=24, ����=23}������ɾ��
		// �ж����containsKey()������ containsValue()����
		//methodPanduan(map);
		//��ȡ����,��ȡ�����ֵ
		Collection<Integer> a=map.values();
		System.out.println(a);
	}

	private static void methodPanduan(Map<String, Integer> map) {
		System.out.println(map.containsKey("����"));
		System.out.println(map.containsKey("����"));// ������ɾ����
		System.out.println(map.containsValue(23));
		System.out.println(map.containsValue(22));
		if (map.isEmpty()) {
			System.out.println("����");
		} else {
			map.clear();// �������Ԫ��
			System.out.println("��");
		}
	}
}
