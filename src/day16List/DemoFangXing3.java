package day16List;

public class DemoFangXing3 {
	public static void main(String[] args) {
		A<Integer> a=new A<>(1);
		//A<Integer> a=new A<>("f1");����ʱ����,���췽����û�ò�����Integer�Ķ���
	}
}


//Q��������ʹ�õķ���
class A<Q>{
	private Q e;
	A(){}
	A(Q e){
		this.e=e;
	}
	public  void print() {
		System.out.println(e);
	}
	public void print1(Q q) {};
	//Q q ����洫��ķ��ͣ���T t û��
	public<T> void print2(T t) {}//������������Ǻ��෶��һ��,
								//�����һ�£�����public ��һ������
	public static<W> void print3(W w) {}//��̬�����������Լ��ķ���
										//���������ʵ������֮ǰ���е�
}
