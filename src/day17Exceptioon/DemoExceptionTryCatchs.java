package day17Exceptioon;
/**
 * * A:������ʾ
 * try...catch�ķ�ʽ�������쳣
 * JDK7�Ժ������쳣�ķ�ʽ��ע������
 * 
 * ��׿,�ͻ��˿���,��δ����쳣?try{}catch(Exception e){}
 * ee,����˿���,һ�㶼�ǵײ㿪��,�ӵײ�������
 * 
 * try������������catch,��ôС���쳣��ǰ��,����쳣�ź���,���ݶ�̬��ԭ��,�����ķ�ǰ��,�ͻὫ���е�����������
 * �����catch��û��������
 */

//����ĳ���ֻ��ִ��һ���쳣��ӦΪ�쳣��int a=10/0 ������catch�б��˴�����
public class DemoExceptionTryCatchs {
	public static void main(String[] args) {
		try {
			int a=10/0;//��0�쳣
			int[] c=new int[1];
			System.out.println(c[2]);//����Խ���쳣
			String arr=null;//��ָ���쳣
			System.out.println(arr.charAt(1));
		}catch(ArithmeticException e){
			System.out.println("0����������");
		}catch(NullPointerException e) {
			System.out.println("��ָ���쳣");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ���쳣");
			//���쳣�ź��档����С�쳣û����
		}catch(Exception e) {//��������ָ��������� Exceptption e= new XXX();�쳣
			System.out.println("������");
		}
		
		
	}
}
