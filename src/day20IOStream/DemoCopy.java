package day20IOStream;


/*copy�����ַ�ʽ��
 *A����һ���ֽ�дһ���ֽ� 	
 * 	����ļ�̫���˲������ø÷�����
 * 	ԭ���Ǹ÷���ÿ��ֻ��һ���ֽڣ�̫����
 * 	���磺һ��1M���ļ�������Ҫ��1024*1024�Σ���Ҫд1024*1024�Σ�
 * 	���ж����ļ�̫�󣬲�������������򿽱�
 *B������һ����Դ�ļ��ȴ��byte[] һ�ζ���
 *	FileInputStream����һ������available(),���ض�ȥ�ļ��Ĵ�СB
 *	���Ƽ�����ʱ���ļ�������10G Ҫ����10G�ڴ棬�ڴ治���á�
 *C����һ���ʵ���С���飬��DemoCopy2.java
 * */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLockInterruptionException;

public class DemoCopy {
	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("src/day20IOStream/�ֽ����������.png");
		FileOutputStream fos =new FileOutputStream("src/day20IOStream/copylicunxu.png");
		methodReadOneByte(fis, fos);
		byte[] a= new byte[fis.available()];//FileInputStream����һ������available(),���ض�ȥ�ļ��Ĵ�СB
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

