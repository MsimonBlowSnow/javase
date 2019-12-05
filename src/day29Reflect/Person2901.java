package day29Reflect;

import org.ietf.jgss.Oid;

public class Person2901 {
	private String name;
	private int ID;
	private String sex;
	
	
	public Person2901() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Person2901(String name, int iD, String sex) {
		super();
		this.name = name;
		ID = iD;
		this.sex = sex;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person2901 other = (Person2901) obj;
		if (ID != other.ID)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	
	public void eat() {
		System.out.println("一天一苹果,生命远离我!");
	}
	
	public void eat(int num){
		System.out.println("一天"+num+"苹果,生命远离我!");
	} 
	@Override
	public String toString() {
		return "Person2901 [name=" + name + ", ID=" + ID + ", sex=" + sex + "]";
	}
	
}
