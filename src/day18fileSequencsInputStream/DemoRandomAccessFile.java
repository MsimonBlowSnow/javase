package day18fileSequencsInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* A:�������������
	* RandomAccessFile����
	* RandomAccessFile�಻����������Object������ࡣ�����ں���InputStream��OutputStream�Ĺ��ܡ�
	* ֧�ֶ���������ļ��Ķ�ȡ��д�롣

* B:read(),write(),
* seek()������ָ��ָ��ָ��λ��
* 
* 2.RandomAccessFile�Ĺ���
	*"r" ��ֻ����ʽ�򿪡����ý��������κ� write �������������׳� IOException��  
	"rw" ���Ա��ȡ��д�롣������ļ��в����ڣ����Դ������ļ���  
	"rws" ���Ա��ȡ��д�룬���� "rw"����Ҫ����ļ������ݻ�Ԫ���ݵ�ÿ�����¶�ͬ��д�뵽�ײ�洢�豸��  
	"rwd"   ���Ա��ȡ��д�룬���� "rw"����Ҫ����ļ����ݵ�ÿ�����¶�ͬ��д�뵽�ײ�洢�豸�� 
	* RandomAccessFile(String, mode);
	* * RandomAccessFile(File, mode);
* */
public class DemoRandomAccessFile {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf= new RandomAccessFile("a.txt", "rw");
		int flag;
		while((flag=raf.read())!=-1) {
			System.out.write(flag);;
		}
		raf.write(97);//���ļ�������һ��a
		raf.seek(0);//���ļ�ָ��ָ����һ��λ��
		raf.write(98);//����ǰ���һ��b
		
	}
}
