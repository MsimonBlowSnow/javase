package day12String;
/*×Ö·û´®µÄ·´×ª*/
public class DemoResever {
	public static void main(String[] args) {
		String str1="abcd";
		String str2="";
		char[] arr=str1.toCharArray();
		for (int i =arr.length-1; i>=0; i--) {
			str2=str2+arr[i];
		}
		System.out.println(str2);
		System.out.println(new StringBuffer(str1).reverse());
	}
}
