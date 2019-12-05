package day12String;
/*String常用的方法
 	* byte[] getBytes():把字符串转化为字节数组。
 	* char[] toCharArray():把字符串转化为字符数组
 	* static String valueOf(char[] chs):把字符数组转化为字符串
 	* static String valueOf(int i):把int类型转化为字符串
 	* static String valueOf(Object obj):相当于对象调用toString方法
 		* String中的ValueOf可以把任意类型的数据转化为字符串。
 	* String toLowerCase():把字符串转化为小写
 	* String toUpperCase():把字符串转化成大写。
 	* String concat(String str):把字符串拼接
 * */
public class Demo10String {
	public static void main(String[] args) {
		String str="abc";
		String str1="你好你好";
		byte[] arr1=str1.getBytes();
		byte[] arr=str.getBytes();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");//编码
		}
		for (byte b : arr1) {
			System.out.print(b+" ");//gbk中一个中国文代表两个字节，且第一个字节是负数
		}
		System.out.println();
		
		//toCharArray()
		char[] arr2= str.toCharArray();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		//valueOf
		String str2=String.valueOf(97);
		System.out.println(str2);//97 字符
		str2=String.valueOf(arr2);//abc
		System.out.println(str2);
	}
	
}
