package day13regx;

import java.util.Arrays;

/*System对象
 * 构造方法是私有的不能创造对象
 * * A:System类的概述
	* System 类包含一些有用的类字段和方法。它不能被实例化。 
* B:成员方法
	* public static void gc()//通知垃圾回收系统
	* public static void exit(int status)//非0为异常退出，0为正常退出
	* public static long currentTimeMillis()//获取现在的时间距离19700101的毫秒值
	* pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
* C:案例演示
	* System类的成员方法使用


 * 
 * */
public class DemoSystem {
	public static void main(String[] args) {
		//methodgc();
		//methodExit();
		//methodTiem();
		//methodSystem();
}

	private static void methodSystem() {
		int a[] = {1,4,2,3,6,7};
		int b[] = new int[a.length];
		System.arraycopy(a,0, b, 0, a.length);
		System.out.println(Arrays.compare(a, b));
	}

	private static void methodTiem() {
		long beg=System.currentTimeMillis();
		for(int i=0;i<1000;i++) {
			System.out.println("*");
		}
		long end=System.currentTimeMillis();
		System.out.println(end-beg);
	}

	private static void methodExit() {
		System.exit(0);//退出不在执行下面的代码
		System.out.println("mmp");//退出，不执行这句话
	}

	private static void methodgc() {
		for(int i=0;i<100;i++) {
			new minggc();
			System.gc();//调用回收方法
	}
	}
}

class minggc{
	@Override
	public void finalize(){//重写回收对象的时执行的方法
		System.out.println("叫什么叫，收垃圾不要钱那!");
	}
}