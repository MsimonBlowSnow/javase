package day12String;
/*小字符串出现的次数
 * 
 * 
 * 
 * */
public class Demo13Stringtest {
	public static void main(String[] args) {
		String string ="adfafadfasfafyrwrafdgaddgadffarfafrwtwrraaaaaafafarrrrrrtwraaaffafrwgaafagggtwyt";
		int flag=0;
		int time=0;
		String str1=string;
		System.out.println(str1.indexOf("af"));
		while((flag=str1.indexOf("af"))!=-1) {
			time++;
			str1=str1.substring(flag+"af".length());
		}
		System.out.println(time);
		System.out.println(string);
	}
}
