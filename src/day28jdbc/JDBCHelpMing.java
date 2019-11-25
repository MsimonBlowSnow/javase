package day28jdbc;

public class JDBCHelpMing {
	String name;
	int age;
	String sex;
	int ID;

	public JDBCHelpMing(String name, int age, String sex, int ID) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.ID = ID;
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

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	@Override
	public String toString() {
		return "JDBCHelpMing [name=" + name + ", age=" + age + ", sex=" + sex + ", ID=" + ID + "]";
	}

}
