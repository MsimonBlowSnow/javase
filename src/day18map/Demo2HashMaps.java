package day18map;

import java.util.HashMap;
import java.util.Scanner;

/*����:
 *һ��ѧУ�в�ͬ��רҵ��һ��רҵ�в�ͬ��ѧ��
 *����ѧ����Ϣ�����������ѧУ��ѧ�� 
 * */
public class Demo2HashMaps {
	public static void main(String[] args) {
		HashMap<HashMap<Student, Integer>, String> map2 = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int age = 0;
		String skill = null;
		int class1 = 0;
		String name = null;
		String[] strs;
		String str1;
		while (true) {
			//map�������¸�ֵ���������е�map2�����key��ָ��һ������
			HashMap<Student, Integer> map = new HashMap<>();
			System.out.println("������ѧ����רҵ(quit�˳�)");
			skill= sc.nextLine();
			if(skill.equals("quit"))
				break;
			map.clear();
			while(true) {
			System.out.println("������"+skill+"��ѧ����Ϣ��(�༶��ѧ������������):quit�˳�");
			 str1 = sc.nextLine();
			if (str1.equals("quit"))
				break;
			   strs = str1.split(",");
			try {
				age = Integer.parseInt(strs[2]);
				name = strs[1];
				class1 = Integer.parseInt(strs[0]);
				map.put(new Student(age, name), class1);
			} catch (Exception e) {
				System.out.println("��ʽ����!��������ȷ�ĸ�ʽ");
			}
			}
			map2.put(map, skill);
		}
		System.out.println(map2);
		for (HashMap<Student, Integer> map3 : map2.keySet()) {
			skill = map2.get(map3);
			System.out.println("=============");
			for (Student stud: map3.keySet()) {
				class1 = map3.get(stud);
				System.out.println(stud.getName() + ":" + stud.getAge() + " " + class1 + " " + skill);	
			}
		}
	}
}

