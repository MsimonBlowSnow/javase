package day25thread;
/* ###25.01_���߳�(�������ģʽ)(����)
* �������ģʽ����֤�����ڴ���ֻ��һ������

* ��α�֤�����ڴ���ֻ��һ�������أ�
	* (1)������Ĵ�������������������������Ķ���private
	* (2)�ڱ����ж���һ������Ķ���Singleton s;
	* (3)�ṩ�����ķ��ʷ�ʽ��  public static Singleton getInstance(){return s}
* ����д�����֣�
	* (1)����ʽ ���������ַ�ʽ��
	* 
			//����ʽ
			class Singleton {
				//1,˽�й��캯��
				private Singleton(){}
				//2,�����������
				private static Singleton s = new Singleton();
				//3,�����ṩ�����ķ��ʷ���
				public static Singleton getInstance() {
					return s;
				}
				
				public static void print() {
					System.out.println("11111111111");
				}
			}
	* (2)����ʽ ����д���ַ�ʽ�����̵߳����⣿
	* 
			//����ʽ,�������ӳټ���ģʽ
			class Singleton {
				//1,˽�й��캯��
				private Singleton(){}
				//2,����һ�����������
				private static Singleton s;
				//3,�����ṩ�����ķ��ʷ���
				public static Singleton getInstance() {
					if(s == null)
						//�߳�1,�߳�2
						s = new Singleton();
					return s;
				}
				
				public static void print() {
					System.out.println("11111111111");
				}
			}
	* (3)�����ָ�ʽ
	* 
			class Singleton {
				private Singleton() {}
			
				public static final Singleton s = new Singleton();//final�����յ���˼,��final���εı��������Ա�����
			}

 * 
 * 
 * */
public class Demo01singleton {

}
