package day18fileSequencsInputStream;

import java.io.Serializable;
/*person����ʵ��Serializable�ӿڲſ������л�(д���ļ�����)
 * 
 * 
 * */
public class Person implements Serializable{
	/**
	 * Serializable�ӿ������Id
	 * ID�ţ�����浽�ļ������,��仯��,�ٶ�����쳣��Ȼ�������Id��(�Ͱ汾�Ų��)
	 */
	private static final long serialVersionUID = 1L;
	int age;
	String name;
	public Person() {
		super();
	}
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
