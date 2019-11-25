package day25net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 *  表示互联网中的IP地址
 *    java.net.InetAddress
 *  静态方法
 *    返回本地主机,返回值InetAddress对象
 *    static InetAddress  getLocalHost()   LocalHost本地主机
 *    static InetAddress getByName(String hostName)传递主机名,获取IP地址对象
 *    
 *  非静态方法
 *     String getHoustAddress()获取主机IP地址
 *     String getHoustName()获取主机名
 */
public class Day01InetAddress {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress iAddress=InetAddress.getLocalHost();
		//输出结果就是主机名,和 IP地址
		System.out.println(iAddress);
		InetAddress address1=InetAddress.getByName("www.baidu.com");
		//getHostName()输出主机名
		System.out.println(address1.getHostName());
		System.out.println(iAddress.getHostName());
		System.out.println(iAddress.getHostAddress());
		//static InetAddress  getLocalHost()   LocalHost本地主机
		System.out.println(InetAddress.getLocalHost());
		//static InetAddress getByName(String hostName)传递主机名,获取IP地址对象
		System.out.println(InetAddress.getByName("www.baidu.com"));
	}
}
