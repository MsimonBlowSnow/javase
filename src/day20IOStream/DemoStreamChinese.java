package day20IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 字节流读取中文的问题
 * 一个中文2个字节
* 字节流在读中文的时候有可能会读到半个中文,造成乱码 
* 字节流写出中文的问题
* 字节流直接操作的字节,所以写出中文必须将字符串转换成字节数组 
* 写出回车换行 write("\r\n".getBytes());
*/
public class DemoStreamChinese {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("acopy.txt");
		FileInputStream  fis =new FileInputStream("a.txt");
		byte[] a=new byte[2];
		int flag;
		while((flag=fis.read(a))!=-1) {
			System.out.println( new String(a,0,a.length));
		}
		fos.write("你有病".getBytes());
		fos.write("\r\n".getBytes());
	}
}
