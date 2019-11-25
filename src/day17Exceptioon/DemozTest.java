package day17Exceptioon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*1.catch到了异常后面还会执行吗
 	* 
 * 2.throw后面还会执行吗
 * */
public class DemozTest {
	public static void main(String[] args) throws FileNotFoundException {
		new Thread() {
			@Override
			public void run() {
				String aString=null;
				try {
					aString.charAt(1);
				} catch (Exception e) {
					System.out.println("空值不能调用方法");
				}
				System.out.println(1);
			}
		}.start();
		FileInputStream aFileInputStream=new FileInputStream("mmp");
		System.out.println("不能继续");
		int a=10/0;
		System.out.println("mmp");
	}
}
