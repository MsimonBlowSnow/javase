package day18map;

import java.util.LinkedHashMap;

/*LinkedHashMap��*/
public class DemoLinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> a=new LinkedHashMap<>();
		a.put("mmp", 0);
		a.put("mmp1", 1);
		a.put("mmp2", 2);
		a.put("mmp", 1);//ͨ��hashcode��equals����ȥ��(��ǰ��һ����key������)
		System.out.println(a);
	}
}
