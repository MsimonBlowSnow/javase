package day23Digui;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*���⣺����һ���ļ���ͨ���ݹ�ȥ������
 	*���裺
 		*1.����һ���ļ����ж����ļ������ļ��У�ֻ�����ļ��вŷ���
 		*2.����һ���ļ��У��ݹ�������ļ���copy,�ļ��м����ݹ� 
 		*3.�����ַ�����copy�ļ��� 
 * */
public class DemodirFileCopy {
	public static void main(String[] args) throws IOException {
		
		
		
		File file=methodFile();
		System.out.println("��������Ҫ����������:");
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
				
				//�жϸ��ļ����Ƿ��ڿ���·�����ڣ������ڣ��ʹ���
				if(file2.isDirectory()) {
					//�ÿ����ļ��еľ���·��ȥ���ԭԭ�ļ��е�·�����ǿ����ļ�������Ķ�����ԭ�ļ���·����һ����
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
		System.out.println("��������Ҫ�������ļ�:");
		String pathname = scanner.nextLine();
		File file;
		while (true) {
			
			 file = new File(pathname);
			if (file.isDirectory()) {
				 return file;
			} else {
				System.out.println("����������:");
			}
		}
	}
}
