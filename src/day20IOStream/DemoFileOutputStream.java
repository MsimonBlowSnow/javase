package day20IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*A write()一次写出一个字节
* 如果file不存在,会创建出一个
* B	 定义FileOutputStream(file);删除内容重新弄写,
* 	 定义FileOutputStream(file,true);在后面追加,
*/
public class DemoFileOutputStream {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("src/day20IOStream/b.txt");	
		//fos.write(97);//虽然写出的是一个int数,但是在写出的时候会将前面的24个0去掉,所以写出的一个byte
		fos.write(98);
		fos.write(98);
		fos.close();
		FileOutputStream appendfos= new FileOutputStream("src/day20IOStream/b.txt",true);
		appendfos.write(110);
		appendfos.write(109);
		appendfos.close();

	}
}
