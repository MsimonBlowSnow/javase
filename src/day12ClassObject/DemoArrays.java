package day12ClassObject;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthSeparatorUI;

/*array����һ�������࣬����ķ���������static���ε�
 *array����ķ���
 *toString()ת��Ϊ�ַ���
 * public static String toString(char[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();//��StringBuffer���죬�����̲߳���ȫ
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }
 * sort();��������������
 * binarySearch();//������������У��������������򷵻�-�����������+1��
 * ���ַ�����
 * private static int binarySearch0(int[] a, int fromIndex, int toIndex,
                                     int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;//����һλ
            int midVal = a[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        return -(low + 1);  // key not found.
    }
 * 
 * */
public class DemoArrays {
	public static void main(String[] args) {
		int[] a=new int[] {33,22,44,11,66,55,77};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		Arrays.binarySearch(a, 88);//-7
		System.out.println(Arrays.toString(a));
	}
}
