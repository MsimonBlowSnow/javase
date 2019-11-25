package day18map;

import java.util.LinkedHashMap;

/*LinkedHashMap中*/
public class DemoLinkedHashMap {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> a=new LinkedHashMap<>();
		a.put("mmp", 0);
		a.put("mmp1", 1);
		a.put("mmp2", 2);
		a.put("mmp", 1);//通过hashcode和equals方法去重(把前面一样的key覆盖了)
		System.out.println(a);
	}
}
