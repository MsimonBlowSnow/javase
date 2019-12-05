package day21IOStreamRead;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 试用软件
 * 1.试用10次，第十次要求购买正版
 	*分析： 	
 		*把使试用的次数保存在一个文件下 
 		*每次使用次数减一并存会文件中 
 */
public class DemoSoftTestUse {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr= new BufferedReader(new FileReader("src/day21IOStreamRead/a.txt"));
		String str= null;
		int times=0;
		while((str=bfr.readLine())!=null) {
			times= Integer.parseInt(str);
			if(times!=0) {
				System.out.println("你还有"+--times+"次机会");
			}else {
				System.out.println("请购买正版!");
			}
		}
		str=times+"";
		bfr.close();
		BufferedWriter bfw=new BufferedWriter(new FileWriter("src/day21IOStreamRead/a.txt"));
		bfw.write(str);
		bfw.close();
	}
}
