package day18file;

import java.io.File;

public class DemoFileRight {

	/**
	 * * A:�жϹ��� public boolean isDirectory():�ж��Ƿ���Ŀ¼
	 * public boolean isFile():�ж��Ƿ����ļ�
	 * public boolean exists():�ж��Ƿ���� 
	 * public boolean canRead():�ж��Ƿ�ɶ� 
	 * public booleancanWrite():�ж��Ƿ��д 
	 * public boolean isHidden():�ж��Ƿ����� 
	 * B:������ʾ File����жϹ���
	 */
	public static void main(String[] args) {
		// demo1();
		File file = new File("src/day18file/aaa");
		System.out.println(file.exists());
		file.setReadable(false);
		System.out.println(file.canRead()); // windowsϵͳ��Ϊ���е��ļ����ǿɶ���
		file.setWritable(false);
		System.out.println(file.canWrite()); // windowsϵͳ��������Ϊ����д

		File file2 = new File("src/day18file/aaa");
		System.out.println(file2.isHidden()); // �ж��Ƿ��������ļ�
		System.out.println(file.isHidden());
	}

	public static void demo1() {
		File dir1 = new File("aaa");
		System.out.println(dir1.isDirectory()); // �ж��Ƿ����ļ���

		File dir2 = new File("aaa");
		System.out.println(dir2.isDirectory());

		System.out.println(dir1.isFile()); // �ж��Ƿ����ļ�
		System.out.println(dir2.isFile());
	}

}
