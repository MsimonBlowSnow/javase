package day18fileSequencsInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*��ȡ�ļ����󣬼������л�
 * */
public class DemoObjectInputStream {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		//���������󣬲����㣬ӦΪ�㲻֪�����˶��ٸ������Ĵ����Ķ��˻ᱨ�쳣
		method1();
		//�Ż����洢һ�����϶��󣬼����������������󣬶Զ�����б���
		//method2YouHua();
	}
	private static void method2YouHua() throws IOException, FileNotFoundException, ClassNotFoundException {
		//�Ż����洢һ�����϶��󣬼����������������󣬶Զ�����б���
		ArrayList<Person> plist= new ArrayList<>();
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("e.txt"));
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("e.txt"));
		Person person= new Person(23,"����");
		Person person1= new Person(24,"����");
		Person person2= new Person(25,"����");
		Person person3= new Person(26,"����");
		plist.add(person);
		plist.add(person1);
		plist.add(person2);
		plist.add(person3);
		oos.writeObject(plist);
		plist=null;
		System.out.println("============�Ѽ���plistд���ļ�����plist��ֵΪnull===============");
		System.out.println(plist);
		plist=(ArrayList<Person>) ois.readObject();
		System.out.println("============�����ļ����󲢸�ֵ��plist=============");
		System.out.println(plist);
	}
//
	private static void method1() throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("e.txt"));  
		Person person=(Person)ois.readObject();//ȡ��object���󣬱���ǿת
		Person person1=(Person)ois.readObject();//ȡ��object���󣬱���ǿת
		//��������ļ���ĩβ�ر��쳣EOFException
		//Person person2=(Person)ois.readObject();//ȡ��object���󣬱���ǿת
		System.out.println(person);
		System.out.println(person);
	}
}
