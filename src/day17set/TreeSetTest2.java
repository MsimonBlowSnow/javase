package day17set;
/*����������, ���ԴӼ���������ն������, ֱ������quitʱ��������. ����������������������д�ӡ.
*/

import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetTest2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		TreeSet<Integer> tree =new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int num=o2-o1;//�����ӡ������������o1��ǰ�� ������o1�ں���
				return num==0?1:num;
			}
		});
		int flag=0;
		while (true) {
			String str=sc.nextLine();
			if(str.equals("quit"))
				break;
			else
				try{
					flag=Integer.parseInt(str);
					tree.add(flag);
				}catch (Exception e) {
					System.out.println("����������");
				}
				
		}
		for (Integer integer : tree) {
			System.out.print(integer+" ");
		}
	}
}
