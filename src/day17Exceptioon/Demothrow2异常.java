package day17Exceptioon;

public class Demothrow2异常 {
	/**
	 * * A:throws的方式处理异常 定义功能方法时，需要把出现的问题暴露出来让调用者去处理。 那么就通过throws在方法上标识。
	 *  B:案例演示
	 * 	举例分别演示编译时异常和运行时异常的抛出 编译时异常的抛出必须对其进行处理 运行时异常的抛出可以处理也可以不处理
	 * 
	 * @throws Exception
	 */
	
	/* A:throw的概述
	* 在功能方法内部出现某种情况，程序不能继续运行，需要进行跳转时，就用throw把异常对象抛出。
* B:案例演示	
	* 分别演示编译时异常对象和运行时异常对象的抛出
* C:throws和throw的区别
	* a:throws
		* 用在方法声明后面，跟的是异常类名
		* 可以跟多个异常类名，用逗号隔开
		* 表示抛出异常，由该方法的调用者来处理
	* b:throw
		* 用在方法体内，跟的是异常对象名
		* 只能抛出一个异常对象名
		* 表示抛出异常，由方法体内的语句处理
*/

	// * 编译时异常的抛出必须对其进行处理 * 运行时异常的抛出可以处理也可以不处理
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
			// Exception e = new Exception("年龄非法");
			// throw e;
			throw new Exception("年龄非法");
		}
	}

}
