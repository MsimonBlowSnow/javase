package day15jihe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/*题：
 * 通过迭代器遍历集合中的元素，如果有
 * ming 则在后面加上一个 handsome
 * Iterator 中没有add()方法不能用多态
 * ListIterator中有该方法
 * */
public class DemoLsitIterator {
	public static void main(String[] args) {
		List<String> a=new ArrayList<>();
		a.add("Lihua");
		a.add("Ming");
		a.add("DingXiang");
		a.add("ChenXiang");
		a.add("YanJian");
		a.add("NaZe");
		a.add("HongHaiEr");
		/*Iterator c=a.iterator();
		while(c.hasNext()) {
			String str=(String) c.next();//向下转型
			if(str.equals("Ming")) {
				a.add("handsome");
				//ConcurrentModificationException
				//并发修改异常
			}
		}*/
		ListIterator c=a.listIterator();
		while(c.hasNext()) {
			String str=(String) c.next();//向下转型
			if(str.equals("Ming")) {
				/* 不能通过List来添加了
				 * a.add("handsome"); 
				 * ConcurrentModificationException 
				 * 并发修改异常
				 */
				//ListIterator提供了一个方法来完成
				c.add("Handsome");			
			}
		}
		System.out.println(a);
	}
}
