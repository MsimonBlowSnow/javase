package day13regx;

import java.util.Arrays;

/*System����
 * ���췽����˽�еĲ��ܴ������
 * * A:System��ĸ���
	* System �����һЩ���õ����ֶκͷ����������ܱ�ʵ������ 
* B:��Ա����
	* public static void gc()//֪ͨ��������ϵͳ
	* public static void exit(int status)//��0Ϊ�쳣�˳���0Ϊ�����˳�
	* public static long currentTimeMillis()//��ȡ���ڵ�ʱ�����19700101�ĺ���ֵ
	* pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
* C:������ʾ
	* System��ĳ�Ա����ʹ��


 * 
 * */
public class DemoSystem {
	public static void main(String[] args) {
		//methodgc();
		//methodExit();
		//methodTiem();
		//methodSystem();
}

	private static void methodSystem() {
		int a[] = {1,4,2,3,6,7};
		int b[] = new int[a.length];
		System.arraycopy(a,0, b, 0, a.length);
		System.out.println(Arrays.compare(a, b));
	}

	private static void methodTiem() {
		long beg=System.currentTimeMillis();
		for(int i=0;i<1000;i++) {
			System.out.println("*");
		}
		long end=System.currentTimeMillis();
		System.out.println(end-beg);
	}

	private static void methodExit() {
		System.exit(0);//�˳�����ִ������Ĵ���
		System.out.println("mmp");//�˳�����ִ����仰
	}

	private static void methodgc() {
		for(int i=0;i<100;i++) {
			new minggc();
			System.gc();//���û��շ���
	}
	}
}

class minggc{
	@Override
	public void finalize(){//��д���ն����ʱִ�еķ���
		System.out.println("��ʲô�У���������ҪǮ��!");
	}
}