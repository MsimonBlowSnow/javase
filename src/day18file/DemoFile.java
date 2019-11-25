package day18file;

import java.io.File;

/* A:File类的概述
	* File更应该叫做一个路径
		* 文件路径或者文件夹路径  
		* 路径分为绝对路径和相对路径
		* 绝对路径是一个固定的路径,从盘符开始
		* 相对路径相对于某个位置,在eclipse下是指当前项目下,在dos下
	* 查看API指的是当前路径
	* 文件和目录路径名的抽象表示形式
* B:构造方法
	* File(String pathname)：根据一个路径得到File对象
	* File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
	* File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
* C:案例演示
	* File类的构造方法

 * 
 */
public class DemoFile {
	public static void main(String[] args) {
		//绝对路径
		File file = new File("D:\\workspace\\workspace\\javase\\src\\day17set\\DemoTree.java");
		System.out.println(file.exists());
		//相对路径 eclipse中相对于本项目
		File file1 = new File("src/day17set/DemoTree.java");
		System.out.println(file1.exists());
		File file2 =new  File("nmmp");
		System.out.println(file2.exists());
	
		//File(String parent, String child),
		//本实例中的parent相等与eclipse中的默认路径
		File file3=new  File("D:\\workspace\\workspace\\javase","src\\day17set\\DemoTree.java");
		System.out.println(file3.exists());
		
		//File(File parent, String child)
		//先把parent封装成File
		String parent="D:\\workspace\\workspace\\javase";
		File file4=new File(parent);
		File file5=new File(parent,"src\\day17set\\DemoTree.java");
		System.out.println(file4.exists());
		System.out.println(file5.exists());
	}
}
