package day5array;

public class Demo1Array {
	public static void main(String[] args) {
		int[] arr=new int[5];
		String[][] str=new String[4][3];
		for (int i:arr) {
			System.out.println(arr[i]);//�Զ���ʼ��Ϊ0
			/*�����ʼ��
			 * int short long ��ʼ��Ϊ0
			 * float,double��ʼ��0.0
			 * char ��ʼ��Ϊ��\u0000��		 * 
			 * */
		}
		System.out.println(arr);//[I@XXXXXX,һ��[��ʾһ������,I��ʾint�����飬XXXXXX��ʾ��ֵַ��
		System.out.println(str);//[[Ljava.lang.String;@299a06ac
	}
}
