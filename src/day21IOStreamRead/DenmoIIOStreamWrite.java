package day21IOStreamRead;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//
public class DenmoIIOStreamWrite {
	public static void main(String[] args) throws IOException {
		//两个参数后面加一个true就是追加模式
		FileWriter fw= new FileWriter("a.txt");
		String str=null;
		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.println("请输入一行数据:");
			str=sc.nextLine();
			if(str.equals("quit"))
				break;
			fw.write(str+"\r\n");
		}
		sc.close();
		fw.close();
	}
}