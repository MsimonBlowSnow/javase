package day8object;

public class Demo1Static {
	public static void main(String[] args) {
		
		{
			System.out.println("2");
		}
		new Demo1static1();
		Demo1static1 a;//����ִ��static
		//new Demo1static1();
	}
	
	static{
		System.out.println("1");//����������ִ��
	}
	
	
}

class Demo1static1{
	public Demo1static1(){
		System.out.println("5");
	}
	//���ݶ���ʱ��ִ��
			{
				System.out.println("4");
			}
			
	//������˾ͻ�ִ�У���ִֻ��һ�Ρ�
		static {
			System.out.println("3");
		}
		
	
}