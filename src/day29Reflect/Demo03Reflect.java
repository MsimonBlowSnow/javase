package day29Reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*����:����һ����֭��
 	*1.��̬ʵ��
 	*2.����ʵ�� 
 * */
public class Demo03Reflect {
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		//��̬ʵ��
		/*Juicer juicer1= new Juicer();
		juicer1.run(new Apple());
		juicer1.run(new Orange());*/
		
		//����ʵ��
		BufferedReader bReader= new 
				BufferedReader(new FileReader("src/day29Reflect/config.properties"));
		String str=bReader.readLine();
		Class class1=Class.forName(str);
		Juicer juicer2=new Juicer();
		juicer2.run((Fruit)class1.newInstance());
	}
}

interface Fruit{
	public void squeeze(); 
}

class Apple implements  Fruit{
	public void squeeze() {
		System.out.println("���ʵ�ƻ��֭");
	}
}

class Orange implements Fruit{

	@Override
	public void squeeze() {
		System.out.println("���ʵĳ�֭");
	}
}

class Juicer{
	//���ģ���������ָ��������󣬲�������д�ķ���
	public void run(Fruit a) {
		a.squeeze();
	}
}