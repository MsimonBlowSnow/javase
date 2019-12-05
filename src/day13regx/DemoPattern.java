package day13regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*matches(String)
 * compile();
 * find(regx);找到一个符合regx的表达式就反回true
 * group();
 * */
public class DemoPattern {
	public static void main(String[] args) {
		Pattern p= Pattern.compile("a*b");//获取正则表达式
		Matcher M=p.matcher("aaaab");//获取匹配器
		//System.out.println(M.matches());//看是否匹配，匹配返回true相当于下面的步骤：
		//System.out.println("aaaab".matches("a*b"));
		String s="我的电话号码:15170318010 我的手机号码:13879822419";
		String regx="1[3578]\\d{9}";
		Pattern p1=Pattern.compile(regx);
		Matcher M1=p1.matcher(s);
		while(M1.find()) {
			System.out.println(M1.group());
		}
	}
	
}
