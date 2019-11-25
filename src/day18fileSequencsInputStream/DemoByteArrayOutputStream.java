package day18fileSequencsInputStream;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 1.ʲô���ڴ������
	* ��������������ڴ���д����, ���ڴ浱��һ��������, д��֮�����һ���Ի�ȡ����������
* 2.ʹ�÷�ʽ
	* ��������: new ByteArrayOutputStream()
	* д������: write(int), write(byte[])
	* ��ȡ����: toByteArray()
	* 
			FileInputStream fis = new FileInputStream("a.txt");
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			int b;
			while((b = fis.read()) != -1) {
				baos.write(b);
			}
			
			//byte[] newArr = baos.toByteArray();				//���ڴ滺���������е��ֽڴ洢��newArr��
			//System.out.println(new String(newArr));
			System.out.println(baos);
			fis.close();

 * */
public class DemoByteArrayOutputStream {
	public static void main(String[] args) throws IOException {
		//ͨ���ֽ��������ļ����ݻ�����������:
		//methodFileInputStream();
		/*ͨ���ֽ��������п�������,����ԭ����������2���ֽڵ�,һ�λ�ȡ���������ֽ�
		 ����ͨ�����ת��������⣬
		 ���˼·��
		 	*һ���Զ��������ֽڲ��������ڴ��У�Ȼ��һ�������
		 	*�������ڴ�������ҪByteArrayOutputstream
		 */
		ByteArrayOutputStream baos= new ByteArrayOutputStream();
		FileInputStream fis= new FileInputStream("c.txt");//Ĭ��·��Javase��Ŀ��
		int flag;
		while((flag=fis.read())!=-1) {
			baos.write(flag);
		}
		System.out.println(baos);//ByteAByteArrayOutputStream��д��tostring()����
		baos.close();//�ײ������鿪���ģ���û�н����ܵ�(��)���в��رգ�Ҳû��ϵ
	}

	private static void methodFileInputStream() throws FileNotFoundException, IOException {
		FileInputStream fis= new FileInputStream("c.txt");//Ĭ��·��Javase��Ŀ��
		byte[] a=new byte[3];
		int len;
		while((len=fis.read(a))!=-1) {//len��ȡ������Ч���鳤��
			System.out.println( new String(a,0,len));
		}
		fis.close();
	}
}
