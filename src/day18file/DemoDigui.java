package day18file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

/*�ݹ�ı׶�:���ܵ��ô�������,���׵���ջ�ڴ����
	 * �ݹ�ĺô�:����֪��ѭ������
	 * 
	 * ���췽���Ƿ���Եݹ����?
	 * ���췽������ʹ�õݹ����
	 * 
	 * �ݹ�����Ƿ�����з���ֵ?
	 * ��һ��(������,Ҳ����û��)
 * 
 * 
 * 
 * ͨ��Java�����һ��javase���ж��ٸ��ļ������ٸ�java�ļ�������.png�ļ�
 * ˼·:
 * ��src��װ��һ��File����ͨ���ݹ�������ļ�����һ��File[]��
 * ��File[]������б���
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
		
		//�ж��ٸ�.ming�ļ�  .ming�Զ����ļ�
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
