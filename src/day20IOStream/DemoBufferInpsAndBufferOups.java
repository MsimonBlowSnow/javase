package day20IOStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* A:����˼��
	* �ֽ���һ�ζ�дһ��������ٶ����Ա�һ�ζ�дһ���ֽڵ��ٶȿ�ܶ࣬
	* ���Ǽ��������������Ļ�����Ч����java��������Ƶ�ʱ��
	* Ҳ���ǵ������������˼��(װ�����ģʽ���潲��)�������ṩ���ֽڻ�������
* B.BufferedInputStream
	* BufferedInputStream������һ��������(����)
	* ��BufferedInputStream�ж�ȡһ���ֽ�ʱ
	* BufferedInputStream��һ���Դ��ļ��ж�ȡ8192��,
	*  ���ڻ�������, ���ظ�����һ��
	* �����ٴζ�ȡʱ, �Ͳ������ļ���, ֱ�Ӵӻ������л�ȡ
	* ֱ�������������еĶ���ʹ�ù�, �����´��ļ��ж�ȡ8192��
* C.BufferedOutputStream
	* BufferedOutputStreamҲ������һ��������(����)
	* ����������д���ֽ�ʱ, ����ֱ��д���ļ�, ��д����������
	* ֱ��������д��, BufferedOutputStream�Ż�ѻ������е�����һ����д���ļ���
** D.С����Ķ�д�ʹ�Buffered�Ķ�ȡ�ĸ�����?
	* ����С���������8192���ֽڴ�С��Buffered�ȽϵĻ�
	* ����С�������ʤһ��,��Ϊ����д��������ͬһ������
	* ��Buffered����������������
 * */
public class DemoBufferInpsAndBufferOups {
	public static void main(String[] args) throws IOException {
		/*�����ļ������������������,����
		src/day20IOStream/licunxu.png��
		src/day20IOStream/Copylicunxu.png*/
		FileInputStream fis=new FileInputStream("src/day20IOStream/licunxu.png");
		FileOutputStream fos = new FileOutputStream("src/day20IOStream/Copylicunxu.png");
		
		
		//������������bfin��bfos
		BufferedInputStream bfin= new BufferedInputStream(fis);
		BufferedOutputStream bfos = new BufferedOutputStream(fos);
		int flag=0;
		while((flag=bfin.read())!=-1) {
			bfos.write(flag);
		}
		bfin.close();						//ֻ��װ�κ�Ķ��󼴿�
		bfos.close();
	}
}
