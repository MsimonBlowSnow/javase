package day13regx;

/** A:正则表达式的分组功能
	* 捕获组可以通过从左到右计算其开括号来编号。例如，在表达式 ((A)(B(C))) 中，存在四个这样的组： 
* 
		1     ((A)(B(C))) 
		2     (A 
		3     (B(C)) 
		4     (C) 
	
		组零始终代表整个表达式。
B:案例演示
	a:切割
		需求：请按照叠词切割： "sdqqfgkkkhjppppkl";
	b:替换
		需求：我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程
		将字符串还原成:“我要学编程”。

*$1获取第几个分组
*ReplaceAll(regx,statement)
*满足regx用statement
*/
public class DemoRegxFenZu {
	public static void main(String[] args) {
		String a="sdqqfgkkkhjppppkl";
		String[] c=a.split("(.)\\1+");//（.)\\1第一组出现一次  (.)\\1+第一组出现多次
		for(String i:c)
		System.out.println(i);
		String f="我我....我...我.要...要要...要学....学学..学.编..编编.编.程.程.程..程";
		String[] l= f.split("\\.");
		StringBuilder l1=new StringBuilder("");
		for(String i:l) {
			l1.append(i);
		}
		String f1=l1.toString();
		System.out.println(f1);
		//$1  代表  regex  里面第一个捕获性分组（这里是 ([^\\.]+) ）捕获到的内容，例如：
		String f2=f1.replaceAll("(.)\\1+", "$1");
		System.out.println(f2);
	}
}
