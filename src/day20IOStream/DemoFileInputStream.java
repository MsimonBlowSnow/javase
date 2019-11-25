package day20IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
 * read()����һ�ζ�һ���ֽ�,��������Ż�-1									//�ر����ͷ���Դ
*/
public class DemoFileInputStream {
	public static void main(String[] args) throws IOException {
		File a= new File("src/day20IOStream/a.txt");
		//read()����ÿ�ζ�һ���ֽڣ�������һ��int�����������ļ�����ʱ������-1
		methodWhileRead(a);
		methodRead(a);
	}

	private static void methodRead(File a) throws FileNotFoundException, IOException {
		FileInputStream infile =new FileInputStream(a);
		System.out.println(infile.read());
		System.out.println(infile.read());
		System.out.println(infile.read());
		//������-1
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
