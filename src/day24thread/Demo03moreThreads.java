package day24thread;

public class Demo03moreThreads {
	public static void main(String[] args) {
		for (int i = 0; i < 100000; i++) {
			new Demo03();//������������
		}
		
		for (int i = 0; i <100000; i++) {
			System.out.println("����Ҳ������Ǯ��!");
		}
	}
}
 
class Demo03{
	@Override
	protected void finalize() throws Throwable {
		System.out.println("��������!");
	}
}