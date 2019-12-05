package day18fileSequencsInputStream;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 1.什么是内存输出流
	* 该输出流可以向内存中写数据, 把内存当作一个缓冲区, 写出之后可以一次性获取出所有数据
* 2.使用方式
	* 创建对象: new ByteArrayOutputStream()
	* 写出数据: write(int), write(byte[])
	* 获取数据: toByteArray()
	* 
			FileInputStream fis = new FileInputStream("a.txt");
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			int b;
			while((b = fis.read()) != -1) {
				baos.write(b);
			}
			
			//byte[] newArr = baos.toByteArray();				//将内存缓冲区中所有的字节存储在newArr中
			//System.out.println(new String(newArr));
			System.out.println(baos);
			fis.close();

 * */
public class DemoByteArrayOutputStream {
	public static void main(String[] args) throws IOException {
		//通过字节流输入文件内容会有乱码例如:
		//methodFileInputStream();
		/*通过字节流输入有可能乱码,问题原因是中文是2个字节的,一次获取了奇数个字节
		 导致通过码表转义出了问题，
		 解决思路：
		 	*一次性读出所有字节并保存在内存中，然后一次性输出
		 	*保存在内存里面需要ByteArrayOutputstream
		 */
		ByteArrayOutputStream baos= new ByteArrayOutputStream();
		FileInputStream fis= new FileInputStream("c.txt");//默认路径Javase项目下
		int flag;
		while((flag=fis.read())!=-1) {
			baos.write(flag);
		}
		System.out.println(baos);//ByteAByteArrayOutputStream重写了tostring()方法
		baos.close();//底层用数组开发的，并没有建立管道(流)所有不关闭，也没关系
	}

	private static void methodFileInputStream() throws FileNotFoundException, IOException {
		FileInputStream fis= new FileInputStream("c.txt");//默认路径Javase项目下
		byte[] a=new byte[3];
		int len;
		while((len=fis.read(a))!=-1) {//len获取数组有效数组长度
			System.out.println( new String(a,0,len));
		}
		fis.close();
	}
}
