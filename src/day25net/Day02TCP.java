package day25net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;


/*1.tcp��������
 	*�ͻ�����Socket����
 	*�������ServerSocket����
 *2.����������
 	*������getOutputstream��getIpputstream��������
 *3.�ͻ��˴�����ɺ�һ��Ҫ��
	*Socket.shutdownOutput()һ��Ҫ�÷��򣬽��ܶ�һֱ�ڵȴ�������,���ܽ�����һ��
 */
public class Day02TCP {
	public static void main(String[] args) {

		new Thread() {
			public void run() {
				try {
					this.sleep(2000);
					Socket socketClient = new Socket("127.0.0.1",8888);
					OutputStream opt = socketClient.getOutputStream();
					opt.write("���,������!".getBytes());
					InputStream aInputStream=socketClient.getInputStream();
					byte[] a=new byte[1024]; 
					int len=aInputStream.read(a);
					System.out.println(new String(a,0,len));
					socketClient.close();
				} catch (IOException e) {
					System.out.println("û������");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				try {
					ServerSocket socketserver = new ServerSocket(8888);
					Socket aSocket=socketserver.accept();
					System.out.println(aSocket);
					InputStream aInputStream=aSocket.getInputStream();
					byte[] a=new byte[1024];
					//��¼��Ч����
					int len=aInputStream.read(a);
					System.out.println(aSocket.getLocalAddress()+":"+
							new String(a,0,len));
					aSocket.getOutputStream().write("�յ���Ϣ!".getBytes());
					socketserver.close();
				} catch (IOException e) {
					System.out.println("����");
				}
			}
		}.start();
	}
}
