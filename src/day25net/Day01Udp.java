package day25net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.sound.sampled.Port;

/*1.UDP
 	*�����:
 		*����DategramSocket ���󣬲��ò���
 		*����DategramPacket ���󣬴�����(��Ϣ.getbytes()����Ϣ���ȣ�ip���˿ں�);
 		*DategramSocket ����.send(DategramPacket ����);
 	*���ܶ�
 		*����DategramSocket ����,Ҫһ���˿ں�
 		*����DategramPacket ����Ҫ���ݳ��Ⱥͣ����ܵ�����
*2.���ݴ�������� 
 	*�����:
 		*DategramSocket ����.send(DategramPacket ����);�������ݰ�
 	*���ܶ�:
 		*DategramSocket ����.receive(DategramPacktet ����);�������ݰ�
 		*���ݰ�.getAddress();//��ȡ���Ͷ˵�ip
		*���ݰ�.getData();//��ȡ���͵�����
		*���ݰ�.getPort();//��ȡ���Ͷ˵Ķ˿ں�
 * */
public class Day01Udp {
	public static void main(String[] args) {
		new Thread() {
			@Override
			public void run() {
				try {
					//����socket����
					DatagramSocket aSocket = new DatagramSocket();
					Scanner scanner = new Scanner(System.in);
					String astring = null;
					while (true) {
						System.out.println("��������Ҫ���͵���Ϣ(quit�˳�):");
						astring = scanner.nextLine();
						//�������Ͱ�
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
					//����socketһ��Ҫ�ж˿�
					DatagramSocket datagramSocket= new DatagramSocket(9999);
					byte[] aBytes= new byte[1024];
					while(true) {
						//�������հ�
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
