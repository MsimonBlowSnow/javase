package day4xuhuan;
/*ѭ���ṹ
 * forѭ��������
 * for(i=0;i<10;i++) 
 * for(int i;a)a��һ��int ������ 
 * */
public class Demo1For {
	public static void main(String[] args) {
		int i=0;
		//forѭ�����
		for(i=0;i<10;i++) {
			System.out.println(i);
		}
		//whileѭ��
		while(i!=0) {
			System.out.println(i--);
		}
		//dowhileѭ��
		do {
			System.out.println(i++);
		}while(i!=10);
		String[] a= {"4","3","2","1"};
		
		for (String string : a) {
			System.out.println(string);
		}
	}
}
