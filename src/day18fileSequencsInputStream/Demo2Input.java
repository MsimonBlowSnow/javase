package day18fileSequencsInputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



/* A:BufferedReader的readLine方法。
	* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
* B:Scanner
*/
public class Demo2Input {
	public static void main(String[] args) throws IOException {
		//new InputStreamReader(System.in)字符转化流
		BufferedReader bR=new BufferedReader(new InputStreamReader(System.in));
		String a=bR.readLine();
		System.out.println(a);
		//主要使用Scanner,因为该类功能强大，可以输出int，float等等
		Scanner  scanner=new Scanner(System.in);
		String a1= scanner.nextLine();
		System.out.println(a1);
	}
}
