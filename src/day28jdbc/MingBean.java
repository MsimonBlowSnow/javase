package day28jdbc;

public class MingBean {
	private String sex1;
	private String name1;
	private int  ID;
	private int age;
	public String getSex1() {
		return sex1;
	}
	public void setSex1(String sex) {
		this.sex1 = sex;
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name) {
		this.name1 = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	 public MingBean() { 
		 super();
		 // TODO Auto-generated constructor stub }
	 }
	 
	public MingBean(String sex, String name, int iD, int age) {
		super();
		this.sex1 = sex;
		this.name1 = name;
		ID = iD;
		this.age = age;
	}
	@Override
	public String toString() {
		return "MingBean [sex=" + sex1 + ", name=" + name1 + ", ID=" + ID + ", age=" + age + ", getSex()=" + getSex1()
				+ ", getName()=" + getName1() + ", getID()=" + getID() + ", getAge()=" + getAge() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
