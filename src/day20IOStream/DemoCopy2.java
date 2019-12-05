package day20IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*通过创建小数组来完成Copy
 * 问题：
*	创建的数组不是文件大小的整数倍，最后一次数组的内容有一部分是无效的例如method1()中
*	处理方法：
*	fileInputStream里面read(byte[] a)返回一个有效值个数
*	fileOutputstream里面有一个字写有效的
*	write(byte[] a,int off,int len)将数组a索引为off到len（不包括len）
*	写到文件里中
*	flag=Read(byte[] a)；
*	write(a,0,Read(byte[] a))就解决了;
*	如method2
*标准格式:
*	一般数组会定定义为1024的整数倍
*	格式看Method3
*/
public class DemoCopy2 {
	public static void main(String[] args) throws IOException {
		//method1();
		//method2();
		method3();
	}

	private static void method3() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("src/day20IOStream/licunxu.jpg");
		FileOutputStream fos= new FileOutputStream("src/day20IOStream/Copylicx.jpg");
		byte[] a= new byte[1024*8];
		int flag=0;
		while((flag=fis.read(a))!=-1) {//读read()中一定要写数组
			fos.write(a,0,flag);
		}
	}

	private static void method2() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("src/day20IOStream/DemoCopy2.txt");
		FileOutputStream fos= new FileOutputStream("src/day20IOStream/CopyDemoCopy2.txt");
		byte[] a= new byte[2];
		int flag=0;
		while((flag=fis.read(a))!=-1) {//flag保存有效长度
			fos.write(a,0,flag);
		}
	}

	private static void method1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("src/day20IOStream/DemoCopy2.txt");
		byte[] a= new byte[2];
		int flag=0;
		while((flag=fis.read(a))!=-1) {
			/*该文件里只有三个字符缺输出了四个字符，
			应为在第二次输入时,第三个字符覆盖了第一个字符，而没有第四个字符
			，所以a[0]m没有变，如果不处理也会写到文件里*/
			System.out.println(Arrays.toString(a));
		}
	}
}
