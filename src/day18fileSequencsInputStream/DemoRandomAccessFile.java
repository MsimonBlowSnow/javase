package day18fileSequencsInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* A:随机访问流概述
	* RandomAccessFile概述
	* RandomAccessFile类不属于流，是Object类的子类。但它融合了InputStream和OutputStream的功能。
	* 支持对随机访问文件的读取和写入。

* B:read(),write(),
* seek()在设置指针指向指定位置
* 
* 2.RandomAccessFile的构造
	*"r" 以只读方式打开。调用结果对象的任何 write 方法都将导致抛出 IOException。  
	"rw" 打开以便读取和写入。如果该文件尚不存在，则尝试创建该文件。  
	"rws" 打开以便读取和写入，对于 "rw"，还要求对文件的内容或元数据的每个更新都同步写入到底层存储设备。  
	"rwd"   打开以便读取和写入，对于 "rw"，还要求对文件内容的每个更新都同步写入到底层存储设备。 
	* RandomAccessFile(String, mode);
	* * RandomAccessFile(File, mode);
* */
public class DemoRandomAccessFile {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf= new RandomAccessFile("a.txt", "rw");
		int flag;
		while((flag=raf.read())!=-1) {
			System.out.write(flag);;
		}
		raf.write(97);//在文件的最后加一个a
		raf.seek(0);//把文件指针指到第一个位置
		raf.write(98);//在最前面加一个b
		
	}
}
