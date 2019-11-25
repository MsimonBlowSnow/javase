package day18file;

import java.io.File;

/* A:File��ĸ���
	* File��Ӧ�ý���һ��·��
		* �ļ�·�������ļ���·��  
		* ·����Ϊ����·�������·��
		* ����·����һ���̶���·��,���̷���ʼ
		* ���·�������ĳ��λ��,��eclipse����ָ��ǰ��Ŀ��,��dos��
	* �鿴APIָ���ǵ�ǰ·��
	* �ļ���Ŀ¼·�����ĳ����ʾ��ʽ
* B:���췽��
	* File(String pathname)������һ��·���õ�File����
	* File(String parent, String child):����һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
	* File(File parent, String child):����һ����File�����һ�����ļ�/Ŀ¼�õ�File����
* C:������ʾ
	* File��Ĺ��췽��

 * 
 */
public class DemoFile {
	public static void main(String[] args) {
		//����·��
		File file = new File("D:\\workspace\\workspace\\javase\\src\\day17set\\DemoTree.java");
		System.out.println(file.exists());
		//���·�� eclipse������ڱ���Ŀ
		File file1 = new File("src/day17set/DemoTree.java");
		System.out.println(file1.exists());
		File file2 =new  File("nmmp");
		System.out.println(file2.exists());
	
		//File(String parent, String child),
		//��ʵ���е�parent�����eclipse�е�Ĭ��·��
		File file3=new  File("D:\\workspace\\workspace\\javase","src\\day17set\\DemoTree.java");
		System.out.println(file3.exists());
		
		//File(File parent, String child)
		//�Ȱ�parent��װ��File
		String parent="D:\\workspace\\workspace\\javase";
		File file4=new File(parent);
		File file5=new File(parent,"src\\day17set\\DemoTree.java");
		System.out.println(file4.exists());
		System.out.println(file5.exists());
	}
}
