package day17set;

import java.util.LinkedHashSet;

public class DemoListHashSet {
	/**
	 * LinkedHashSet �ײ�������ʵ�ֵ�,��set������Ψһһ���ܱ�֤��ô�����ôȡ�ļ��϶���
	 *��Ϊ��HashSet������,����Ҳ�Ǳ�֤Ԫ��Ψһ��,��HashSet��ԭ��һ��
	 */
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add("a");
		lhs.add("a");
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		lhs.add("d");

		System.out.println(lhs);
	}

}