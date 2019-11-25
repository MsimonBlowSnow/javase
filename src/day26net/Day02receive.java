package day26net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

import javax.sound.sampled.Port;

public class Day02receive {
	public static void main(String[] args) throws IOException {
		DatagramPacket aPacket=new DatagramPacket(new byte[1024],1024);
		DatagramSocket aDatagramSocket=new DatagramSocket(9999);
		byte[] arr=null;
		int length=0;
		while(true) {
			aDatagramSocket.receive(aPacket);
			arr=aPacket.getData(); 
			length=aPacket.getLength();
			String ip=aPacket.getAddress().getHostAddress();
			int aPort=aPacket.getPort();
			System.out.println(ip+":"+aPort+" say:"+new String(arr,0,arr.length));
		}
	}
}
