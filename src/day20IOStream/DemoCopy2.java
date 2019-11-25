package day20IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*ͨ������С���������Copy
 * ���⣺
*	���������鲻���ļ���С�������������һ�������������һ��������Ч������method1()��
*	��������
*	fileInputStream����read(byte[] a)����һ����Чֵ����
*	fileOutputstream������һ����д��Ч��
*	write(byte[] a,int off,int len)������a����Ϊoff��len��������len��
*	д���ļ�����
*	flag=Read(byte[] a)��
*	write(a,0,Read(byte[] a))�ͽ����;
*	��method2
*��׼��ʽ:
*	һ������ᶨ����Ϊ1024��������
*	��ʽ��Method3
*/
public class DemoCopy2 {
	public static void main(String[] args) throws IOException {
		//method1();
		//method2();
		method3();
	}

	private static void method3() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("src/day20IOStream/licunxu.jpg");
		FileOutputStream fos= new FileOutputStream("src/day20IOStream/Copylicx.jpg");
		byte[] a= new byte[1024*8];
		int flag=0;
		while((flag=fis.read(a))!=-1) {//��read()��һ��Ҫд����
			fos.write(a,0,flag);
		}
	}

	private static void method2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("src/day20IOStream/DemoCopy2.txt");
		FileOutputStream fos= new FileOutputStream("src/day20IOStream/CopyDemoCopy2.txt");
		byte[] a= new byte[2];
		int flag=0;
		while((flag=fis.read(a))!=-1) {//flag������Ч����
			fos.write(a,0,flag);
		}
	}

	private static void method1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("src/day20IOStream/DemoCopy2.txt");
		byte[] a= new byte[2];
		int flag=0;
		while((flag=fis.read(a))!=-1) {
			/*���ļ���ֻ�������ַ�ȱ������ĸ��ַ���
			ӦΪ�ڵڶ�������ʱ,�������ַ������˵�һ���ַ�����û�е��ĸ��ַ�
			������a[0]mû�б䣬���������Ҳ��д���ļ���*/
			System.out.println(Arrays.toString(a));
		}
	}
}
