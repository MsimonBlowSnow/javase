package day18fileSequencsInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/*�޸ı�׼���������ȥ����Ƭ
 * �������Ƽ�ʹ��
 * */
public class DemoSystemIncopy {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("c.txt"));//�ı��׼������
		System.setOut(new PrintStream("a.txt"));//�ı��׼�����
		byte[] a= new byte[1024*8];
		int len;//��¼��Ч����
		InputStream is=System.in; 
		PrintStream ps=System.out;
		while((len=is.read(a))!=-1) {
			ps.write(a,0,len);
		}
		is.close();
		ps.close();
	}
}
