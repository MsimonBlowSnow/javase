package day17set;

public class Student17 implements Comparable<Student17>{
	int age;
	private String  name;
	
	
	@Override
	public String toString() {
		return "Student17 [age=" + age + ", name=" + name + "]";
	}

	public Student17(String string, int i) {}
	
	public Student17(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
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
	
	//保证name和age不同的对象产生相同hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		System.out.println("调用hashcode方法");
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("调用equals方法");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student17 other = (Student17) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student17 o) {
		int length = this.name.length() - o.name.length();				//比较长度为主要条件
		int num = length == 0 ? this.name.compareTo(o.name) : length;	//比较内容为次要条件
		return num == 0 ? this.age - o.age : num;						//比较年龄为次要条件
	}
	
	
}

class Student1 {
	private int age1;
	private String  name1;
	
	public Student1() {}
	
	public Student1(int age, String name) {
		super();
		this.age1 = age;
		this.name1 = name;
	}
	public int getAge() {
		return age1;
	}
	public void setAge(int age) {
		this.age1 = age;
	}
	public String getName() {
		return name1;
	}
	public void setName(String name) {
		this.name1 = name;
	}
	
	//保证name和age不同的对象产生相同hashcode
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student1 other = (Student1) obj;
		if (age1 != other.age1)
			return false;
		if (name1 == null) {
			if (other.name1 != null)
				return false;
		} else if (!name1.equals(other.name1))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student1 [age1=" + age1 + ", name1=" + name1 + "]";
	}
	
	
	
}
