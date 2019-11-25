package day26net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;


/*1.����Receive
 	* ����DatagramSocket, ָ���˿ں�
 	* ����DatagramPacket, ָ������, ����
 	* ʹ��DatagramSocket����DatagramPacket
 	* �ر�DatagramSocket
 	* ��DatagramPacket�л�ȡ����
*2.���շ���ȡip�Ͷ˿ں�
	* String ip = packet.getAddress().getHostAddress();
	* int port = packet.getPort(); 
*/
public class Day01Receive {
	public static void main(String[] args) throws IOException {
		DatagramSocket datagramSocket=new DatagramSocket(9999);   //����ָ���˿ڵ�socket
		//����һ�����հ�
 		DatagramPacket datagramPacket=new DatagramPacket(new byte[1024], 1024);
		datagramSocket.receive(datagramPacket);	//������Ϣ
		
		InetAddress address=datagramPacket.getAddress();//��ȡ���Ͷ�����
		System.out.println(address);
		byte[] arr=datagramPacket.getData(); //��ȡ������Ϣ����������
		int length=datagramPacket.getLength(); //��ȡ�������Ч����
		System.out.println(new String(arr,0,arr.length)); //�����Ϣ
	}
}
