package day12ClassObject;

//StringBuffer 创建对象，会创建一块堆内存，长度为16的字符数组
//再调用添加方法时不会创建
/*StringBuffer中的常用对象方法
 * append();
 * insert(int a,String b)
 * toString()
 *delete()
 *deleteCharAt()
 * */
public class DemoStringBuffer1 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("abc");
		StringBuffer sb1=sb.append(true);
		StringBuffer sb2=sb.append("ming");
		StringBuffer sb3=sb.append("天蝎");
		//sb,sb1,sb2,sb3四个都是同一个对象并且StringBuffer
		//重写了toString方法
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		//在索引处加指定字符串,索引超过范围，则会报错
		sb3.insert(1, "lalala");
		System.out.println(sb3);
		//删除指定索引的字符
		System.out.println(sb3.deleteCharAt(2));
		//delete 删除从第一个参数的索引到第二个参数,放回删除后的字符
		System.out.println(sb.delete(0,3));
		//清空字符串(0,length())
		System.out.println(sb.delete(0, sb3.length()));
		
		/*sb3=new StringBuffer();
		 * 不能用该方法，如果用该方法清空，会导致上一个对象成垃圾，
		 * 又重新创作了一个对象,浪费内存
		 * */
		
	}
}
