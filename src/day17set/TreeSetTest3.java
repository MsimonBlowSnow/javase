package day17set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/* A:案例演示
* 需求：键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低输出到控制台。
 * 
 */
public class TreeSetTest3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Student2 stud;
		int chinese;
		int Math;
		int english;
		TreeSet<Student2> studs= new TreeSet<>();
		System.out.println("请按下面格式输入:(name,chinese,math,english)");
		while(true){
			String str=sc.nextLine();
			if(str.equals("quit"))
				break;
			String[] strs=str.split(",");
			try {
				chinese=Integer.parseInt(strs[1]);
				Math=Integer.parseInt(strs[2]);
				english=Integer.parseInt(strs[3]);
				stud=new TreeSetTest3().new Student2(chinese,Math,english,strs[0]);
				studs.add(stud);
			}catch(Exception e) {
				System.out.println("请输入正确的格式!");
			}
		}
		for (Student2 student2 : studs) {
			System.out.println(student2);
		}
	}
	
	
	class Student2 implements Comparable<Student2>{
		int chinese;
		int english;
		int math;
		String name;
		int scoreAll;
		
		public Student2() {}
		
		public Student2(int chinese, int math,int english, String name) {
			super();
			this.chinese = chinese;
			this.english = english;
			this.math = math;
			this.name = name;
			this.scoreAll =math+english+chinese;
		}

		public int getChinese() {
			return chinese;
		}

		public void setChinese(int chinese) {
			this.chinese = chinese;
		}

		public int getEnglish() {
			return english;
		}

		public void setEnglish(int english) {
			this.english = english;
		}

		public int getMath() {
			return math;
		}

		public void setMath(int math) {
			this.math = math;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getScoreAll() {
			return scoreAll;
		}

		public void setScoreAll(int scoreAll) {
			this.scoreAll = scoreAll;
		}

		@Override
		public String toString() {
			return "Student [chinese=" + chinese + ", english=" + english + ", math=" + math + ", name=" + name
					+ ", scoreAll=" + scoreAll + "]";
		}


@Override
public int compareTo(Student2 o) {
	//o是集合里的元素，调用该方法的是集合外的元素
	int a=this.scoreAll-o.scoreAll;
	return a==0?1:-a;
}
		
	}
}


