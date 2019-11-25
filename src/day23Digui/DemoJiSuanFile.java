package day23Digui;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

/*
 * 
 * 
 * */
public class DemoJiSuanFile {
	public static void main(String[] args) {
		String file;
		Scanner sc=new Scanner(System.in); 
		System.out.println("请输入你要计算的文件:");
		file=sc.nextLine();
		long big=0;
		if(file!=null) {
			File file1=new File(file);
			System.out.println(method1(file1,big));
		}
	}

	private static long method1(File file,long big) {
		if(file.exists()) {	
			if(file.isDirectory()) {
				File[] file1=file.listFiles();
				for (File file2 : file1) {
					big=method1(file2, big);
				}
			}else{
				return big+file.length();
			}
		}
		return big;
		}
	}
