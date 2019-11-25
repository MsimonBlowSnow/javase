package day26net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;


/*1.接收Receive
 	* 创建DatagramSocket, 指定端口号
 	* 创建DatagramPacket, 指定数组, 长度
 	* 使用DatagramSocket接收DatagramPacket
 	* 关闭DatagramSocket
 	* 从DatagramPacket中获取数据
*2.接收方获取ip和端口号
	* String ip = packet.getAddress().getHostAddress();
	* int port = packet.getPort(); 
*/
public class Day01Receive {
	public static void main(String[] args) throws IOException {
		DatagramSocket datagramSocket=new DatagramSocket(9999);   //创建指定端口的socket
		//创建一个接收包
 		DatagramPacket datagramPacket=new DatagramPacket(new byte[1024], 1024);
		datagramSocket.receive(datagramPacket);	//接收消息
		
		InetAddress address=datagramPacket.getAddress();//获取发送端主机
		System.out.println(address);
		byte[] arr=datagramPacket.getData(); //获取接受信息并存入数组
		int length=datagramPacket.getLength(); //获取数组的有效长度
		System.out.println(new String(arr,0,arr.length)); //输出信息
	}
}
