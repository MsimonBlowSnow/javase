package day11Makejar;
/*制作.jar文件步骤
 * 点Export-Java-jar 
 * 
 * */
public class MyHelpClass {
	public static int add(int a,int b){
		return a+b;
	}
	
	public static int less(int a,int b) {
		if(a>b)
			return a-b;
		else
			return b-a;
	}
	
	public static void findAll(int[] a) {
		System.out.print("[");
		for (int i:a) {
			System.out.print(i+",");
		}
		System.out.println("]");
	}
	
	public static int findMax(int[] a) {
		int Max=a[0];
		for(int i:a) {
			if(Max<i) {
				Max=i;
			}
		}
		return Max;
	}
	
	public static int findMin(int[] a) {
		int Min=a[0];
		for(int i:a) {
			if(Min<i) {
				Min=i;
			}
		}
		return Min;
	}
	
	public static int[]  array(int[] a) {
		int flag=0;
		for (int i=0;i<a.length-1;i++) {
			flag=a[i];
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					flag =a[j+1];
					a[j+1]=a[j];
					a[j]=flag;
				}
			}
		}
		return a;	
	}
}
