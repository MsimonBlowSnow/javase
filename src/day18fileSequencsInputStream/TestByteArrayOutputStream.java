package day18fileSequencsInputStream;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* ����һ���ļ�������,����read(byte[] b)����,
 * ��a.txt�ļ��е����ݴ�ӡ����(byte�����С����Ϊ5)
 * ���⣺
 	*byte����Ϊ5�������ļ�����������(ռ�����ֽ�)�����п��ܳ������� 
 * ����˼·:
 	*����һ���ڴ�������������������ֽڷ����ڴ�������У�
 	*���ļ����꣬һ����ת����ַ��������
*/
public class TestByteArrayOutputStream {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream baos= new ByteArrayOutputStream();
		FileInputStream fis= new FileInputStream("c.txt");//Ĭ��·��Javase��Ŀ��
		int flag;
		byte[] a= new byte[5];
		while((flag=fis.read(a))!=-1) {//flagΪ��Ч����
			baos.write(a,0,flag);//д���ļ�����Ч����
		}
		System.out.println(baos);//ByteAByteArrayOutputStream��д��tostring()����
		baos.close();//�ײ������鿪���ģ���û�н����ܵ�(��)���в��رգ�Ҳû��ϵ
	}
}
