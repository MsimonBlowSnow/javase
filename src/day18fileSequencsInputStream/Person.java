package day18fileSequencsInputStream;

import java.io.Serializable;
/*person必须实现Serializable接口才可以序列化(写到文件里面)
 * 
 * 
 * */
public class Person implements Serializable{
	/**
	 * Serializable接口里面的Id
	 * ID号：对象存到文件里面后,类变化了,再读会出异常，然后告诉你Id号(和版本号差不多)
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
