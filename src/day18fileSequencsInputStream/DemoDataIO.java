package day18fileSequencsInputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*1.ʲô���������������
	* DataInputStream, DataOutputStream���԰��ջ����������ʹ�С��д����
	* ���簴Long��Сд��һ������, д��ʱ������ռ8�ֽ�. ��ȡ��ʱ��Ҳ���԰���Long���Ͷ�ȡ, һ�ζ�ȡ8���ֽ�.
* DataOutputStream writeInt();����
* DataOutputStream ReadInt();����
 * */
public class DemoDataIO {
	public static void main(String[] args) throws IOException {
		//mehtodIO();
		DataOutputStream dos =new DataOutputStream(new FileOutputStream("a.txt"));
		dos.writeInt(999);//�������ݴ�С���벻���ȡ���λ
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
		//fileoutStream ����һ��ֻ��дһ��8λ��(�����λ)
		FileOutputStream fos=new FileOutputStream ("a.txt"); 
		//999��Դ��00000000 00000000 00000011 11100111 ֻ�к��λ������
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
