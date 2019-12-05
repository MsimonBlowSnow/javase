package day20IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/* 将键盘录入的数据拷贝到当前项目下的text.txt文件中,
 * 键盘录入数据当遇到quit时就退出
 * 思路:
 	*1.创建流对象和Scanner对象
 	*2.创建循环 ，并输入的数据为quit退出
 	*3.通过使用getByte()方法，将字符串转换为btye数组
 	*4.通过流输出
 	*5.关闭流对象	
*/
public class DemoScannerCopy {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		FileOutputStream fos= new FileOutputStream("a.txt");
		while(true) {
			System.out.println("请输入一行数据");
			String string=sc.nextLine();
			if(string.equals("quit"))
				break;
			else {
				fos.write(string.getBytes());
				fos.write("\r\n".getBytes());
			}
		}
		fos.close();
		sc.close();
	}
}
