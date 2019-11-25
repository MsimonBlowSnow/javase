package day3operator;

public class Demo1ByteOperator {
	public static void main(String[] args) {
		/*位运算符
		 * &,|,~,^,<<,>>,<<<,>>>
		 * 所有的位运算符都是以补码的形式运行的
		 * 下面数字都是整数int，为了方便解释用8位解释
		 * */
		System.out.println("& 位与:");
		//                            补码                         补码                     补码                     反码                     源码
		System.out.println(-6&3);//2  11111010&00000011 00000010 00000010 00000010
		System.out.println(7&2);//2  */
		
		System.out.println("| 位或:");
		System.out.println(-6|3);//-5 11111010|00000011 11111011 11111010 10000101
		System.out.println(5|2);//7 
		
		System.out.println("~ 位非");
		System.out.println(~6);//-7 ~00000110            11111001 10000111
		System.out.println(~2);//-3 
		
		System.out.println("^ 异或");
		System.out.println(-6^2);//-8    11111010^00000010 11111000 10001000
		System.out.println(5^1);//4    00000101^00000001 00000100
		
		
		
	}
}
