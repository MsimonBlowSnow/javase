package day10package;

public class DemoNoNameInClass {
	/** A:�����ڲ���
	* �����ڲ���ļ�д����
* B:ǰ�᣺����һ������߽ӿ�
	* �����������Ǿ�����Ҳ�����ǳ����ࡣ
* C:��ʽ��
* 
		new �������߽ӿ���(){
			��д����;
		}
* D:������ʲô��?
	* ��һ���̳��˸������ʵ���˸ýӿڵ�������������
* E:������ʾ
	* ����Ҫ����һ�������ڲ���*/
	public static void main(String[] args) {
		Outer1 a=new Outer1();
		a.method();
	}
}

interface Inter1{
	abstract public void print();
}

class  Outer1{
	
		class inter implements Inter1{
			@Override
			public void print() {
				System.out.println("�ڲ��ڼ̳нӿ�ʵ�ֳ��󷽷�");
			}
		}	
		
		public void method(){
			inter a= new inter();
			a.print();
			new Inter1() {
				@Override
				public void print() {
				System.out.println("ֱ��ʵ�ֽӿڵķ���");	
				}
			}.print();
		}
	}
