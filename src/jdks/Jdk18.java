package jdks;

import day8object.test;

/** �ӿ��п��Զ����з�����ķ���,����ǷǾ�̬,������default����	
* ����Ǿ�̬�ľͲ�����


		�ֲ��ڲ����ڷ��������ڷ����еľֲ�����������final����,Ϊʲô?
		��Ϊ�������������ʱ,�ֲ��������û����final����,�����������ںͷ���������������һ����,
		��������ջ,����ֲ�����Ҳ����ʧ,��ô����ֲ��ڲ������û��������ʧ��������ֲ�����,��û����,
		�����final���λ�������ص�ʱ����볣����,��ʹ������ջ,�����صĳ�������,Ҳ���Լ���ʹ��
 * 
 * */
public class Jdk18 {
	public static void main(String[] args) {
		//����һ�������ಿ�����jdk18��default���εķ���
		new jdk(){}.HelloMMP();
		//jdk18֧�ֵľ�̬�з�����ķ���
		jdk.say();
		
		//���������ಢ����run()����;���Ծֲ��ڲ�����ó�Ա�����Ƿ����ʡ��final(18����֧��)
		new Test().run();
	}
}


class Test {
	public void run() {
		int x = 10; //jdk1.8ǰ���final����ʡ�ԣ�����ϵͳ��Ĭ�ϼ���,�����޸� 
		class Inner {
			public void method() {
				//x=20;
				System.out.println(x);
			}
		}

		Inner i = new Inner();
		i.method();
	}
	
}