package day17Exceptioon;

public class Demothrow2�쳣 {
	/**
	 * * A:throws�ķ�ʽ�����쳣 ���幦�ܷ���ʱ����Ҫ�ѳ��ֵ����Ⱪ¶�����õ�����ȥ���� ��ô��ͨ��throws�ڷ����ϱ�ʶ��
	 *  B:������ʾ
	 * 	�����ֱ���ʾ����ʱ�쳣������ʱ�쳣���׳� ����ʱ�쳣���׳����������д��� ����ʱ�쳣���׳����Դ���Ҳ���Բ�����
	 * 
	 * @throws Exception
	 */
	
	/* A:throw�ĸ���
	* �ڹ��ܷ����ڲ�����ĳ������������ܼ������У���Ҫ������תʱ������throw���쳣�����׳���
* B:������ʾ	
	* �ֱ���ʾ����ʱ�쳣���������ʱ�쳣������׳�
* C:throws��throw������
	* a:throws
		* ���ڷ����������棬�������쳣����
		* ���Ը�����쳣�������ö��Ÿ���
		* ��ʾ�׳��쳣���ɸ÷����ĵ�����������
	* b:throw
		* ���ڷ������ڣ��������쳣������
		* ֻ���׳�һ���쳣������
		* ��ʾ�׳��쳣���ɷ������ڵ���䴦��
*/

	// * ����ʱ�쳣���׳����������д��� * ����ʱ�쳣���׳����Դ���Ҳ���Բ�����
	public static void main(String[] args) throws Exception {
		Person p = new Person();
		p.setAge(-17);
		System.out.println(p.getAge());
	}

}

class Person {
	private String name;
	private int age;

	public Person() {
		super();

	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if (age > 0 && age <= 150) {
			this.age = age;
		} else {
			// Exception e = new Exception("����Ƿ�");
			// throw e;
			throw new Exception("����Ƿ�");
		}
	}

}
