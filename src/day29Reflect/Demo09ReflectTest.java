package day29Reflect;

public class Demo09ReflectTest {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Person2901 aPerson2901= new Person2901("��",12,"��");
		System.out.println(aPerson2901);
		//����Demo09ReflectTool����ľ�̬����
		Demo09ReflectTool.setvalues(aPerson2901,"name", "ming");
		System.out.println(aPerson2901);
	}
}