package ���������ģʽ;
/*���������ģʽ
 	*���������ģʽ����һ����������ʵ���кܶ෽���Ľӿ�
 	*����д�ýӿڵķ�������Ϊ���󷽷����ó��������һ��������
 *�ŵ㣺 
 	*1.���ò�����ȫʵ�ָýӿ�����ĳ��󷽷�����ʵ������Ĳ��ַ���������
 	*2.����Ҫʹ�ø��ӿڷ��������Ī�����󷽷�����ֱ�Ӽ̳����������Ϳ�����д��Ҫ�õķ������������÷��� 
 * */

/*����Ҫ��:
 *1.��һ���ӿ�MING���봴��һ����ʵ�ֽ����������һ������
 	*˼·:
 		*1.����һ����������ʵ�ֽӿ�MING,����д���еķ���
 		*2.����һ�������̳иó��󷽷�
 	*
 * */
public class Atapter {
	public static void main(String[] args) {
		new mingStudy().study();
	}
}
class mingStudy  extends ming{
	@Override
		public void study() {
			System.out.println("good good study,day day up");
		}
}
//��ֹ��������
abstract class  ming implements Ming{

	@Override
	public void eat(){};

	@Override
	public void sleep(){};

	@Override
	public void play(){};

	@Override
	public void study() {};
	
}