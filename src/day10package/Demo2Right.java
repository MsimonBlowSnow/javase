package day10package;

/**
 * private
 * 
 * 
 * 
 * 
 * */

public class Demo2Right {
	public static void main(String[] args) {
		System.out.println("       |同一个类   | 同一个包   | 不同包的子类 | 不同包的非子类");
		System.out.println("private|可以           | NO    |      NO  |       NO |");
		System.out.println("默认           |可以           |可以            |NO         |  NO      |");
		System.out.println("protect|可以        |可以           |可以                            |  NO   ");
		System.out.println("public |可以       |可以           | 可以                        |  可以     ");
		
	}
}
