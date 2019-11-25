package day18fileSequencsInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;


/* 1.ʲô��������
	* ���������԰Ѷ���ֽ����������ϳ�һ��, ���������ж�ȡ����ʱ, ���ӱ����ϵĵ�һ������ʼ��, ����һ��֮��������ڶ���, �Դ�����.
* 2.ʹ�÷�ʽ
* 2.1���������	
	*SequenceInputStream(Enumeration<? extends InputStream> e) 
    *ͨ����ס��������ʼ���´����� SequenceInputStream��
    *�ò�����������������ʱ����Ϊ InputStream ����� Enumeration �Ͳ����� 
*2.2����������
	*SequenceInputStream(InputStream s1, InputStream s2) 
    *ͨ����ס��������������ʼ���´����� SequenceInputStream
    *������˳���ȡ�������������ȶ�ȡ s1��Ȼ���ȡ s2����
    *���ṩ�Ӵ� SequenceInputStream ��ȡ���ֽڡ�  
*3.������������������sequence����������(���Ƽ���̫�鷳��)
*���������������Ķ��������ӵ�����
*�磺
	*FileInputStream fis= new FileInputStream("src/day18fileSequencsInputStream/a.txt");
	FileInputStream fis1=new FileInputStream("src/day18fileSequencsInputStream/c.txt");
	FileInputStream fis2=new FileInputStream("src/day18fileSequencsInputStream/v.txt");
		//������������������
	SequenceInputStream  sis= new SequenceInputStream(fis,fis1);
	SequenceInputStream  sis1= new SequenceInputStream(sis,fis2);
*/
public class DemoSequenceInputStream {
	public static void main(String[] args) throws IOException {
		//��ͨ����µ�����inputStream
		//method();
		//ͨ��sequenceInputStream��������������
		//methodSequenceIS();
		//ͨ��sequenceInputStream���췽��������������
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
		sis.close();//sis�ر��ˣ������������Ȼ�ر�
		fos.close();
	}

	private static void methodSequenceIS() throws FileNotFoundException, IOException {
		//SequenceInputStream
		FileInputStream fis= new FileInputStream("src/day18fileSequencsInputStream/a.txt");
		FileInputStream fis1=new FileInputStream("src/day18fileSequencsInputStream/c.txt");
		//������������������
		SequenceInputStream  sis= new SequenceInputStream(fis,fis1);
		FileOutputStream fos=new FileOutputStream("src/day18fileSequencsInputStream/acopy.txt");
		int flag=0;
		while((flag=sis.read())!=-1) {
			fos.write(flag);
		}
		sis.close();//sis�ر��ˣ������������Ȼ�ر�
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
