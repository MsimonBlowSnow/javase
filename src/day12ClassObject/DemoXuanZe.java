package day12ClassObject;
/*ѡ������
 * a[0]��a[1]-a[6]�Ƚ�ѡ����������a[0]����
 * a[1]��a[2]-a[6]�Ƚ�ѡ����������a[1]����
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
	
	//private ֻ�Ը÷����Ա���ʹ��
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
