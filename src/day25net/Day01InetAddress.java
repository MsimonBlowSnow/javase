package day25net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 *  ��ʾ�������е�IP��ַ
 *    java.net.InetAddress
 *  ��̬����
 *    ���ر�������,����ֵInetAddress����
 *    static InetAddress  getLocalHost()   LocalHost��������
 *    static InetAddress getByName(String hostName)����������,��ȡIP��ַ����
 *    
 *  �Ǿ�̬����
 *     String getHoustAddress()��ȡ����IP��ַ
 *     String getHoustName()��ȡ������
 */
public class Day01InetAddress {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress iAddress=InetAddress.getLocalHost();
		//����������������,�� IP��ַ
		System.out.println(iAddress);
		InetAddress address1=InetAddress.getByName("www.baidu.com");
		//getHostName()���������
		System.out.println(address1.getHostName());
		System.out.println(iAddress.getHostName());
		System.out.println(iAddress.getHostAddress());
		//static InetAddress  getLocalHost()   LocalHost��������
		System.out.println(InetAddress.getLocalHost());
		//static InetAddress getByName(String hostName)����������,��ȡIP��ַ����
		System.out.println(InetAddress.getByName("www.baidu.com"));
	}
}
