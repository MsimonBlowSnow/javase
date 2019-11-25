package day12ClassObject;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthSeparatorUI;

/*array类是一个工具类，里面的方法都是用static修饰的
 *array里面的方法
 *toString()转化为字符串
 * public static String toString(char[] a) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();//比StringBuffer更快，不过线程不安全
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }
 * sort();将数组排序排序
 * binarySearch();//如果数在数组中，返回索引，否则返回-（插入点索引+1）
 * 二分发查找
 * private static int binarySearch0(int[] a, int fromIndex, int toIndex,
                                     int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;//右移一位
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
