package day18fileSequencsInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* 1.什么是对象操作流
* 该流可以将一个对象写出, 或者读取一个对象到程序中. 也就是执行了序列化和反序列化的操作.
*1.1什么叫序列化和反序列化,把对象写入文件里面叫序列化，读取文件里面的对象叫反序列化
* 2.使用方式
* 写出: new ObjectOutputStream(OutputStream), writeObject()

		public class Demo3_ObjectOutputStream {

		}
*/
public class DemoObjectOutputStream {
	public static void main(String[] args) throws IOException {
			Person p1 = new Person(23,"张三");
			Person p2 = new Person(24,"李四");
	//		FileOutputStream fos = new FileOutputStream("e.txt");
	//		fos.write(p1);
	//		FileWriter fw = new FileWriter("e.txt");
	//		fw.write(p1);
			//无论是字节输出流,还是字符输出流都不能直接写出对象
			//序列化对象必须实现序列化接口
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e.txt"));//创建对象输出流
			oos.writeObject(p1);//存进去object对象
			oos.writeObject(p2);
			//序列化后，看文件是看不懂的，应为进过了码表的转移,也不许要看懂,只要能反序列化就行
			oos.close();
	}	
}
