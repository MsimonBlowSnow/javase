package day18fileSequencsInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;


/* 1.什么是序列流
	* 序列流可以把多个字节输入流整合成一个, 从序列流中读取数据时, 将从被整合的第一个流开始读, 读完一个之后继续读第二个, 以此类推.
* 2.使用方式
* 2.1多个输入流	
	*SequenceInputStream(Enumeration<? extends InputStream> e) 
    *通过记住参数来初始化新创建的 SequenceInputStream，
    *该参数必须是生成运行时类型为 InputStream 对象的 Enumeration 型参数。 
*2.2两个输入流
	*SequenceInputStream(InputStream s1, InputStream s2) 
    *通过记住这两个参数来初始化新创建的 SequenceInputStream
    *（将按顺序读取这两个参数，先读取 s1，然后读取 s2），
    *以提供从此 SequenceInputStream 读取的字节。  
*3.如果有三个流对象就用sequence连接两个先(不推荐，太麻烦了)
*在用连接了两个的对象流连接第三个
*如：
	*FileInputStream fis= new FileInputStream("src/day18fileSequencsInputStream/a.txt");
	FileInputStream fis1=new FileInputStream("src/day18fileSequencsInputStream/c.txt");
	FileInputStream fis2=new FileInputStream("src/day18fileSequencsInputStream/v.txt");
		//创建连接输入流对象
	SequenceInputStream  sis= new SequenceInputStream(fis,fis1);
	SequenceInputStream  sis1= new SequenceInputStream(sis,fis2);
*/
public class DemoSequenceInputStream {
	public static void main(String[] args) throws IOException {
		//普通情况下的两个inputStream
		//method();
		//通过sequenceInputStream整合两个输入流
		//methodSequenceIS();
		//通关sequenceInputStream构造方法连接三个对象
		mehtodSequence3();
	}

	private static void mehtodSequence3() throws FileNotFoundException, IOException {
		FileInputStream fis= new FileInputStream("src/day18fileSequencsInputStream/a.txt");
		FileInputStream fis1=new FileInputStream("src/day18fileSequencsInputStream/c.txt");
		FileInputStream fis2=new FileInputStream("src/day18fileSequencsInputStream/b.txt");
		FileOutputStream fos=new FileOutputStream("src/day18fileSequencsInputStream/acopy.txt");
		Vector<FileInputStream> vt = new Vector<>();
		vt.add(fis);
		vt.add(fis1);
		vt.add(fis2);
		Enumeration<FileInputStream> emun= vt.elements();
		SequenceInputStream sis= new SequenceInputStream(emun);
		int flag;
		while((flag=sis.read())!=-1) {
			fos.write(flag);
		}
		sis.close();//sis关闭了，三个输出流自然关闭
		fos.close();
	}

	private static void methodSequenceIS() throws FileNotFoundException, IOException {
		//SequenceInputStream
		FileInputStream fis= new FileInputStream("src/day18fileSequencsInputStream/a.txt");
		FileInputStream fis1=new FileInputStream("src/day18fileSequencsInputStream/c.txt");
		//创建连接输入流对象
		SequenceInputStream  sis= new SequenceInputStream(fis,fis1);
		FileOutputStream fos=new FileOutputStream("src/day18fileSequencsInputStream/acopy.txt");
		int flag=0;
		while((flag=sis.read())!=-1) {
			fos.write(flag);
		}
		sis.close();//sis关闭了，两个输出流自然关闭
		fos.close();
	}

	private static void method() throws FileNotFoundException, IOException {
		FileInputStream fis= new FileInputStream("src/day18fileSequencsInputStream/a.txt");
		FileInputStream fis1=new FileInputStream("src/day18fileSequencsInputStream/c.txt");
		FileOutputStream fos=new FileOutputStream("src/day18fileSequencsInputStream/acopy.txt");
		int flag=0;
		while((flag=fis.read())!=-1) {
			fos.write(flag);
		}
		fis.close();
		while((flag=fis1.read())!=-1) {
			fos.write(flag);
		}
		fis1.close();		
		fos.close();
	}
}
