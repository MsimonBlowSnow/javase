package day18fileSequencsInputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*1.什么是数据输入输出流
	* DataInputStream, DataOutputStream可以按照基本数据类型大小读写数据
	* 例如按Long大小写出一个数字, 写出时该数据占8字节. 读取的时候也可以按照Long类型读取, 一次读取8个字节.
* DataOutputStream writeInt();方法
* DataOutputStream ReadInt();方法
 * */
public class DemoDataIO {
	public static void main(String[] args) throws IOException {
		//mehtodIO();
		DataOutputStream dos =new DataOutputStream(new FileOutputStream("a.txt"));
		dos.writeInt(999);//更具数据大小输入不会截取后八位
		dos.writeInt(998);
		dos.writeInt(997);
		dos.close();
		DataInputStream dis= new DataInputStream(new FileInputStream("a.txt"));
		int a=dis.readInt();
		int a1=dis.readInt();
		int a2= dis.readInt();
		System.out.println(a+" "+a1+" "+a2);
		dis.close();

	}

	private static void mehtodIO() throws FileNotFoundException, IOException {
		//fileoutStream 该流一次只能写一个8位数(即后八位)
		FileOutputStream fos=new FileOutputStream ("a.txt"); 
		//999的源码00000000 00000000 00000011 11100111 只有后八位输入了
		fos.write(999); 
		fos.write(998);
		fos.write(997);
		fos.close();
		
		FileInputStream fis = new FileInputStream("a.txt");
		int a=fis.read();
		int a1=fis.read();
		int a2=fis.read();
		System.out.println(a+" "+a1+" "+a2);
		fis.close();
	}
}
