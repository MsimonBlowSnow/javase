package day29Reflect;

public class Demo09ReflectTest {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Person2901 aPerson2901= new Person2901("明",12,"男");
		System.out.println(aPerson2901);
		//调用Demo09ReflectTool里面的静态方法
		Demo09ReflectTool.setvalues(aPerson2901,"name", "ming");
		System.out.println(aPerson2901);
	}
}