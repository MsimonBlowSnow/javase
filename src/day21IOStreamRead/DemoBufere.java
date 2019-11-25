package day21IOStreamRead;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * @param args
 * �������������е����ⷽ��
 * readLine()��bufferedRead������ķ��� 
 * newLine();bufferedwrite����ķ�������
 * 
 * newLine()��\r\n������
 * newLine()�ǿ�ƽ̨�ķ���
 * \r\nֻ֧�ֵ���windowsϵͳ
 * @throws IOException 
 */
public class DemoBufere {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new FileReader("c.txt"));
		BufferedWriter bfw = new BufferedWriter(new FileWriter("ccopy.txt"));
		String flag;
		while((flag=bfr.readLine())!=null) { //��ȡһ�в��������з�
			bfw.write(flag);
			bfw.newLine();  //���뻻�з�
		}
		bfr.close();
		bfw.close();
	}
}