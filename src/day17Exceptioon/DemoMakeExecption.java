package day17Exceptioon;
/* A:Ϊʲô��Ҫ�Զ����쳣
	* �������˵�����
* B:�Զ����쳣����
	* �̳���Exception ����������׳�����ʱ���д�����ʾ
	* �̳���RuntimeException ����������׳�����ʱû�д�����ʾ����������ʱ�����
* C:������ʾ
	* �Զ����쳣�Ļ���ʹ�� 
*/
public class DemoMakeExecption {
	public static void main(String[] args) {
		try {
			throw new MyException("mmp");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


class  MyException extends Exception{
	MyException(){}
	MyException(String message){
		super(message);
	}
}