package day26net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress address=InetAddress.getByName("10.23.114.121");
			System.out.println(address.getHostAddress());
	}
}
