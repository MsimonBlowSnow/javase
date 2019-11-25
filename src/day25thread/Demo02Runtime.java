package day25thread;

import java.io.IOException;

/* Runtime类是一个单例类
 * Runtime r = Runtime.getRuntime();
			//r.exec("shutdown -s -t 300");		//300秒后关机
			r.exec("shutdown-a");			//取消关机
 * 
*/
public class Demo02Runtime {
	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		//Runtime 用来单例设计模式，操作的是同一个对象
		r.exec("shutdown -s -t 60");		//60秒后关机
		r.exec("shutdown -a");			//取消关机
	}
}
