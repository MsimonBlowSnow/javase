package day13regx;
/* 是指一个用来描述或者匹配一系列符合某个语法规则的字符串的单个字符串。
 * 其实就是一种规则。有自己特殊的应用。
* 作用:比如注册邮箱,邮箱有用户名和密码,一般会对其限制长度,
* 这个限制长度的事情就是正则表达式做的
*/

/* 需求：校验qq号码.
* 1:要求必须是5-15位数字
* 2:0不能开头
* 3:必须都是数字
* a:非正则表达式实现
* b:正则表达式实现
* String flag="[1-9]\\d{4,14}";
* */

public class DemoRegx1 {
	public static void main(String[] args) {
		String a="123456781121";
		String b="01212212";
		System.out.println(regxqq(a));
		System.out.println(regxqq(b));
		System.out.println(noregxqq(a));
		System.out.println(noregxqq(b));
	}

	private static boolean noregxqq(String a) {
		char[] c=a.toCharArray();
		if(c[0]!='0') {
			if(c.length<=15) {
				for(char i:c) {
					if(!(i<'9'&&i>'0')) {
						return false;
					}
					return true;
				}
			}
		
		}
		return false;
	}

	private static boolean regxqq(String a) {
		String flag="[1-9]\\d{4,14}";
		return a.matches(flag);
	}
	
}
