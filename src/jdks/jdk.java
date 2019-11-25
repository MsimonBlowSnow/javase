package jdks;
/*jdk18接口里面提供default修饰接口里面的非静态非抽象方法
*
*/
public interface jdk {
	public default void HelloMMP() {
		System.out.println("好你妈的逼");
	}
	
	public static void say() {
		System.out.println("你好");
	}
}
