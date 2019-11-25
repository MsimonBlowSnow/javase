package day12String;
/*String的遍历
 	*1.通过charAt(int index)方法	 
 * */
public class Demo08StringBianLi {
	public static void main(String[] args) {
		String str ="abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < str.length(); i++) {
			System.out.print(" "+str.charAt(i));
		}
	}
}
