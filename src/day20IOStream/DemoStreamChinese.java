package day20IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* �ֽ�����ȡ���ĵ�����
 * һ������2���ֽ�
* �ֽ����ڶ����ĵ�ʱ���п��ܻ�����������,������� 
* �ֽ���д�����ĵ�����
* �ֽ���ֱ�Ӳ������ֽ�,����д�����ı��뽫�ַ���ת�����ֽ����� 
* д���س����� write("\r\n".getBytes());
*/
public class DemoStreamChinese {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("acopy.txt");
		FileInputStream  fis =new FileInputStream("a.txt");
		byte[] a=new byte[2];
		int flag;
		while((flag=fis.read(a))!=-1) {
			System.out.println( new String(a,0,a.length));
		}
		fos.write("���в�".getBytes());
		fos.write("\r\n".getBytes());
	}
}
