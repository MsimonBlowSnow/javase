package day26net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Day03SendAndReceiveThread {
	public static void main(String[] args) {
		new Thread() {
			//不能抛出异常只能自己处理
			public void run() {
				try {
					this.sleep(3000);
					DatagramSocket aDatagramSocket=new DatagramSocket();
				Scanner sc=new Scanner(System.in);
				while(true) {
					System.out.println("请输入传送的信息(quit退出):");
					String astring=sc.nextLine();
					if("quit".equals(astring)) {
						break;
					}
					DatagramPacket aPacket=new DatagramPacket(astring.getBytes(),0,
						astring.getBytes().length,InetAddress.getByName("127.0.0.1"), 6666);
						aDatagramSocket.send(aPacket);
					}	
				} catch(Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				}
				
			}
		}.start();
		new Thread() {
			public void run() {
				try {
				DatagramSocket aDatagramSocket=new DatagramSocket(6666);
				while(true) {
					DatagramPacket aPacket=new DatagramPacket(new byte[1024],1024);
					aDatagramSocket.receive(aPacket);
					byte[] a=aPacket.getData();
					InetAddress ip=aPacket.getAddress();
					int length=aPacket.getLength();
					System.out.println(ip+":"+new String(a,0,length));
				}	
				} catch(Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
				}
			}
		}.start();
	}
}
