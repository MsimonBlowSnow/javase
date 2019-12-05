package day3operator;

public class Demo2Operaator {
	public static void main(String[] args) {
		/**三目运算符
		 * ()？a:b
		 * */
		int a=10;
		int b=20;
		int c=30;
		
		System.out.println(a<b?a=b:(c=a));
		
		int max;
		/*利用三目运算符比大小 */
		max=a<b?b:a;
		max=max<c?c:max;
		System.out.print(max);
	}
}
