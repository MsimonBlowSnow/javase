package day21IOStreamRead;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/*LineNumberRead
 * ���л�ȡ��������������һ�п�ʼ
 * getLineNumber()��ȡ����
 *setLineNumber()��������
 */
public class DemoLineNumberRead {
	public static void main(String[] args) throws IOException {
		LineNumberReader lnr= new LineNumberReader(new FileReader("c.txt"));
		String flag;
		//��ȡ����
		//nethodGetLine(lnr);
		System.out.println("��������==========================");
		//��������������+1��������31�У�lnr.setLineNumber(30);
		methodSetLine(lnr);
	}

	private static void methodSetLine(LineNumberReader lnr) throws IOException {
		lnr.setLineNumber(30);
		String flag;
		while ((flag=lnr.readLine())!=null){
			System.out.println(lnr.getLineNumber()+":"+flag);
		}
		lnr.close();
	}

	private static void nethodGetLine(LineNumberReader lnr) throws IOException {
		String flag;
		while ((flag=lnr.readLine())!=null){
			System.out.println(lnr.getLineNumber()+":"+flag);
		}
	}
}
