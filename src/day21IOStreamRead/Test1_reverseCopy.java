package day21IOStreamRead;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;


/* 将一个文本文档上的文本反转,第一行和倒数第一行交换,第二行和倒数第二行交换
 * 思路
 * 1.创建输出输入字符流流
 * 2.创建一个String型的集合
 * 3.用输入字符流读出出数据并保存在String的集合中
 * 4.调用反转函数
 * 5.通过输出流保存到文件中
 * 
 *流尽量晚开早如下
 */
public class Test1_reverseCopy {
	public static void main(String[] args) throws IOException {
		String str=null;
		TreeSet<String> lstr=new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return -1;
			}
		});
		BufferedReader bfr =new BufferedReader(new FileReader("c.txt"));
		while((str=bfr.readLine())!=null) {
			lstr.add(str);
		}
		bfr.close();
		BufferedWriter bwr= new BufferedWriter(new FileWriter("ccopy.txt"));
		for (String string : lstr) {
			bwr.write(string);
			bwr.newLine();
		}
		bwr.close();
	}
}
