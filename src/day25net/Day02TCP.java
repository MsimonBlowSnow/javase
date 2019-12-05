package day25net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;


/*1.tcp发送数据
 	*客户端用Socket对象
 	*服务端用ServerSocket对象
 *2.创建流对象
 	*必须用getOutputstream和getIpputstream创建对象
 *3.客户端传输完成后一定要用
	*Socket.shutdownOutput()一定要用否则，接受端一直在等待读数据,不能进行下一部
 */
public class Day02TCP {
	public static void main(String[] args) {

		new Thread() {
			public void run() {
				try {
					this.sleep(2000);
					Socket socketClient = new Socket("127.0.0.1",8888);
					OutputStream opt = socketClient.getOutputStream();
					opt.write("你好,服务器!".getBytes());
					InputStream aInputStream=socketClient.getInputStream();
					byte[] a=new byte[1024]; 
					int len=aInputStream.read(a);
					System.out.println(new String(a,0,len));
					socketClient.close();
				} catch (IOException e) {
					System.out.println("没连接上");
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
					//记录有效长度
					int len=aInputStream.read(a);
					System.out.println(aSocket.getLocalAddress()+":"+
							new String(a,0,len));
					aSocket.getOutputStream().write("收到信息!".getBytes());
					socketserver.close();
				} catch (IOException e) {
					System.out.println("错误");
				}
			}
		}.start();
	}
}
