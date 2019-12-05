package day20IOStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*图片加密：
 * 用输出流入流读取图片字节用输入流与上一个数字，然后在输入文件就可以了
 * 密码：与的那个数，与两次结果相同
 * 例如：加密图片如下
 * */
public class DemoFilePassword {
	public static void main(String[] args) throws IOException {
		methodJiaPassword();
		methodJiePassword();
	}

	private static void methodJiePassword() throws FileNotFoundException, IOException {
		FileInputStream fis= new FileInputStream("src/day20IOStream/Passwordlicunxu.jpg");
		FileOutputStream fos=new FileOutputStream("src/day20IOStream/Jielicunxu.jpg");
		
		//1.7版本关闭流对象
		try(BufferedInputStream bfis= new BufferedInputStream(fis);
			BufferedOutputStream bfos = new BufferedOutputStream(fos);){
			int flag=0;
			while ((flag=bfis.read())!=-1) {
				bfos.write(flag^123456);
			}
		}
	}

	private static void methodJiaPassword() throws FileNotFoundException, IOException {
		FileInputStream fis= new FileInputStream("src/day20IOStream/licunxu.jpg");
		FileOutputStream fos=new FileOutputStream("src/day20IOStream/Passwordlicunxu.jpg");
		
		//1.7版本关闭流对象
		try(BufferedInputStream bfis= new BufferedInputStream(fis);
			BufferedOutputStream bfos = new BufferedOutputStream(fos);){
			int flag=0;
			while ((flag=bfis.read())!=-1) {
				bfos.write(flag^123456);
			}
		}
	}
}
