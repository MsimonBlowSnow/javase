package day25net;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Day05TCP {
	public static void main(String[] args) {
		new Thread() {
			public void run() {
				try { 
					this.sleep(3000);
					Socket aSocket=new Socket("127.0.0.1",9999);
					OutputStream netOutputStream=aSocket.getOutputStream();
					InputStream netInputStream= aSocket.getInputStream();
					InputStream fileInputStream=new FileInputStream("src/day25net/1.txt");
					int len;
					byte[] a=new byte[1024*8];
					while((len=fileInputStream.read(a))!=-1) {
						netOutputStream.write(a,0,len);
					}
					//避免服务器线程一直等待
					aSocket.shutdownOutput();
					len=netInputStream.read(a);
					System.out.println(new String(a,0,len));
					aSocket.close();
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block	
					e.printStackTrace();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			};
		}.start();
	}
}
