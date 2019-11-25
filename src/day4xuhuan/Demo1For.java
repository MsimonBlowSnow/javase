package day4xuhuan;
/*循环结构
 * for循环中两个
 * for(i=0;i<10;i++) 
 * for(int i;a)a是一个int 型数组 
 * */
public class Demo1For {
	public static void main(String[] args) {
		int i=0;
		//for循环语句
		for(i=0;i<10;i++) {
			System.out.println(i);
		}
		//while循环
		while(i!=0) {
			System.out.println(i--);
		}
		//dowhile循环
		do {
			System.out.println(i++);
		}while(i!=10);
		String[] a= {"4","3","2","1"};
		
		for (String string : a) {
			System.out.println(string);
		}
	}
}
