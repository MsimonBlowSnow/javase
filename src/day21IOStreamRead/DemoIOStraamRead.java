package day21IOStreamRead;

import java.io.FileReader;
import java.io.IOException;

/* 1.字符流是什么
* 字符流是可以直接读写字符的IO流
* 字符流读取字符, 就要先读取到字节数据, 然后转为字符. 如果要写出字符, 需要把字符转为字节再写出.    
* 2.FileReader
* FileReader类的read()方法可以按照字符大小读取
* 
	FileReader fr = new FileReader("aaa.txt");				//创建输入流对象,关联aaa.txt
	int ch;
	while((ch = fr.read()) != -1) {							//将读到的字符赋值给ch
		System.out.println((char)ch);						//将读到的字符强转后打印
	}
	
	fr.close();												//关流 
/
public class DemoIOStraamRead {
	public static void main(String[] args) {
		
	}
}
*/
public class DemoIOStraamRead {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("a.txt");				//创建输入流对象,关联aaa.txt
		int ch;
		while((ch = fr.read()) != -1) {							//将读到的字符赋值给ch
			System.out.println((char)ch);						//将读到的字符强转后打印
		}
		fr.close();
	}
}
