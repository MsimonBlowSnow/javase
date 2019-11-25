package day25net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*��֤���������̣߳��������
 * ServerSocket aServerSocket= new ServerSocket(9999);
		while(true) {
			//��������ȡ����
			Socket aSocket=aServerSocket.accept();
			//�������ӵĿͻ��˲�ͬ����һ���߳�
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
