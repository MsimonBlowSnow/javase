package day20IOStream;


/*copy的三种方式：
 *A：读一个字节写一个字节 	
 * 	如果文件太大了不便于用该方法，
 * 	原因是该方法每次只读一个字节，太慢了
 * 	例如：一个1M的文件拷贝需要读1024*1024次，还要写1024*1024次，
 * 	所有对于文件太大，不建议用这个程序拷贝
 *B：创建一个与源文件等大的byte[] 一次读完
 *	FileInputStream中有一个方法available(),返回读去文件的大小B
 *	不推荐：有时候文件过大有10G 要创建10G内存，内存不够用。
 *C创建一个适当的小数组，见DemoCopy2.java
 * */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;

public class DemoCopy {
	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("src/day20IOStream/字节输入输出流.png");
		FileOutputStream fos =new FileOutputStream("src/day20IOStream/copylicunxu.png");
		methodReadOneByte(fis, fos);
		byte[] a= new byte[fis.available()];//FileInputStream中有一个方法available(),返回读去文件的大小B
		fis.read(a);
		fos.write(a);
	}

	private static void methodReadOneByte(FileInputStream fis, FileOutputStream fos) throws IOException {
		int flag=0;
		while ((flag=fis.read())!=-1) {
			fos.write(flag);
		}
	}
}

