package day17Exceptioon;
/* A:finally���ص�
* ��finally���Ƶ������һ����ִ��
* �����������ִ�е�finally֮ǰjvm�˳���(����System.exit(0))
* B:finally������
* �����ͷ���Դ����IO�����������ݿ�����л����
* C:������ʾ
* finally�ؼ��ֵ��ص㼰����
*����û��catch ����return����ִ��returnǰ������ִ��finally
*/
public class DemoExecptionFinally {
	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		}catch(Exception e) {
			System.out.println("���ܳ�0");
			return ;
		}finally {
			System.out.println("�������0");
		}
		
	}
}
