package day18fileSequencsInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/* 1.ʲô�Ǳ�׼���������(����)
	* System.in��InputStream, ��׼������, Ĭ�Ͽ��ԴӼ��������ȡ�ֽ�����
	* System.out��PrintStream, ��׼�����, Ĭ�Ͽ�����Console������ַ����ֽ�����
	*1.1system.in����һ��InputStream��methodSystemIn();
		*read()ֻ�ܶ�һ���ֽ�
		*���û�н����ܵ�������û�к�ϵͳ��Դ���ӣ����ܹر�������������Ͳ���������
		*systtem.out��û�й����ļ�ʱҲ���ù�	 
 * 
 * 
 */
public class DemoSystemIn {
	public static void main(String[] args) throws IOException {
		//methodSystemIn();
		//�ı�Ĭ�ϱ�׼������Ĭ����ָ����̵ģ��ı��ָ���ļ���һ�㲻����
		System.setIn(new FileInputStream("c.txt"));
		System.setOut(new PrintStream("a.txt"));
		int flag;
		InputStream iS=System.in;
		PrintStream pStream=System.out;
		while ((flag=iS.read())!=-1) {
			pStream.write(flag);
		}
		//�������ļ�������ر���
		iS.close();
		pStream.close();
	}

	private static void methodSystemIn() throws IOException {
		InputStream iStream=System.in;
		int a=iStream.read();//һ���ֽ�һ���ֽڵĶ�
		System.out.println(a);//����43�����52��4��aslll��52
		//���û�н����ܵ������ܹ�����ϵͳ����ֻ��һ��System.in���£�
		iStream.close();
		InputStream iStream1=System.in;
		int a1=iStream.read();//һ���ֽ�һ���ֽڵĶ�
		System.out.println(a);
	}
}
