package day18fileSequencsInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/* 1.什么是标准输入输出流(掌握)
	* System.in是InputStream, 标准输入流, 默认可以从键盘输入读取字节数据
	* System.out是PrintStream, 标准输出流, 默认可以向Console中输出字符和字节数据
	*1.1system.in返回一个InputStream见methodSystemIn();
		*read()只能读一个字节
		*如果没有建立管道，（即没有和系统资源链接）不能关闭流，否则该流就不能再用了
		*systtem.out流没有关联文件时也不用关	 
 * 
 * 
 */
public class DemoSystemIn {
	public static void main(String[] args) throws IOException {
		//methodSystemIn();
		//改变默认标准输流，默认是指向键盘的，改变后指向文件，一般不会用
		System.setIn(new FileInputStream("c.txt"));
		System.setOut(new PrintStream("a.txt"));
		int flag;
		InputStream iS=System.in;
		PrintStream pStream=System.out;
		while ((flag=iS.read())!=-1) {
			pStream.write(flag);
		}
		//关联了文件，必须关闭流
		iS.close();
		pStream.close();
	}

	private static void methodSystemIn() throws IOException {
		InputStream iStream=System.in;
		int a=iStream.read();//一个字节一个字节的读
		System.out.println(a);//输入43，输出52，4的aslll是52
		//如果没有建立管道，不能关流，系统里面只有一个System.in如下：
		iStream.close();
		InputStream iStream1=System.in;
		int a1=iStream.read();//一个字节一个字节的读
		System.out.println(a);
	}
}
