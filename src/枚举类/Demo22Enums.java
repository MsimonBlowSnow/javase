package 枚举类;
/** A:枚举类的常见方法
	* int ordinal(	//枚举类都是有编号的
	* int compareTo(E o) //比较编号
	* String name()  
	* String toString()
	* <T> T valueOf(Class<T> type,String name)
	* values() 
	* 此方法虽然在JDK文档中查找不到，但每个枚举类都具有该方法，它遍历枚举类的所有枚举值非常方便
* B:案例演示
	* 枚举类的常见方法
*/
public class Demo22Enums {
	public static void main(String[] args) {
		method1();
		//valueOf(Class<T> type,String name) 通过字节码文件获取枚举项
		Week13 aWeek13=Week13.valueOf(Week13.class,"MON");
		System.out.println(aWeek13);
		//values()方便遍历,values()方法返回枚举类型所有对象
		Week13[] a=Week13.values();
		for (Week13 week13 : a) {
			System.out.println(week13);
		}
	}

	private static void method1() {
		Week13 monWeek1= Week13.MON;
		Week13 tuesWeek1= Week13.TUES;
		Week13 wedWeek1= Week13.WED;
		
		//枚举类都是有编号的
		System.out.println(monWeek1.ordinal());
		System.out.println(tuesWeek1.ordinal());
		System.out.println(wedWeek1.ordinal());
		
		//比较编号
		System.out.println(monWeek1.compareTo(wedWeek1));
		System.out.println(tuesWeek1.compareTo(monWeek1));
		System.out.println(wedWeek1.compareTo(monWeek1));
		
		//获取名字
		System.out.println(monWeek1.name());
		System.out.println(tuesWeek1.name());
		System.out.println(wedWeek1.name());
		
		//重写toString()方法
		System.out.println(monWeek1);
		System.out.println(tuesWeek1);
		System.out.println(wedWeek1);
	}
}
