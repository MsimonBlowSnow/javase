package day7object;
/**
 ����һ���ǹ�����
@author Ming
@version v1.0
*/
public class Docmake {
	
	private Docmake() {}
	
	/**
	 * ����һ����ȡһ�������е����ֵ�ķ���
	 * @param arr һ��int������
	 * @return max ��������������
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
	 * ����һ����ӡһ������ķ���
	 * @param arr  һ����������
	 * */
	public static void print(int[] arr) {
		for(int i:arr) {
			System.out.println(arr[i]+" ");
		}
	}
	
	/**
	 * ����һ����ת����ķ���
	 * @param arr һ����������
	 * @return arr һ����������
	 * */
	public static int[] revArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[arr.length-1-i];
		}
		return arr;
	}
}
