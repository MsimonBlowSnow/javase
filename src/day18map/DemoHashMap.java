package day18map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*HashMap�ı���
 * ʹ��HashMap�е�entry()�����б���
 * ���忴���ݼ�ֵ�����ȡ.png
 * */
public class DemoHashMap {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("����",23);
		map.put("����",24);
		map.put("����",25);
		map.put("����",26);
		//Map.Entry<String,Integer>,Entry��Map�е��ڲ��ӿ�
		Set<Map.Entry<String, Integer>> mapEntry=map.entrySet();
		Iterator<Map.Entry<String, Integer>> a= mapEntry.iterator();
		while(a.hasNext()) {
			Map.Entry<String, Integer> entry=a.next();//��������ָ���������
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		//ͨ��forѭ������
		for (Entry<String, Integer> entry : map.entrySet()) {//ֱ�ӻ�ȡ����
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}
	
}
