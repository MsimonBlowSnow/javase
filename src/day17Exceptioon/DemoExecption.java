package day17Exceptioon;
/* A:�쳣�ĸ���
* �쳣����Java���������й����г��ֵĴ���
* B:�쳣�ķ���
* ͨ��API�鿴Throwable
* Error
	* ������崻�,���ݿ������
* Exception
C:�쳣�ļ̳���ϵ
* Throwable
	* Error	
	* Exception
		* RuntimeException ����ʱ�쳣

*/
public class DemoExecption {
	public static void main(String[] args) {
		int[] a={1,2,3,4,5};
		System.out.println(a[6]);//ArrayIndexOutOfBoundsException����Խ���쳣
	}
}
