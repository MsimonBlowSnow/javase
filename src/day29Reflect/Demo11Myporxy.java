package day29Reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Demo11Myporxy implements InvocationHandler {
	private Object obj;

	public Demo11Myporxy(Object obj) {
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("���Ȩ��");
		method.invoke(obj);
		System.out.println("�ύ��־");
		return null;
	}
}
