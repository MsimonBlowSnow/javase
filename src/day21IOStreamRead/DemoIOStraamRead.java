package day21IOStreamRead;

import java.io.FileReader;
import java.io.IOException;

/* 1.�ַ�����ʲô
* �ַ����ǿ���ֱ�Ӷ�д�ַ���IO��
* �ַ�����ȡ�ַ�, ��Ҫ�ȶ�ȡ���ֽ�����, Ȼ��תΪ�ַ�. ���Ҫд���ַ�, ��Ҫ���ַ�תΪ�ֽ���д��.    
* 2.FileReader
* FileReader���read()�������԰����ַ���С��ȡ
* 
	FileReader fr = new FileReader("aaa.txt");				//��������������,����aaa.txt
	int ch;
	while((ch = fr.read()) != -1) {							//���������ַ���ֵ��ch
		System.out.println((char)ch);						//���������ַ�ǿת���ӡ
	}
	
	fr.close();												//���� 
/
public class DemoIOStraamRead {
	public static void main(String[] args) {
		
	}
}
*/
public class DemoIOStraamRead {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("a.txt");				//��������������,����aaa.txt
		int ch;
		while((ch = fr.read()) != -1) {							//���������ַ���ֵ��ch
			System.out.println((char)ch);						//���������ַ�ǿת���ӡ
		}
		fr.close();
	}
}
