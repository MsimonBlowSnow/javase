package day12ClassObject;

public class DemoStudHelp {
	String name;
	private String age;
	public DemoStudHelp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DemoStudHelp(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		DemoStudHelp a=(DemoStudHelp) obj;//向下转型
		return this.name.equals(a.name)&&this.age.equals(a.age);
	}

	@Override
	public String toString() {
		return "DemoStudHelp [name=" + name + ", age=" + age + "]";
	}
	
}
