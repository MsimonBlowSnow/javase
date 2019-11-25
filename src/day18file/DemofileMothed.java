package day18file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * * A:获取功能
	* public String getAbsolutePath()：获取绝对路径
	* public String getPath():获取路径
	* public String getName():获取名称
	* public long length():获取长度。字节数
	* public long lastModified():获取最后一次的修改时间，毫秒值
	* public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
	* public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组 
* B:案例演示
	* File类的获取功能
  */
public class DemofileMothed {
	public static void main(String[] args) {
		method();
		File c=new File("src");
		String[] c1=c.list();
		File[] files=c.listFiles();
		for (String  str: c1) {
			System.out.println(str);
		}
		System.out.println("file文件数组:");
		for (File file : files) {
			System.out.println(file);
		}
	}

	private static void method() {
		File file= new File("aaa");
		File file1= new File("D:/workspace/workspace/javase/src/day17set/DemoTree.java");
		System.out.println(file.getAbsoluteFile());//获取绝对路径
		System.out.println(file1.getAbsoluteFile());
		System.out.println(file.getPath());//获取写入的路径，就是aaa
		System.out.println(file1.getPath());//获取写入的路径，就是D:/workspace/workspace/javase/src/day17set/DemoTree.java
		System.out.println(file.getName());//获取文件名
		System.out.println(file1.getName());
		System.out.println(file.exists());
		System.out.println(file.length());
		System.out.println(file1.length());
		Date  date=new Date(file.lastModified());
		Date  date1=new Date(file1.lastModified());
		SimpleDateFormat a=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println(date);
		System.out.println(date1);
		System.out.println(a.format(date));
		System.out.println(a.format(date1));
		
		System.out.println(file1.exists());
	}
}
