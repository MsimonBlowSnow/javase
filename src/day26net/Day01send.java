package day26net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*1.����Send
	* ����DatagramSocket, ����˿ں�
	* ����DatagramPacket, ָ������, ����, ��ַ, �˿�
	* ʹ��DatagramSocket����DatagramPacket
* 2.���շ���ȡip�Ͷ˿ں�
	* String ip = packet.getAddress().getHostAddress();
	* int port = packet.getPort();
*/
public class Day01send {
	public static void main(String[] args) throws IOException {
		String string="�����ˣ�may force be with you!"; //����������Ϣ
		DatagramSocket dSocket=new DatagramSocket();  //����Socket����
		//����һ��packet�İ������͵�127.0.0.1��9999�˿�
		DatagramPacket dpackPacket =new DatagramPacket(string.getBytes(),
				string.getBytes().length,InetAddress.getByName("127.0.0.1"),9999);
		dSocket.send(dpackPacket);
		System.out.println(new String());
	}
}
