package day18fileSequencsInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* 1.ʲô�Ƕ��������
* �������Խ�һ������д��, ���߶�ȡһ�����󵽳�����. Ҳ����ִ�������л��ͷ����л��Ĳ���.
*1.1ʲô�����л��ͷ����л�,�Ѷ���д���ļ���������л�����ȡ�ļ�����Ķ���з����л�
* 2.ʹ�÷�ʽ
* д��: new ObjectOutputStream(OutputStream), writeObject()

		public class Demo3_ObjectOutputStream {

		}
*/
public class DemoObjectOutputStream {
	public static void main(String[] args) throws IOException {
			Person p1 = new Person(23,"����");
			Person p2 = new Person(24,"����");
	//		FileOutputStream fos = new FileOutputStream("e.txt");
	//		fos.write(p1);
	//		FileWriter fw = new FileWriter("e.txt");
	//		fw.write(p1);
			//�������ֽ������,�����ַ������������ֱ��д������
			//���л��������ʵ�����л��ӿ�
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e.txt"));//�������������
			oos.writeObject(p1);//���ȥobject����
			oos.writeObject(p2);
			//���л��󣬿��ļ��ǿ������ģ�ӦΪ����������ת��,Ҳ����Ҫ����,ֻҪ�ܷ����л�����
			oos.close();
	}	
}
