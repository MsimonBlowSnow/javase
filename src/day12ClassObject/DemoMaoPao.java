package day12ClassObject;
/*ð�������㷨
 * ͨ��ð�ݰ����м�������
 * 
 * */
public class DemoMaoPao {
	public static void main(String[] args) {
		int[] a= new int[]{7,6,5,4,3,2,1};
		MaoPaoSuanFa(a);
		print(a);
	}

	private static void print(int[] a) {
		for(int i:a) {
			System.out.print(i);
		}
	}

	private static void MaoPaoSuanFa(int[] a) {
		int flag;
		for (int i = 0; i < a.length-1; i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					flag=a[j];
					a[j]=a[j+1];
					a[j+1]=flag;
				}
			}
		}
	}
}
