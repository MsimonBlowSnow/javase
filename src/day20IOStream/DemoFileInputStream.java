package day20IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
 * read()方法一次读一个字节,如果结束放回-1									//关闭流释放资源
*/
public class DemoFileInputStream {
	public static void main(String[] args) throws IOException {
		File a= new File("src/day20IOStream/a.txt");
		//read()方法每次读一个字节，并返回一个int型整数，当文件结束时，返回-1
		methodWhileRead(a);
		methodRead(a);
	}

	private static void methodRead(File a) throws FileNotFoundException, IOException {
		FileInputStream infile =new FileInputStream(a);
		System.out.println(infile.read());
		System.out.println(infile.read());
		System.out.println(infile.read());
		//结束出-1
		System.out.println(infile.read());
	}

	private static void methodWhileRead(File a) throws FileNotFoundException, IOException {
		FileInputStream infile =new FileInputStream(a);
		int flag;
		while( (flag=infile.read())!=-1) {
			System.out.println(flag);
		}
		infile.close();
	}
}
