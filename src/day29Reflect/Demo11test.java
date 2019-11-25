package day29Reflect;

import java.lang.reflect.Proxy;

public class Demo11test {
	public static void main(String[] args) {
		Demo11Studentimp dsiDemo11Studentimp=new Demo11Studentimp();
		dsiDemo11Studentimp.login();
		dsiDemo11Studentimp.submit();
		
		System.out.println("---------------------------------------------");
		Demo11Myporxy dmp=new  Demo11Myporxy(dsiDemo11Studentimp);
		Demo11Student dsDemo11Student=(Demo11Student)Proxy.
				newProxyInstance(dsiDemo11Studentimp.getClass().getClassLoader(), 
					dsiDemo11Studentimp.getClass().getInterfaces(),dmp);
		dsDemo11Student.login();
		dsDemo11Student.submit();
	}
}
