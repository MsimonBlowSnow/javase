package day21IOStreamRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

/* ��ȡһ���ı���ÿ���ַ����ֵĴ���,
 * �����д��times.txt��
 */
public class TestGetCharTimes {
	public static void main(String[] args) throws IOException {
		TreeMap<Character, Integer> tmap= new TreeMap<>();
		BufferedReader bfr= new BufferedReader(new FileReader("a.txt"));
		int flag=0;
		while((flag=bfr.read())!=-1) {
			char flag1=(char)flag;
			if(tmap.keySet().contains((char)flag)) {
				int a=tmap.get((char)flag);
				a++;
				tmap.put(flag1, a);
			}else
				tmap.put(flag1, 1);
		}
		for (char a: tmap.keySet()) {
			if(a=='\n')
				System.out.println("\\n"+":"+tmap.get(a)+"��");
			else if(a=='\r')
				System.out.println("\\r"+":"+tmap.get(a)+"��");	
			else
				System.out.println(a+":"+tmap.get(a)+"��");
		}
		bfr.close();
	}
}
