package day21IOStreamRead;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * @param args
 * 带缓冲区的流中的特殊方法
 * readLine()；bufferedRead而里面的方法 
 * newLine();bufferedwrite里面的方法换行
 * 
 * newLine()与\r\n的区别
 * newLine()是跨平台的方法
 * \r\n只支持的是windows系统
 * @throws IOException 
 */
public class DemoBufere {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new FileReader("c.txt"));
		BufferedWriter bfw = new BufferedWriter(new FileWriter("ccopy.txt"));
		String flag;
		while((flag=bfr.readLine())!=null) { //读取一行不包括换行符
			bfw.write(flag);
			bfw.newLine();  //加入换行符
		}
		bfr.close();
		bfw.close();
	}
}