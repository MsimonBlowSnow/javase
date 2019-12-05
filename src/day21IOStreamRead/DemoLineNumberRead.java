package day21IOStreamRead;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/*LineNumberRead
 * 具有获取行数和设置重哪一行开始
 * getLineNumber()获取行数
 *setLineNumber()设置行数
 */
public class DemoLineNumberRead {
	public static void main(String[] args) throws IOException {
		LineNumberReader lnr= new LineNumberReader(new FileReader("c.txt"));
		String flag;
		//获取行数
		//nethodGetLine(lnr);
		System.out.println("设置行数==========================");
		//设置行数，参数+1，如设置31行，lnr.setLineNumber(30);
		methodSetLine(lnr);
	}

	private static void methodSetLine(LineNumberReader lnr) throws IOException {
		lnr.setLineNumber(30);
		String flag;
		while ((flag=lnr.readLine())!=null){
			System.out.println(lnr.getLineNumber()+":"+flag);
		}
		lnr.close();
	}

	private static void nethodGetLine(LineNumberReader lnr) throws IOException {
		String flag;
		while ((flag=lnr.readLine())!=null){
			System.out.println(lnr.getLineNumber()+":"+flag);
		}
	}
}
