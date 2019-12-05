package day20IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*处理IOException
 * 下面代码为java1.6处理流异常的代码method
 * 1.尽量把流关掉
 * 2个try{}finally{}是为了保证尽量多关上流
 * 防止一个流出现错误，另一个关不上
 * 
 * 1.7版本流实现了autocloseable接口
 * 看method17
 * */
public class DemoIOSException {
	public static void main(String[] args) throws IOException {
		//1.6版本处理IOException
		method();
		//1.7版本流实现了autocloseable接口
		method17(); 
	}

	private static void method17() throws IOException, FileNotFoundException {
		try(FileInputStream fis=new FileInputStream("a.txt");
				//实现AutoCloseable接口，重写close方法
				//关闭流时自动执行close方法
				Stream17 sk=new Stream17();
				FileOutputStream fos=new FileOutputStream("acopy.txt");) { 
			int flag = 0;
			while ((flag = fis.read()) != -1) {
				fos.write(flag);
			} 
		}
	}

	private static void method() throws FileNotFoundException, IOException {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis = new FileInputStream("a.txt");
			fos = new FileOutputStream("acopy.txt");
			int flag = 0;
			while ((flag = fis.read()) != -1) {
				fos.write(flag);
			} 
		} finally {
			//如果没有try{}finally{},上面出了异常，这这两个流就不能关闭
			try {
				if (fis != null)
					fis.close();
			} finally {
				if(fos!=null)
				fos.close();
			}
			
		}
	}
}

class Stream17 implements AutoCloseable{

	@Override
	public void close()  {
		System.out.println("1.7版本关闭流对象");
	}
	
}