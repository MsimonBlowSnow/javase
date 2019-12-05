package day7object;
/**
 这是一个是工具类
@author Ming
@version v1.0
*/
public class Docmake {
	
	private Docmake() {}
	
	/**
	 * 这是一个获取一个数组中的最大值的方法
	 * @param arr 一个int型数组
	 * @return max 数组中最大的整数
	 * */
	public static int getMax(int[] arr) {
		int max=arr[0];
		for(int i:arr) {
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
	

	/**
	 * 这是一个打印一个数组的方法
	 * @param arr  一个整数数组
	 * */
	public static void print(int[] arr) {
		for(int i:arr) {
			System.out.println(arr[i]+" ");
		}
	}
	
	/**
	 * 这是一个反转数组的方法
	 * @param arr 一个整数数组
	 * @return arr 一个整数数组
	 * */
	public static int[] revArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[arr.length-1-i];
		}
		return arr;
	}
}
