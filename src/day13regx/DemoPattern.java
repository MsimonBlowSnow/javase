package day13regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*matches(String)
 * compile();
 * find(regx);�ҵ�һ������regx�ı��ʽ�ͷ���true
 * group();
 * */
public class DemoPattern {
	public static void main(String[] args) {
		Pattern p= Pattern.compile("a*b");//��ȡ������ʽ
		Matcher M=p.matcher("aaaab");//��ȡƥ����
		//System.out.println(M.matches());//���Ƿ�ƥ�䣬ƥ�䷵��true�൱������Ĳ��裺
		//System.out.println("aaaab".matches("a*b"));
		String s="�ҵĵ绰����:15170318010 �ҵ��ֻ�����:13879822419";
		String regx="1[3578]\\d{9}";
		Pattern p1=Pattern.compile(regx);
		Matcher M1=p1.matcher(s);
		while(M1.find()) {
			System.out.println(M1.group());
		}
	}
	
}
