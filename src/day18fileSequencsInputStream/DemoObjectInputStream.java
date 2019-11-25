package day18fileSequencsInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*读取文件对象，即反序列化
 * */
public class DemoObjectInputStream {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		//存入多个对象，不方便，应为你不知道存了多少个，读的次数的多了会报异常
		method1();
		//优化，存储一个集合对象，集合里面包含多个对象，对对象进行遍历
		//method2YouHua();
	}
	private static void method2YouHua() throws IOException, FileNotFoundException, ClassNotFoundException {
		//优化，存储一个集合对象，集合里面包含多个对象，对对象进行遍历
		ArrayList<Person> plist= new ArrayList<>();
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("e.txt"));
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("e.txt"));
		Person person= new Person(23,"张三");
		Person person1= new Person(24,"李四");
		Person person2= new Person(25,"王五");
		Person person3= new Person(26,"赵六");
		plist.add(person);
		plist.add(person1);
		plist.add(person2);
		plist.add(person3);
		oos.writeObject(plist);
		plist=null;
		System.out.println("============把集合plist写入文件并把plist赋值为null===============");
		System.out.println(plist);
		plist=(ArrayList<Person>) ois.readObject();
		System.out.println("============读出文件对象并赋值给plist=============");
		System.out.println(plist);
	}
//
	private static void method1() throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("e.txt"));  
		Person person=(Person)ois.readObject();//取出object对象，必须强转
		Person person1=(Person)ois.readObject();//取出object对象，必须强转
		//如果读到文件的末尾回报异常EOFException
		//Person person2=(Person)ois.readObject();//取出object对象，必须强转
		System.out.println(person);
		System.out.println(person);
	}
}
