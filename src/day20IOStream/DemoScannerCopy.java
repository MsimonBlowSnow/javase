package day20IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/* ������¼������ݿ�������ǰ��Ŀ�µ�text.txt�ļ���,
 * ����¼�����ݵ�����quitʱ���˳�
 * ˼·:
 	*1.�����������Scanner����
 	*2.����ѭ�� �������������Ϊquit�˳�
 	*3.ͨ��ʹ��getByte()���������ַ���ת��Ϊbtye����
 	*4.ͨ�������
 	*5.�ر�������	
*/
public class DemoScannerCopy {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		FileOutputStream fos= new FileOutputStream("a.txt");
		while(true) {
			System.out.println("������һ������");
			String string=sc.nextLine();
			if(string.equals("quit"))
				break;
			else {
				fos.write(string.getBytes());
				fos.write("\r\n".getBytes());
			}
		}
		fos.close();
		sc.close();
	}
}
