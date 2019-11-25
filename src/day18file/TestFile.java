package day18file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/*A:������ʾ
	* �����ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.png���ļ�������У���������ļ����� 
* B:�ļ����ƹ������ĸ���
	* public String[] list(FilenameFilter filter)
	* public File[] listFiles(FileFilter filter)
* C:�ļ����ƹ�������ʹ��
	* �����ж�E��Ŀ¼���Ƿ��к�׺��Ϊ.jpg���ļ�������У���������ļ�����
* D:Դ�����
	* ���ļ����ƹ�������list()������Դ��

 */
public class TestFile {
	public static void main(String[] args) {
		//�Լ�ʵ��
		methodmy();
		//ͨ��list(new listnameFilter())������
		methodList();
		//ͨ��listFiles(new FileFilter())������
		methodListFiles();
	}

	private static void methodListFiles() {
		File file=new  File("src/day15jihe");
		//��ȡ�����������ļ�·��
		File[] files =file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				
				return pathname.isFile()&&pathname.getName().endsWith(".png");
			}
		});
		for (File file2 : files) {
			System.out.println(file2.getName());
		}
	}

	private static void methodList() {
		File file=new  File("src/day15jihe");
		//��ȡ�����������ļ���
		String[] files=file.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				File file=new File(dir,name);
				return file.isFile()&&file.getName().endsWith(".png");
			}
		});
		for (String string : files) {
			System.out.println(string);
		}
	}

	private static void methodmy() {
		File file=new  File("src/day15jihe");
		File[] files=file.listFiles();
		for (File file2 : files) {
			if(file2.isFile()&&file2.getName().endsWith(".png")) {
				System.out.println(file2);
			}
		}
	}
}
