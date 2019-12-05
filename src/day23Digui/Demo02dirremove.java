package day23Digui;

import java.io.File;
import java.util.Scanner;

/*删除文件夹
 	*1.输入一个文件夹或文件	 
 	* 如果是文件就删除，如果是文件夹就获取该文件夹的文件数组，并一个一个的递归 
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
			System.out.println("请输入一个文件夹:");
			file=scanner.nextLine();
			file1=new File(file);
		if(file1.exists()) {
			if(file1.isDirectory()) {
				return file1;
			}else {
				System.out.println("请输入一个文件夹:");
			}
		}
	}
	}
}
