package day29Reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*问题:制作一个柞汁机
 	*1.多态实现
 	*2.反射实现 
 * */
public class Demo03Reflect {
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		//多态实现
		/*Juicer juicer1= new Juicer();
		juicer1.run(new Apple());
		juicer1.run(new Orange());*/
		
		//反射实现
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
		System.out.println("新鲜的苹果汁");
	}
}

class Orange implements Fruit{

	@Override
	public void squeeze() {
		System.out.println("新鲜的橙汁");
	}
}

class Juicer{
	//多肽，父类引用指向子类对象，并调用重写的方法
	public void run(Fruit a) {
		a.squeeze();
	}
}