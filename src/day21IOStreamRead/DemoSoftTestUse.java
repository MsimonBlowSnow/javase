package day21IOStreamRead;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �������
 * 1.����10�Σ���ʮ��Ҫ��������
 	*������ 	
 		*��ʹ���õĴ���������һ���ļ��� 
 		*ÿ��ʹ�ô�����һ������ļ��� 
 */
public class DemoSoftTestUse {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr= new BufferedReader(new FileReader("src/day21IOStreamRead/a.txt"));
		String str= null;
		int times=0;
		while((str=bfr.readLine())!=null) {
			times= Integer.parseInt(str);
			if(times!=0) {
				System.out.println("�㻹��"+--times+"�λ���");
			}else {
				System.out.println("�빺������!");
			}
		}
		str=times+"";
		bfr.close();
		BufferedWriter bfw=new BufferedWriter(new FileWriter("src/day21IOStreamRead/a.txt"));
		bfw.write(str);
		bfw.close();
	}
}
