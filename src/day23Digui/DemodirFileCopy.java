package day23Digui;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*问题：输入一个文件，通过递归去拷贝，
 	*步骤：
 		*1.输入一个文件夹判断是文件还是文件夹，只有是文件夹才返回
 		*2.输入一个文件夹，递归如果是文件就copy,文件夹继续递归 
 		*3.创建字符流，copy文件。 
 * */
public class DemodirFileCopy {
	public static void main(String[] args) throws IOException {
		
		
		
		File file=methodFile();
		System.out.println("请输入你要拷贝到那里:");
		Scanner scanner = new Scanner(System.in);
		String pathname = scanner.nextLine();
		File fileC=new File(pathname);
		fileC.mkdir();
		methodDigui(file,fileC,file.getAbsolutePath());
	}

	private static void methodDigui(File file,File fileC,String yfile) throws IOException {
		if(file.isDirectory()) {
			File[] files=file.listFiles();
			for (File file2 : files) {
				
				//判断该文件夹是否在拷贝路径存在，不存在，就创建
				if(file2.isDirectory()) {
					//用拷贝文件夹的绝对路径去替代原原文件夹的路径，是拷贝文件夹里面的东西和原文件夹路径是一样的
					StringBuilder strb=new StringBuilder(file2.getAbsolutePath());
					String pathC=new String(strb.replace(0,yfile.length(),fileC.getAbsolutePath()));
					File pathCF=new File(pathC);
					pathCF.mkdir();
				}
				methodDigui(file2, fileC,yfile);
			}
		}else {
			String path2=fileC.getAbsolutePath();
			fileCopy(file, yfile, path2);
		}
	}
	private static void fileCopy(File file,String path,String pathCopy) throws IOException {
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
		StringBuilder strb=new StringBuilder(file.getAbsolutePath());
		String pathC=new String(strb.replace(0, path.length(), pathCopy));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(pathC));
		byte[] a=new byte[8*1024];
		int flag=0;
		while((flag=bis.read(a))!=-1) {
			bos.write(a);
		}
		bis.close();
		bos.close();
	}

	private static File methodFile() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你要拷贝的文件:");
		String pathname = scanner.nextLine();
		File file;
		while (true) {
			
			 file = new File(pathname);
			if (file.isDirectory()) {
				 return file;
			} else {
				System.out.println("请重新输入:");
			}
		}
	}
}
