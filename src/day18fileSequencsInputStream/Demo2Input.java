package day18fileSequencsInputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



/* A:BufferedReader��readLine������
	* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
* B:Scanner
*/
public class Demo2Input {
	public static void main(String[] args) throws IOException {
		//new InputStreamReader(System.in)�ַ�ת����
		BufferedReader bR=new BufferedReader(new InputStreamReader(System.in));
		String a=bR.readLine();
		System.out.println(a);
		//��Ҫʹ��Scanner,��Ϊ���๦��ǿ�󣬿������int��float�ȵ�
		Scanner  scanner=new Scanner(System.in);
		String a1= scanner.nextLine();
		System.out.println(a1);
	}
}
