package day21IOStreamRead;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//
public class DenmoIIOStreamWrite {
	public static void main(String[] args) throws IOException {
		//�������������һ��true����׷��ģʽ
		FileWriter fw= new FileWriter("a.txt");
		String str=null;
		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.println("������һ������:");
			str=sc.nextLine();
			if(str.equals("quit"))
				break;
			fw.write(str+"\r\n");
		}
		sc.close();
		fw.close();
	}
}