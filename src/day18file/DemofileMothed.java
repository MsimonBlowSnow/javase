package day18file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * * A:��ȡ����
	* public String getAbsolutePath()����ȡ����·��
	* public String getPath():��ȡ·��
	* public String getName():��ȡ����
	* public long length():��ȡ���ȡ��ֽ���
	* public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
	* public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
	* public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File���� 
* B:������ʾ
	* File��Ļ�ȡ����
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
		System.out.println("file�ļ�����:");
		for (File file : files) {
			System.out.println(file);
		}
	}

	private static void method() {
		File file= new File("aaa");
		File file1= new File("D:/workspace/workspace/javase/src/day17set/DemoTree.java");
		System.out.println(file.getAbsoluteFile());//��ȡ����·��
		System.out.println(file1.getAbsoluteFile());
		System.out.println(file.getPath());//��ȡд���·��������aaa
		System.out.println(file1.getPath());//��ȡд���·��������D:/workspace/workspace/javase/src/day17set/DemoTree.java
		System.out.println(file.getName());//��ȡ�ļ���
		System.out.println(file1.getName());
		System.out.println(file.exists());
		System.out.println(file.length());
		System.out.println(file1.length());
		Date  date=new Date(file.lastModified());
		Date  date1=new Date(file1.lastModified());
		SimpleDateFormat a=new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		System.out.println(date);
		System.out.println(date1);
		System.out.println(a.format(date));
		System.out.println(a.format(date1));
		
		System.out.println(file1.exists());
	}
}
