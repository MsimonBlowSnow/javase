package day25net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.sound.sampled.Port;

/*1.UDP
 	*传输端:
 		*创建DategramSocket 对象，不用参数
 		*创建DategramPacket 对象，传参数(信息.getbytes()，信息长度，ip，端口号);
 		*DategramSocket 对象.send(DategramPacket 对象);
 	*接受端
 		*创建DategramSocket 对象,要一个端口号
 		*创建DategramPacket 对象，要数据长度和，接受的数组
*2.数据传送与接受 
 	*传输端:
 		*DategramSocket 对象.send(DategramPacket 对象);发送数据包
 	*接受端:
 		*DategramSocket 对象.receive(DategramPacktet 对象);接受数据包
 		*数据包.getAddress();//获取发送端的ip
		*数据包.getData();//获取发送的数据
		*数据包.getPort();//获取发送端的端口号
 * */
public class Day01Udp {
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				try {
					//创建socket对象
					DatagramSocket aSocket = new DatagramSocket();
					Scanner scanner = new Scanner(System.in);
					String astring = null;
					while (true) {
						System.out.println("请输入你要发送的信息(quit退出):");
						astring = scanner.nextLine();
						//创建发送包
						DatagramPacket aDatagramPacket = new DatagramPacket(astring.getBytes(),
							astring.getBytes().length, InetAddress.getByName("127.0.0.1"), 9999);
						aSocket.send(aDatagramPacket);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				try {
					//接受socket一定要有端口
					DatagramSocket datagramSocket= new DatagramSocket(9999);
					byte[] aBytes= new byte[1024];
					while(true) {
						//创建接收包
						DatagramPacket aPacket= new DatagramPacket(aBytes,1024);
						datagramSocket.receive(aPacket);
						InetAddress address=aPacket.getAddress();
						int aPort=aPacket.getPort();
						aBytes=aPacket.getData();
						System.out.println(address+" "+aPort+":"+new String(aBytes,0,aBytes.length));
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			};
		}.start();
	}
}
