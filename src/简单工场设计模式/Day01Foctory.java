package �򵥹������ģʽ;

public class Day01Foctory {
	//ע�͵Ĳ��ִ��븴�÷ǳ���
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
