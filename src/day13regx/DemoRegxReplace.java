package day13regx;
/*replaceAll(regx,statement)
 *������ʽ���滻��
 * */
public class DemoRegxReplace {
	public static void main(String[] args) {
		String a="I12hate33you";
		String b=a.replaceAll("\\d","");
		System.out.println(b);
	}
}
