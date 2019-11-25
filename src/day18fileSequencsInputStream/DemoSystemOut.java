package day18fileSequencsInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
/* 1.什么是打印流
* 该流可以很方便的将对象的toString()结果输出, 并且自动加上换行, 而且可以使用自动刷出的模式
* System.out就是一个PrintStream, 其默认向控制台输出信息
* 2.使用方式
* 打印: print(), println()
* 自动刷出: PrintWriter(OutputStream out, boolean autoFlush, String encoding) 
* 打印流只操作数据目的
*/
public class DemoSystemOut {
	public static void main(String[] args) throws FileNotFoundException {
		methodprintStream();
		//加true 这个参数有自动刷出的功能不过只能针对println()方法
		PrintWriter pw = new PrintWriter(new FileOutputStream("g.txt"),true);
		pw.print(true);
		pw.write(97);
		pw.println(97);
		pw.write(99);
		//pw.close;//如果不关流，println()有自动刷出的功能,println()前面的会刷出,后面的不会
	}

	private static void methodprintStream() throws FileNotFoundException {
		PrintStream ps = System.out;
		ps.println(97);					//其实底层用的是Integer.toString(x),将x转换为数字字符串打印
		ps.write(97);					//a,转化成字符了
		ps.println("xxx");
		ps.println(new Person(23,"张三"));
		Person p = null;
		ps.println(p);//如果是null,就返回null,如果不是null,就调用对象的toString()
		PrintWriter pw = new PrintWriter(new FileOutputStream("g.txt"), true);
		pw.write(97);
		pw.print("大家好");
		pw.println("你好");				//自动刷出,只针对的是println方法
		pw.close();
	}
}
