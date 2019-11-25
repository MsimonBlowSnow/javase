package day18fileSequencsInputStream;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 定义一个文件输入流,调用read(byte[] b)方法,
 * 将a.txt文件中的内容打印出来(byte数组大小限制为5)
 * 问题：
 	*byte数组为5，若果文件里面有中文(占两个字节)，就有可能出现乱码 
 * 解题思路:
 	*创建一个内存输出流，把输入的五个字节放入内存输出流中，
 	*等文件读完，一次性转义成字符串在输出
*/
public class TestByteArrayOutputStream {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream baos= new ByteArrayOutputStream();
		FileInputStream fis= new FileInputStream("c.txt");//默认路径Javase项目下
		int flag;
		byte[] a= new byte[5];
		while((flag=fis.read(a))!=-1) {//flag为有效长度
			baos.write(a,0,flag);//写入文件的有效部分
		}
		System.out.println(baos);//ByteAByteArrayOutputStream重写了tostring()方法
		baos.close();//底层用数组开发的，并没有建立管道(流)所有不关闭，也没关系
	}
}
