package day18file;

import java.io.File;

public class DemoFileRight {

	/**
	 * * A:判断功能 public boolean isDirectory():判断是否是目录
	 * public boolean isFile():判断是否是文件
	 * public boolean exists():判断是否存在 
	 * public boolean canRead():判断是否可读 
	 * public booleancanWrite():判断是否可写 
	 * public boolean isHidden():判断是否隐藏 
	 * B:案例演示 File类的判断功能
	 */
	public static void main(String[] args) {
		// demo1();
		File file = new File("src/day18file/aaa");
		System.out.println(file.exists());
		file.setReadable(false);
		System.out.println(file.canRead()); // windows系统认为所有的文件都是可读的
		file.setWritable(false);
		System.out.println(file.canWrite()); // windows系统可以设置为不可写

		File file2 = new File("src/day18file/aaa");
		System.out.println(file2.isHidden()); // 判断是否是隐藏文件
		System.out.println(file.isHidden());
	}

	public static void demo1() {
		File dir1 = new File("aaa");
		System.out.println(dir1.isDirectory()); // 判断是否是文件夹

		File dir2 = new File("aaa");
		System.out.println(dir2.isDirectory());

		System.out.println(dir1.isFile()); // 判断是否是文件
		System.out.println(dir2.isFile());
	}

}
