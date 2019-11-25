package day20IOStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* flush()����
* ����ˢ�»�������,ˢ�º�����ٴ�д��,
* ���Bufferedûд������Ҫ����flush��ˢ�£�ˢ�µ��ļ���ȥ 
* close()����
* �����ر����ͷ���Դ�ĵ�,����Ǵ����������������close()����,
* ������ر���,�����ٹر���֮ǰˢ�»�����,�رպ�����д�� 
*/
public class DemoFlushAndClose {
	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("src/day20IOStream/a.txt");
		FileOutputStream fos =new FileOutputStream("src/day20IOStream/a.txt");
		BufferedInputStream bfis=new BufferedInputStream(fis);
		BufferedOutputStream bfos=new BufferedOutputStream(fos);
		int flag=0;
		
		while((flag=fis.read())!=-1) {
			fos.write(flag);
			fos.flush();
		}
		fis.close();
		fos.close();
	}
}
