package day20IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*A write()һ��д��һ���ֽ�
* ���file������,�ᴴ����һ��
* B	 ����FileOutputStream(file);ɾ����������Ūд,
* 	 ����FileOutputStream(file,true);�ں���׷��,
*/
public class DemoFileOutputStream {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("src/day20IOStream/b.txt");	
		//fos.write(97);//��Ȼд������һ��int��,������д����ʱ��Ὣǰ���24��0ȥ��,����д����һ��byte
		fos.write(98);
		fos.write(98);
		fos.close();
		FileOutputStream appendfos= new FileOutputStream("src/day20IOStream/b.txt",true);
		appendfos.write(110);
		appendfos.write(109);
		appendfos.close();

	}
}
