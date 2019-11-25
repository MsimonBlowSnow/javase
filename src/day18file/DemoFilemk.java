package day18file;

import java.io.File;
import java.io.IOException;

/* A:创建功能
	* public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
	* public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
	* public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
* B:案例演示
	* File类的创建功能
	* 注意事项：
		* 如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下。 
* C:重命名和删除功能
	* public boolean renameTo(File dest):把文件重命名为指定的文件路径
	* public boolean delete():删除文件或者文件夹
* D:重命名注意事项
	* 如果路径名相同，就是改名。
	* 如果路径名不同，就是改名并剪切。
* E:删除注意事项：
	* Java中的删除不走回收站。
	* 要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
		
*/
public class DemoFilemk {
	public static void main(String[] args) throws IOException {
		File file=new File("ming.txt");
		//存在返回false，不存在就创建并返回true
		System.out.println(file.createNewFile());
		//文件不一定有后缀，不过一般会加上后缀，便于识别
		File file1 = new File("aaa");
		System.out.println(file1.createNewFile());
		
		//创建单机文件夹,存在返回false，不存在就创建并返回true
		File file2 = new File("ming");
		System.out.println(file2.mkdir());
		
		//文件夹可以有后缀，不过一般不建议写后缀
		File file3 = new File("ming.txt1");
		System.out.println(file3.mkdir());
		
		//创建多级文件夹
		File file4= new File("ming\\ming");
		System.out.println(file4.mkdirs());
		
		//renameTo(File file)
		//如果路径名相同，就是改名。 如果路径名不同，就是改名并剪切。
		methodRename(file);
		
		//detele()
		//Java中的删除不走回收站,要删除一个文件夹，
		//请注意该文件夹内不能包含文件或者文件夹
		//删除aaa
		System.out.println(file1.delete());
	}

	private static void methodRename(File file) {
		File file5=new File("minggai.txt");
		System.out.println(file.renameTo(file5));
	}
}
