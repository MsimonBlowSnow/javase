package day25net;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Random;

public class Day05TCPserverHelp implements Runnable {
	private Socket serSocket;
	public Day05TCPserverHelp(Socket a) {
		serSocket=a;
	}
	@Override
	public void run() {
		//只能自己处理，不能抛异常
		try {
			InputStream netInputStream=serSocket.getInputStream();
			OutputStream netOutputStream = serSocket.getOutputStream();
			String afile= "src/day25net/"+System.currentTimeMillis()+
					new Random().nextInt(9999)+".txt";
			OutputStream fOutputStream = new FileOutputStream(afile);
			int len;
			byte[] abyte=new byte[1024*8];
			while((len=netInputStream.read(abyte))!=-1) {
				System.out.println(new String(abyte,0,len));
				fOutputStream.write(abyte,0,len);
			}
				netOutputStream.write("传送成功".getBytes());
				fOutputStream.close();
				serSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
	}

}
