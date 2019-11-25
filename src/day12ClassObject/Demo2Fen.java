package day12ClassObject;
/*���ַ�����һ������ֵ�����ѷ�������,
 * ��������뿴Demo2Fen.png
 * �����������������
 * */
public class Demo2Fen {
	public static void main(String[] args) {
		int[] a=new int[] {11,22,33,44,55,66,77,88,99};
		System.out.println(method2Fen(a,77));//6
		System.out.println(method2Fen(a,72));//-1
	}

	private static int method2Fen(int[] a,int flag) {
		int min=0;
		int max=a.length-1;
		int mid=min+max/2;
		while(a[mid]!=flag) {
			if(a[mid]>flag) {
				max=mid-1;
			}
			if(a[mid]<flag) {
				min=mid+1;
			}
			mid=(max+min)/2;
			if(max<min)
				return -1;
		}
		return mid;
	}
}
