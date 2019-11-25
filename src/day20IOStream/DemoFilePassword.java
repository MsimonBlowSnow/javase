package day20IOStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*ͼƬ���ܣ�
 * �������������ȡͼƬ�ֽ�������������һ�����֣�Ȼ���������ļ��Ϳ�����
 * ���룺����Ǹ����������ν����ͬ
 * ���磺����ͼƬ����
 * */
public class DemoFilePassword {
	public static void main(String[] args) throws IOException {
		methodJiaPassword();
		methodJiePassword();
	}

	private static void methodJiePassword() throws FileNotFoundException, IOException {
		FileInputStream fis= new FileInputStream("src/day20IOStream/Passwordlicunxu.jpg");
		FileOutputStream fos=new FileOutputStream("src/day20IOStream/Jielicunxu.jpg");
		
		//1.7�汾�ر�������
		try(BufferedInputStream bfis= new BufferedInputStream(fis);
			BufferedOutputStream bfos = new BufferedOutputStream(fos);){
			int flag=0;
			while ((flag=bfis.read())!=-1) {
				bfos.write(flag^123456);
			}
		}
	}

	private static void methodJiaPassword() throws FileNotFoundException, IOException {
		FileInputStream fis= new FileInputStream("src/day20IOStream/licunxu.jpg");
		FileOutputStream fos=new FileOutputStream("src/day20IOStream/Passwordlicunxu.jpg");
		
		//1.7�汾�ر�������
		try(BufferedInputStream bfis= new BufferedInputStream(fis);
			BufferedOutputStream bfos = new BufferedOutputStream(fos);){
			int flag=0;
			while ((flag=bfis.read())!=-1) {
				bfos.write(flag^123456);
			}
		}
	}
}
