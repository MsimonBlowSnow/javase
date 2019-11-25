package day20IOStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* A:缓冲思想
	* 字节流一次读写一个数组的速度明显比一次读写一个字节的速度快很多，
	* 这是加入了数组这样的缓冲区效果，java本身在设计的时候，
	* 也考虑到了这样的设计思想(装饰设计模式后面讲解)，所以提供了字节缓冲区流
* B.BufferedInputStream
	* BufferedInputStream内置了一个缓冲区(数组)
	* 从BufferedInputStream中读取一个字节时
	* BufferedInputStream会一次性从文件中读取8192个,
	*  存在缓冲区中, 返回给程序一个
	* 程序再次读取时, 就不用找文件了, 直接从缓冲区中获取
	* 直到缓冲区中所有的都被使用过, 才重新从文件中读取8192个
* C.BufferedOutputStream
	* BufferedOutputStream也内置了一个缓冲区(数组)
	* 程序向流中写出字节时, 不会直接写到文件, 先写到缓冲区中
	* 直到缓冲区写满, BufferedOutputStream才会把缓冲区中的数据一次性写到文件里
** D.小数组的读写和带Buffered的读取哪个更快?
	* 定义小数组如果是8192个字节大小和Buffered比较的话
	* 定义小数组会略胜一筹,因为读和写操作的是同一个数组
	* 而Buffered操作的是两个数组
 * */
public class DemoBufferInpsAndBufferOups {
	public static void main(String[] args) throws IOException {
		/*创建文件输入流和输出流对象,关联
		src/day20IOStream/licunxu.png和
		src/day20IOStream/Copylicunxu.png*/
		FileInputStream fis=new FileInputStream("src/day20IOStream/licunxu.png");
		FileOutputStream fos = new FileOutputStream("src/day20IOStream/Copylicunxu.png");
		
		
		//创建缓冲区对bfin和bfos
		BufferedInputStream bfin= new BufferedInputStream(fis);
		BufferedOutputStream bfos = new BufferedOutputStream(fos);
		int flag=0;
		while((flag=bfin.read())!=-1) {
			bfos.write(flag);
		}
		bfin.close();						//只关装饰后的对象即可
		bfos.close();
	}
}
