package day12String;

/*AString的替换功能
 	*String replace(char old,char new);//对原字符串没有变化
 	*String replace(String old,String);
 *B去除字符串里面的空格 
 	*String trim();//去除两段空格
 *C:String的按字典顺序比较两个字符串及案例演示 
 	* int compareto(String str)
 	* int comparetoIngnoreCare(String str)
 * */
public class Demo12StringMethod {
	public static void main(String[] args) {
		//String replace(char old,char new);
		String str1="aaabbbccc";
		String str2=str1.replace('a', 'i');//对原字符串没有变化
	
		//String replace(String old,String);
		System.out.println(str2);
		str2=str1.replace("aaa", "1");//对原字符串没有变化
		System.out.println(str2);
		System.out.println(str1);
		
		//trim()
		System.out.println(" a b c edafd adddddvb  ".trim());//去掉两端的空格
		
		//compareto()
		String str="黑"+0;
		String str0="马"+0;
		System.out.println("黑"+0);	//找Unicode码表
		System.out.println("马"+0);
		System.out.println(str.compareTo(str0));
		
		String str5="heima";
		String str6="HEIMA";
		System.out.println(str5.compareToIgnoreCase(str6));
	}
}
