package day10package;
/** A:�ڲ������
* B:�ڲ�������ص�
	* a:�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա������˽�С�
	* b:�ⲿ��Ҫ�����ڲ���ĳ�Ա�����봴������
	* �ⲿ����.�ڲ����� ������ = �ⲿ�����.�ڲ������;
* C:������ʾ
	* �ڲ��༫������ص�
*/
public class DemoInClass {
	public static void main(String[] args) {
		Outer.Inter a=new Outer().new Inter();
		a.method();
		Outer2 b=new Outer2();
		b.Omethod();
	}
}

class Outer{
	private int num1;
	class Inter{
		int num;///////
		public void method() {
			System.out.println("�����ڲ���");
		}
	}
	
}

//��Ա�ڲ�������ʹ��
class Outer2{
	private int num1;
	private class Inter2{
		int num;///////
		public void method() {
			System.out.println("�����ڲ���2");
		}
	}
	public void Omethod() {
		Inter2 in2=new Inter2();
		in2.method();	
	}
	
}