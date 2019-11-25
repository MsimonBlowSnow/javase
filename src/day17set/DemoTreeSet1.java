package day17set;

import java.util.Comparator;
import java.util.TreeSet;

public class DemoTreeSet1 {

			/**
			 * @param args
			 * TreeSet��������������Ԫ�ؽ��������,ͬ����Ҳ���Ա�֤Ԫ�ص�Ψһ
			 * ��compareTo��������0��ʱ�򼯺���ֻ��һ��Ԫ��
			 * ��compareTo��������������ʱ�򼯺ϻ���ô�����ôȡ
			 * ��compareTo�������ظ�����ʱ�򼯺ϻᵹ��洢
			 */
			public static void main(String[] args) {
				demo1();
				demo2();
				//demo3();
				//demo4();
				//����:���ַ������ճ�������
				//�Զ���Ƚ���
				TreeSet<String> ts = new TreeSet<>(new CompareByLen());		//Comparator c = new CompareByLen();
				ts.add("aaaaaaaa");
				ts.add("z");
				ts.add("wc");
				ts.add("nba");
				ts.add("cba");
				System.out.println(ts);
			}

			public static void demo4() {
				TreeSet<Student17> ts = new TreeSet<>();
				ts.add(new Student17(23,"zhangsan"));
				ts.add(new Student17(13,"lisi"));
				ts.add(new Student17(33,"wangwu"));
				ts.add(new Student17(43, "zhaoliu"));
				ts.add(new Student17( 53,"aaaa"));
				System.out.println(ts);
			}

			public static void demo3() {
				TreeSet<Student17> ts = new TreeSet<>();
				ts.add(new Student17(13,"����"));
				ts.add(new Student17(23,"����"));
				ts.add(new Student17(43,"����"));
				ts.add(new Student17(33,"����"));
				
				System.out.println('��' + 0);//��ͬ��unicode
				System.out.println('��' + 0);//
				System.out.println('��' + 0);//
				System.out.println('��' + 0);//
				
				System.out.println(ts);
			}

			public static void demo2() {
				TreeSet<Student17> ts = new TreeSet<>();
				ts.add(new Student17( 23,"����"));
				ts.add(new Student17(13,"����"));
				ts.add(new Student17(13,"����"));
				ts.add(new Student17(43,"����"));
				ts.add(new Student17(33,"����"));
				ts.add(new Student17( 23,"����"));
				System.out.println(ts);
			}

			public static void demo1() {
				TreeSet<Integer> ts = new TreeSet<>();
				ts.add(3);
				ts.add(1);
				ts.add(1);
				ts.add(2);
				ts.add(2);
				ts.add(3);
				ts.add(3);
				
				System.out.println(ts);
			}

		}


		class CompareByLen /*extends Object*/ implements Comparator<String> {

			@Override
			public int compare(String s1, String s2) {		//�����ַ����ĳ��ȱȽ�
				int num = s1.length() - s2.length();		//����Ϊ��Ҫ����
				return num == 0 ? s1.compareTo(s2) : num;	//����Ϊ��Ҫ����
			}
			
		}
