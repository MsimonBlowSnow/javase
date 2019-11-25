package day29Reflect;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* ��֪һ���࣬�������£� 
 * 		public class DemoClass {
			public void run() {
				System.out.println("welcome to heima!");
			}
		}
 * (1) дһ��Properties��ʽ�������ļ�����������������ơ� 
 * (2) дһ�����򣬶�ȡ���Properties�����ļ����������������Ʋ���������࣬�÷���ķ�ʽ����run������
*/
public class Demo10test {
	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		BufferedReader aReader=new BufferedReader(new 
				FileReader("src/day29Reflect/config.properties1"));
		String aString=aReader.readLine();
		Class aClass=Class.forName(aString);
		Object aObject=aClass.newInstance();	//���ÿղι��촴������
		Method aMethod=aClass.getDeclaredMethod("say");	
		aMethod.invoke(aObject);
	}
}
