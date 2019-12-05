package day26net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Day02sendmessages {
	public static void main(String[] args) throws IOException {
		Scanner scanner= new Scanner(System.in);
		String messageString="";
		DatagramSocket aDatagramSocket=new DatagramSocket();
		while(true) {
			System.out.println("输入信息(quit退出):");
			messageString=scanner.nextLine();
			if(!messageString.equals("quit")) {
				DatagramPacket  aDatagramPacket=new DatagramPacket(messageString.getBytes(),	
					messageString.getBytes().length, InetAddress.getByName("127.0.0.1"),9999);
			aDatagramSocket.send(aDatagramPacket);
			}else {
				break;
			}
		}
	}
}
