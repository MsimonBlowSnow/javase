package day25net;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;

/*shutdownOutput();�ǳ���Ҫ�����Ӵ˷������ܵ�������
 * 
 *��֤�����ļ������ֲ�һ��
 	*������·����+System.currentTimeMillis()+new Random().nextInt(9999)+���ļ�����;
 * */
public class Day04TCPCOPY {
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				try {
					this.sleep(2000);
					Socket socketclient=new Socket("127.0.0.1",9999);
					OutputStream aOutputStream=socketclient.getOutputStream();
					
					InputStream aInputStream= new FileInputStream("src/day25net/1.txt");
					InputStream aInputStream1=socketclient.getInputStream();
					byte[] a=new byte[1024*8];
					int len=0;
					while((len=aInputStream.read(a))!=-1) {
						aOutputStream.write(new String(a,0,len).getBytes());
					}
					//���߷������ˣ���ֹ���䣬��Ҫ�ڵ���
					socketclient.shutdownOutput();
					len=aInputStream1.read(a);
					System.out.println(new String(a,0,len));
					aInputStream.close();
					aInputStream.close();
					System.out.println(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				try {
					this.sleep(2000);
					ServerSocket socketServer=new ServerSocket(9999);
					Socket socketclient=socketServer.accept();
					OutputStream aOutputStream=socketclient.getOutputStream();
					InputStream aInputStream=socketclient.getInputStream();
					//��ֹ�ļ�ͬ��
					String afileString="src/day25net/"+System.currentTimeMillis()+
							new Random().nextInt(9999)+"1.txt";
					OutputStream fileOutputStream=new FileOutputStream(new File(afileString));
					byte[] a=new byte[1024*8];
					int len=0;
					while((len=aInputStream.read(a))!=-1) {
						System.out.println(new String(a,0,len));
						fileOutputStream.write(new String(a,0,len).getBytes());
					}
					aOutputStream.write("�ϴ��ɹ���ѽ".getBytes());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
	}
}
