package day9poly;

/*�ӿ�
 * �ӿ�֧�ֶ�ʵ�ֶ���ȴ����
 * �ӿ�û�й��췽��
 * �ӿڶ���ķ������ǳ��󷽷������ݶ���������������
 * �ӿ����������
 * �ӿڿ��Ե�ʵ�ֽӿڣ�Ҳ���Զ�ʵ�ֽӿ�
 * ��ֻ�ܵ��̳���
 * �ӿڿɵ��Լ̳��ֽӿ�Ҳ���Զ�̳нӿڡ�
 * */
public class Demo1Interface {
	public static void main(String[] args) {
	}
}
/*�ӿ���û�й��췽�� �ӿ��г�Ա��������Ĭ����final public static ���εı���*/
/*�ӿ��еĳ��󷽷�һ����public ���Σ����û��Ĭ�ϻ���public*/
interface inter1{
	public static final int  num=10;//
	int b=9;//Ĭ��public static final
	public abstract void print();
	public abstract  void print1();
}

interface inter2 extends inter1{
	
}


class print extends Object implements  inter1,inter2{
	public print(){
		super();//Object�����super()����
	}
	@Override
	public void print1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
