package day17Exceptioon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*1.catch�����쳣���滹��ִ����
 	* 
 * 2.throw���滹��ִ����
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
					System.out.println("��ֵ���ܵ��÷���");
				}
				System.out.println(1);
			}
		}.start();
		FileInputStream aFileInputStream=new FileInputStream("mmp");
		System.out.println("���ܼ���");
		int a=10/0;
		System.out.println("mmp");
	}
}
