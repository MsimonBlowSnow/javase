package day12ClassObject;
/*选择排序
 * a[0]和a[1]-a[6]比较选出最大的数和a[0]交换
 * a[1]和a[2]-a[6]比较选出最大的数和a[1]交换
 * a[2]
 * */
public class DemoXuanZe {
	public static void main(String[] args) {
		int[] a =new int[] {7,1,3,4,5,2,6};
		xueze(a);
		for(int i:a) {
			System.out.print(i);
		}
	}
	
	//private 只对该方法对本类使用
	private static void xueze(int[] a) {
		int temp;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
}
