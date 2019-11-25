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

/*�ַ�����copy
 * �ַ���ֻ�ܿ������ı��ļ�
 * */
public class DemoCopy {
	public static void main(String[] args) throws IOException {
		//��ͨ�Ŀ���
		//method();
		//�Զ�������Ŀ���
		//methodArrayCopy();
		//bufferd����
		methodBufferCopy();
		//�ֽ��������Ǵ��ı��ļ��������ļ��ɹ�,�ֽ��������ļ�
		methodInputFei();
		//�ַ��������Ǵ��ı��ļ�,�����ļ����ɹ�,�ַ������ܿ������ļ�
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
		BufferedReader a= new BufferedReader(new FileReader("src/day21IOStreamRead/ת����.png"));
		BufferedWriter b= new BufferedWriter(new FileWriter("src/day21IOStreamRead/ת����copy.png"));
		int flag1=0;
		while ((flag1=a.read())!=-1) {
			b.write(flag1);
		}
		a.close();
		b.close();
	}

	private static void methodInputFei() throws FileNotFoundException, IOException {
		int flag1=0;
		BufferedInputStream a1=new BufferedInputStream(new FileInputStream("src/day21IOStreamRead/ת����.png"));
		BufferedOutputStream b1= new BufferedOutputStream(new FileOutputStream("src/day21IOStreamRead/ת����copy1.png"));
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
		int len=0;//��Ч����
		while((len=fr.read(chs))!=-1) {
			fw.write(chs,0,len);
		}
		fw.close();
		fr.close();
	}

	private static void method() throws IOException, FileNotFoundException {
		//1.7�汾�����ԣ���ʵ����Autocloseable�ӿ��е�close����
		try (FileReader fr = new FileReader("a.txt"); FileWriter fw = new FileWriter("acopy.txt");) {
			int flag = 0;
			while ((flag = fr.read()) != -1) {
				fw.write(flag);
			}
		}
	}
}
