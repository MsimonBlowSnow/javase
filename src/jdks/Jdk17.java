package jdks;
/*27.17_JDK7������(JDK7�����������Իع˺ͽ���)
 	* A:������������
 	* B:�������������Գ����»���
 	* C:switch ���������ַ���
 	* D:���ͼ�,���η���
 	* E:�쳣�Ķ��catch�ϲ�,ÿ���쳣�û�|
 	* F:try-with-resources ���
 * 
 * */


public class Jdk17 {
	public static void main(String[] args) {
		method17();
	}

	private static void method17() {
		//1.7֧��
		System.out.println(0b1111);
		//1.7֧�֣�����۲�
		System.out.println(100_000);
		//1.7֧�֣�System.out.println(0b_100_100);//�����������ַ���֮��
		System.out.println(0b1_00_100);
	}
}
