package day25thread;

/*��������ģʽ
 	*һ����ֻ��һ����Ч����
 	*�����ַ�����
 *1.����ʽ(����ʱ���Ƽ�)
 *2.����ʽ(���̲߳���ȫ)
 *3.����
 */
public class Demo01Singleton1 {
	public static void main(String[] args) {
		
	}
}
//����ʽ������ʱ���ã����̰߳�ȫ
class Demo01{
	//˽�л����󣬲��ܴ���
	private Demo01() {}
	//���ܷ��ʣ��������get����
	private static Demo01 aDemo01=new Demo01();
	public static Demo01 getDemo01(){
		return aDemo01;
	}
}

//����ʽ�����̰߳�ȫ�����̲߳���ȫ�����Ƽ�ʹ�ã�����ʽ
class Demo011{
	//˽�л����󣬲��ܴ���
	private Demo011() {}
	//���ܷ��ʣ��������get����
	private static Demo011 aDemo01=null;
	public static Demo011 getDemo01(){
		if(aDemo01==null) {
			//��һ���߳�ִ�е��������һ���߳���ȥ�ˣ��ͻ��в�ͬ�Ķ���
			aDemo01=new Demo011();
		}
		return aDemo01;
	}
}

class Demo0111{
	//��final ���β����޸�
	private Demo0111() {}
	public final static Demo0111 a= new Demo0111();
} 