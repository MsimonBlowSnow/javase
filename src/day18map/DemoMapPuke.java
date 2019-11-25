package day18map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*ģ�⶷�����ķ���*/
public class DemoMapPuke {
	public static void main(String[] args) {
		String[] huase= {"����","����","÷��","����"};
		String[] pai= {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
		TreeMap<String,Integer> pukeOrder=new TreeMap<>();
		Collection<String> pukeAll= new ArrayList<String>();
		for(int i=0;i<52;i++) {
			int huase1=i%4;
			int pai1=i/4;
			String pai2=huase[huase1].concat(pai[pai1]);//concat(),ƴ���ַ���
			pukeOrder.put(pai2,i);
		}
		pukeOrder.put("С��",52);
		pukeOrder.put("����",53);
		pukeAll=pukeOrder.keySet();
		//ϴ��
		List<String> pukeList=new ArrayList<>();
		pukeList.addAll(pukeAll);
		Collections.shuffle(pukeList);
		//��������
		Set<String> mingPuke=new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return pukeOrder.get(o1)-pukeOrder.get(o2);	
			}
			
		});
		Set<String> cqPuke=new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return pukeOrder.get(o1)-pukeOrder.get(o2);	
			}
			
		});
		Set<String> yumingPuke=new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return pukeOrder.get(o1)-pukeOrder.get(o2);	
			}
			
		});
		Set<String> szPuke=new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return pukeOrder.get(o1)-pukeOrder.get(o2);	
			}
			
		});
		for(int i=0;i<54;i++) {
			if(i-51>=0) {
				szPuke.add(pukeList.get(i));
			}
			else if(i%3==0) {
				mingPuke.add(pukeList.get(i));
			}
			else if(i%3==1) {
				cqPuke.add(pukeList.get(i));
			}else {
				yumingPuke.add(pukeList.get(i));
			}
		}
		System.out.println("������:"+mingPuke);
		System.out.println("С��:"+yumingPuke);
		System.out.println("С��:"+cqPuke);
		System.out.println("����:"+szPuke);
	}
}
