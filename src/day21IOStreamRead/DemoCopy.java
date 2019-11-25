package day21IOStreamRead;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*字符流的copy
 * 字符流只能拷贝纯文本文件
 * */
public class DemoCopy {
	public static void main(String[] args) throws IOException {
		//普通的拷贝
		//method();
		//自定义数组的拷贝
		//methodArrayCopy();
		//bufferd拷贝
		methodBufferCopy();
		//字节流拷贝非纯文本文件，拷贝文件成功,字节流拷贝文件
		methodInputFei();
		//字符流拷贝非纯文本文件,拷贝文件不成功,字符流不能拷贝非文件
		methodReadyFei();
	}

	private static void methodBufferCopy() throws FileNotFoundException, IOException {
		BufferedReader bfr=new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bfw=new BufferedWriter(new FileWriter("acopy.txt"));
		int flag=0;
		while ((flag=bfr.read())!=-1) {
			bfw.write(flag);
		}
		bfw.close();
		bfr.close();
	}

	private static void methodReadyFei() throws FileNotFoundException, IOException {
		BufferedReader a= new BufferedReader(new FileReader("src/day21IOStreamRead/转换流.png"));
		BufferedWriter b= new BufferedWriter(new FileWriter("src/day21IOStreamRead/转换流copy.png"));
		int flag1=0;
		while ((flag1=a.read())!=-1) {
			b.write(flag1);
		}
		a.close();
		b.close();
	}

	private static void methodInputFei() throws FileNotFoundException, IOException {
		int flag1=0;
		BufferedInputStream a1=new BufferedInputStream(new FileInputStream("src/day21IOStreamRead/转换流.png"));
		BufferedOutputStream b1= new BufferedOutputStream(new FileOutputStream("src/day21IOStreamRead/转换流copy1.png"));
		while ((flag1=a1.read())!=-1) {
			b1.write(flag1);
		}
		a1.close();
		b1.close();
	}

	private static void methodArrayCopy() throws FileNotFoundException, IOException {
		FileReader fr= new FileReader("a.txt");
		FileWriter fw =new FileWriter("acopy.txt");
		char[] chs=new char[1024];
		int len=0;//有效长度
		while((len=fr.read(chs))!=-1) {
			fw.write(chs,0,len);
		}
		fw.close();
		fr.close();
	}

	private static void method() throws IOException, FileNotFoundException {
		//1.7版本新特性，流实现了Autocloseable接口中的close方法
		try (FileReader fr = new FileReader("a.txt"); FileWriter fw = new FileWriter("acopy.txt");) {
			int flag = 0;
			while ((flag = fr.read()) != -1) {
				fw.write(flag);
			}
		}
	}
}
