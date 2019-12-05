package day26net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/*1.发送Send
	* 创建DatagramSocket, 随机端口号
	* 创建DatagramPacket, 指定数据, 长度, 地址, 端口
	* 使用DatagramSocket发送DatagramPacket
* 2.接收方获取ip和端口号
	* String ip = packet.getAddress().getHostAddress();
	* int port = packet.getPort();
*/
public class Day01send {
	public static void main(String[] args) throws IOException {
		String string="年轻人，may force be with you!"; //创建发送信息
		DatagramSocket dSocket=new DatagramSocket();  //创建Socket对象
		//创建一个packet的包，发送到127.0.0.1的9999端口
		DatagramPacket dpackPacket =new DatagramPacket(string.getBytes(),
				string.getBytes().length,InetAddress.getByName("127.0.0.1"),9999);
		dSocket.send(dpackPacket);
		System.out.println(new String());
	}
}
