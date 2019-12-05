package day18file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/*A:案例演示
	* 需求：判断E盘目录下是否有后缀名为.png的文件，如果有，就输出该文件名称 
* B:文件名称过滤器的概述
	* public String[] list(FilenameFilter filter)
	* public File[] listFiles(FileFilter filter)
* C:文件名称过滤器的使用
	* 需求：判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
* D:源码分析
	* 带文件名称过滤器的list()方法的源码

 */
public class TestFile {
	public static void main(String[] args) {
		//自己实现
		methodmy();
		//通过list(new listnameFilter())过滤器
		methodList();
		//通过listFiles(new FileFilter())过滤器
		methodListFiles();
	}

	private static void methodListFiles() {
		File file=new  File("src/day15jihe");
		//获取满足条件的文件路径
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
		//获取满足条件的文件名
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
