package 简单工场设计模式;

public class Day01Foctory {
	//注释的部分代码复用非常低
	/*
	 * public static Dog Dog() {
	 * 	 return new Dog(); 
	 *} 
	 *public static Cat Cat() {
	 * 	return new Cat(); 
	 * }
	 */
	public static Day01Aminal Amianl(String name) {
		if("Dog".equals(name)) {
			return new Day01Dog();
		}else if("Cat".equals(name)){
			return new Day01Cat();
		}else {
			return null;
		}
	}
}
