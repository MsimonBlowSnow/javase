package day17Exceptioon;
/* A:JVMĬ������δ����쳣��
* main�����յ��������ʱ,�����ִ���ʽ:
	* a:�Լ��������⴦��,Ȼ���������
	* b:�Լ�û����ԵĴ���ʽ,ֻ�н�������main��jvm������,��������
* jvm��һ��Ĭ�ϵ��쳣�������,�ͽ����쳣���д���.
* �������쳣������,�쳣����Ϣ.�쳣���ֵ�λ�ô�ӡ���˿���̨��,ͬʱ������ֹͣ����
* B:������ʾ
* JVMĬ����δ����쳣
*/


public class DemoExceptionJVM {
	public static void main(String[] args) {
		int c=chu(10,0);//main����û�д�������jvm��jvm��ӡ���������Ϣ
		System.out.println(c);
	}

	private static int chu(int i, int j) {
		return i/j; //�����쳣����main����  newArithmeticException("/ by zero") 
	}
}
