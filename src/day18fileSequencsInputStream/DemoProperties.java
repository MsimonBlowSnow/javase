package day18fileSequencsInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.chrono.MinguoChronology;
import java.util.Enumeration;
import java.util.Properties;

/* A:Properties�ĸ���
* Properties ���ʾ��һ���־õ����Լ���
* Properties �ɱ��������л�����м��ء�
* �����б���ÿ���������Ӧֵ����һ���ַ����� 
* B:������ʾ
* Properties��ΪMap���ϵ�ʹ��
* properties ��hashtables�ĳ����� 
* hashtables �̰߳�ȫ
* 
*C:Properties�����⹦��
	* public Object setProperty(String key,String value)
	* public String getProperty(String key)
	* public Enumeration<String> stringPropertyNames()
*D:������ʾ
	* Properties�����⹦��
* E:Properties��load()��store()����
	*load(FileInputStream fis);���ļ������ȡ��ֵ�Բ�����properties��
	*store(FileOutStream fis)�޸�properties�еļ�ֵ�Բ��޸�
*/
public class DemoProperties {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		method();
		Properties pro = new Properties();
		pro.load(new FileInputStream("src/day18fileSequencsInputStream/config.properties"));
		System.out.println(pro);
		pro.setProperty("password", "123");//����д���ļ�
		//store()�����ĵڶ���������д���ļ�����Ľ�����Ϣ
		pro.store(new FileOutputStream("src/day18fileSequencsInputStream/config.properties"),"ming");
	}
	private static void method() {
		//����properteis��ʹ��put������Ӽ�ֵ��
		Properties pro = new Properties();
		pro.put("ming", "handsome");
		pro.put("chenqi","ugly");
		pro.put("zs", "12");
		pro.put("ls", "13");
		pro.setProperty("ls", "14");//�޸�properties
		System.out.println(pro);
		
		//����properteis Ԫ��
		//��ȡproperties����ļ�������object����ǿת
		Enumeration<String> enum1 =(Enumeration<String>) pro.propertyNames(); 
		while(enum1.hasMoreElements()) {
			String str =enum1.nextElement();
			System.out.println(str+"="+pro.getProperty(str));
		}
	}
}
