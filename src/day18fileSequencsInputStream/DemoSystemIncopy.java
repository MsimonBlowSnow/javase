package day18fileSequencsInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/*修改标准输入输出流去拷贝片
 * 开发不推荐使用
 * */
public class DemoSystemIncopy {
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("c.txt"));//改变标准输入流
		System.setOut(new PrintStream("a.txt"));//改变标准输出流
		byte[] a= new byte[1024*8];
		int len;//记录有效长度
		InputStream is=System.in; 
		PrintStream ps=System.out;
		while((len=is.read(a))!=-1) {
			ps.write(a,0,len);
		}
		is.close();
		ps.close();
	}
}
