package day20IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*����IOException
 * �������Ϊjava1.6�������쳣�Ĵ���method
 * 1.���������ص�
 * 2��try{}finally{}��Ϊ�˱�֤�����������
 * ��ֹһ�������ִ�����һ���ز���
 * 
 * 1.7�汾��ʵ����autocloseable�ӿ�
 * ��method17
 * */
public class DemoIOSException {
	public static void main(String[] args) throws IOException {
		//1.6�汾����IOException
		method();
		//1.7�汾��ʵ����autocloseable�ӿ�
		method17(); 
	}

	private static void method17() throws IOException, FileNotFoundException {
		try(FileInputStream fis=new FileInputStream("a.txt");
				//ʵ��AutoCloseable�ӿڣ���дclose����
				//�ر���ʱ�Զ�ִ��close����
				Stream17 sk=new Stream17();
				FileOutputStream fos=new FileOutputStream("acopy.txt");) { 
			int flag = 0;
			while ((flag = fis.read()) != -1) {
				fos.write(flag);
			} 
		}
	}

	private static void method() throws FileNotFoundException, IOException {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis = new FileInputStream("a.txt");
			fos = new FileOutputStream("acopy.txt");
			int flag = 0;
			while ((flag = fis.read()) != -1) {
				fos.write(flag);
			} 
		} finally {
			//���û��try{}finally{},��������쳣�������������Ͳ��ܹر�
			try {
				if (fis != null)
					fis.close();
			} finally {
				if(fos!=null)
				fos.close();
			}
			
		}
	}
}

class Stream17 implements AutoCloseable{

	@Override
	public void close()  {
		System.out.println("1.7�汾�ر�������");
	}
	
}