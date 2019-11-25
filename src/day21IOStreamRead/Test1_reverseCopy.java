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


/* ��һ���ı��ĵ��ϵ��ı���ת,��һ�к͵�����һ�н���,�ڶ��к͵����ڶ��н���
 * ˼·
 * 1.������������ַ�����
 * 2.����һ��String�͵ļ���
 * 3.�������ַ������������ݲ�������String�ļ�����
 * 4.���÷�ת����
 * 5.ͨ����������浽�ļ���
 * 
 *��������������
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
