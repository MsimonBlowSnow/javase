package day18file;

import java.io.File;
import java.io.IOException;

/* A:��������
	* public boolean createNewFile():�����ļ� ��������������ļ����Ͳ�������
	* public boolean mkdir():�����ļ��� ��������������ļ��У��Ͳ�������
	* public boolean mkdirs():�����ļ���,������ļ��в����ڣ�����㴴������
* B:������ʾ
	* File��Ĵ�������
	* ע�����
		* ����㴴���ļ������ļ�������д�̷�·������ô��Ĭ������Ŀ·���¡� 
* C:��������ɾ������
	* public boolean renameTo(File dest):���ļ�������Ϊָ�����ļ�·��
	* public boolean delete():ɾ���ļ������ļ���
* D:������ע������
	* ���·������ͬ�����Ǹ�����
	* ���·������ͬ�����Ǹ��������С�
* E:ɾ��ע�����
	* Java�е�ɾ�����߻���վ��
	* Ҫɾ��һ���ļ��У���ע����ļ����ڲ��ܰ����ļ������ļ���
		
*/
public class DemoFilemk {
	public static void main(String[] args) throws IOException {
		File file=new File("ming.txt");
		//���ڷ���false�������ھʹ���������true
		System.out.println(file.createNewFile());
		//�ļ���һ���к�׺������һ�����Ϻ�׺������ʶ��
		File file1 = new File("aaa");
		System.out.println(file1.createNewFile());
		
		//���������ļ���,���ڷ���false�������ھʹ���������true
		File file2 = new File("ming");
		System.out.println(file2.mkdir());
		
		//�ļ��п����к�׺������һ�㲻����д��׺
		File file3 = new File("ming.txt1");
		System.out.println(file3.mkdir());
		
		//�����༶�ļ���
		File file4= new File("ming\\ming");
		System.out.println(file4.mkdirs());
		
		//renameTo(File file)
		//���·������ͬ�����Ǹ����� ���·������ͬ�����Ǹ��������С�
		methodRename(file);
		
		//detele()
		//Java�е�ɾ�����߻���վ,Ҫɾ��һ���ļ��У�
		//��ע����ļ����ڲ��ܰ����ļ������ļ���
		//ɾ��aaa
		System.out.println(file1.delete());
	}

	private static void methodRename(File file) {
		File file5=new File("minggai.txt");
		System.out.println(file.renameTo(file5));
	}
}
