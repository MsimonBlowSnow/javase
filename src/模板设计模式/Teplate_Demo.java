package ģ�����ģʽ;
/* A:ģ�����ģʽ����
	* ģ�淽��ģʽ���Ƕ���һ���㷨�ĹǼܣ�����������㷨�ӳٵ���������ʵ��
* B:�ŵ��ȱ��
	* a:�ŵ�
		* ʹ��ģ�淽��ģʽ���ڶ����㷨�Ǽܵ�ͬʱ�����Ժ�����ʵ�־�����㷨�������û�����������
	* b:ȱ��
		* ����㷨�Ǽ����޸ĵĻ�������Ҫ�޸ĳ�����
1,װ��
2,����
3,�򵥹���
4,��������
5,������
6,ģ��
 * 
 * 
 * */
public class Teplate_Demo {
	public static void main(String[] args) {
		Mingson aMingson=new Mingson();
		aMingson.run();
	}
}

abstract class Ming{
	//��final���η�ֹ����
	public final void run(){
		long start=System.currentTimeMillis();
		code();
		long end=System.currentTimeMillis();
		System.out.println(end-start);
	}
	//������ʵ�֣��������
	abstract public void code();
}

class Mingson extends Ming{

	@Override
	public void code() {
		for(int i=0;i<1000000;i++){
			System.out.println(i);
		}
	}
}