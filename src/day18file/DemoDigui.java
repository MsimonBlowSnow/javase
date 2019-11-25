package day18file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

/*递归的弊端:不能调用次数过多,容易导致栈内存溢出
	 * 递归的好处:不用知道循环次数
	 * 
	 * 构造方法是否可以递归调用?
	 * 构造方法不能使用递归调用
	 * 
	 * 递归调用是否必须有返回值?
	 * 不一定(可以有,也可以没有)
 * 
 * 
 * 
 * 通过Java计算出一个javase夹有多少个文件，多少个java文件，多少.png文件
 * 思路:
 * 把src封装成一个File对象通过递归把所有文件放入一个File[]中
 * 对File[]数组进行遍历
 * */
public class DemoDigui {
	public static void main(String[] args) {
		File file = new File("./");
		List<File> filenameList= new ArrayList<>();
		filedigui(file, filenameList);
		System.out.println(filenameList.size());
		/*for (File file2 : filenameList) {
			System.out.println(file2);
		}*/
		
		//有多少个.ming文件  .ming自定义文件
		int flag=0;
		for (File file2 : filenameList) {
			if(file2.getName().endsWith(".ming")&&file2.isFile()) {
				System.out.println(file2);
				flag++;
			}
		}
		System.out.println(flag);
	}
	public static void filedigui(File file,List<File> files) {
		File[] allfiles=file.listFiles();
		for (File file2 : allfiles) {
			if(file2.isDirectory()) {
				filedigui(file2,files);
			}
			else if(file2.isFile()) {
				files.add(file2);
			}
		}
	}
	
}
