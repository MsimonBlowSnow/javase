package day25net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*保证服务器多线程，方便访问
 * ServerSocket aServerSocket= new ServerSocket(9999);
		while(true) {
			//服务器获取连接
			Socket aSocket=aServerSocket.accept();
			//根据连接的客户端不同创建一个线程
			new Thread(new Day05TCPserverHelp(aSocket)).start();
		}
 * */
public class Day05TCPserver {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				try {
					ServerSocket aServerSocket= new ServerSocket(9999);
					while(true) {
						Socket aSocket=aServerSocket.accept();
						new Thread(new Day05TCPserverHelp(aSocket)).start();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			};
			
		}.start();
	}
}
