package day18map;

import java.util.HashMap;
import java.util.Scanner;

/*问题:
 *一个学校有不同的专业，一个专业有不同的学生
 *输入学生信息，并遍历这个学校的学生 
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
			//map必须重新赋值，否则所有的map2里面的key都指向一个对象
			HashMap<Student, Integer> map = new HashMap<>();
			System.out.println("请输入学生的专业(quit退出)");
			skill= sc.nextLine();
			if(skill.equals("quit"))
				break;
			map.clear();
			while(true) {
			System.out.println("请输入"+skill+"的学生信息按(班级，学生姓名，年龄):quit退出");
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
				System.out.println("格式错误!请输入正确的格式");
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

