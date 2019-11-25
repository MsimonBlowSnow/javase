package day20IOStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* flush()方法
* 用来刷新缓冲区的,刷新后可以再次写出,
* 如果Buffered没写满，就要利用flush来刷新，刷新到文件里去 
* close()方法
* 用来关闭流释放资源的的,如果是带缓冲区的流对象的close()方法,
* 不但会关闭流,还会再关闭流之前刷新缓冲区,关闭后不能再写出 
*/
public class DemoFlushAndClose {
	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("src/day20IOStream/a.txt");
		FileOutputStream fos =new FileOutputStream("src/day20IOStream/a.txt");
		BufferedInputStream bfis=new BufferedInputStream(fis);
		BufferedOutputStream bfos=new BufferedOutputStream(fos);
		int flag=0;
		
		while((flag=fis.read())!=-1) {
			fos.write(flag);
			fos.flush();
		}
		fis.close();
		fos.close();
	}
}
