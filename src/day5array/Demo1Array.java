package day5array;

public class Demo1Array {
	public static void main(String[] args) {
		int[] arr=new int[5];
		String[][] str=new String[4][3];
		for (int i:arr) {
			System.out.println(arr[i]);//自动初始化为0
			/*数组初始化
			 * int short long 初始化为0
			 * float,double初始化0.0
			 * char 初始化为‘\u0000’		 * 
			 * */
		}
		System.out.println(arr);//[I@XXXXXX,一个[表示一个数组,I表示int型数组，XXXXXX表示地址值。
		System.out.println(str);//[[Ljava.lang.String;@299a06ac
	}
}
