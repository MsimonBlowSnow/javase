package day23Digui;

import java.io.File;
import java.util.Scanner;

/*ɾ���ļ���
 	*1.����һ���ļ��л��ļ�	 
 	* ������ļ���ɾ����������ļ��оͻ�ȡ���ļ��е��ļ����飬��һ��һ���ĵݹ� 
 * */
public class Demo02dirremove {
	public static void main(String[] args) {
		File file=method();
		methodRemove(file);
	}

	private static void methodRemove(File file) {
		if(file.isDirectory()) {
			File[] files=file.listFiles();
			for (File file2 : files) {
				methodRemove(file2);
			}
			
		}else {
			file.delete();
		}
		file.delete();
	}

	private static File method() {
		Scanner scanner=new Scanner(System.in);
		String file;
		File file1;
		while(true) {
			System.out.println("������һ���ļ���:");
			file=scanner.nextLine();
			file1=new File(file);
		if(file1.exists()) {
			if(file1.isDirectory()) {
				return file1;
			}else {
				System.out.println("������һ���ļ���:");
			}
		}
	}
	}
}
