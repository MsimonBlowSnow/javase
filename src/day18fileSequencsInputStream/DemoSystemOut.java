package day18fileSequencsInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
/* 1.ʲô�Ǵ�ӡ��
* �������Ժܷ���Ľ������toString()������, �����Զ����ϻ���, ���ҿ���ʹ���Զ�ˢ����ģʽ
* System.out����һ��PrintStream, ��Ĭ�������̨�����Ϣ
* 2.ʹ�÷�ʽ
* ��ӡ: print(), println()
* �Զ�ˢ��: PrintWriter(OutputStream out, boolean autoFlush, String encoding) 
* ��ӡ��ֻ��������Ŀ��
*/
public class DemoSystemOut {
	public static void main(String[] args) throws FileNotFoundException {
		methodprintStream();
		//��true ����������Զ�ˢ���Ĺ��ܲ���ֻ�����println()����
		PrintWriter pw = new PrintWriter(new FileOutputStream("g.txt"),true);
		pw.print(true);
		pw.write(97);
		pw.println(97);
		pw.write(99);
		//pw.close;//�����������println()���Զ�ˢ���Ĺ���,println()ǰ��Ļ�ˢ��,����Ĳ���
	}

	private static void methodprintStream() throws FileNotFoundException {
		PrintStream ps = System.out;
		ps.println(97);					//��ʵ�ײ��õ���Integer.toString(x),��xת��Ϊ�����ַ�����ӡ
		ps.write(97);					//a,ת�����ַ���
		ps.println("xxx");
		ps.println(new Person(23,"����"));
		Person p = null;
		ps.println(p);//�����null,�ͷ���null,�������null,�͵��ö����toString()
		PrintWriter pw = new PrintWriter(new FileOutputStream("g.txt"), true);
		pw.write(97);
		pw.print("��Һ�");
		pw.println("���");				//�Զ�ˢ��,ֻ��Ե���println����
		pw.close();
	}
}
