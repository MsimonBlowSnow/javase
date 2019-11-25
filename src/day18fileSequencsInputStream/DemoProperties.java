package day18fileSequencsInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.chrono.MinguoChronology;
import java.util.Enumeration;
import java.util.Properties;

/* A:Properties的概述
* Properties 类表示了一个持久的属性集。
* Properties 可保存在流中或从流中加载。
* 属性列表中每个键及其对应值都是一个字符串。 
* B:案例演示
* Properties作为Map集合的使用
* properties 是hashtables的超子类 
* hashtables 线程安全
* 
*C:Properties的特殊功能
	* public Object setProperty(String key,String value)
	* public String getProperty(String key)
	* public Enumeration<String> stringPropertyNames()
*D:案例演示
	* Properties的特殊功能
* E:Properties的load()和store()功能
	*load(FileInputStream fis);从文件里面读取键值对并放入properties中
	*store(FileOutStream fis)修改properties中的键值对并修改
*/
public class DemoProperties {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		method();
		Properties pro = new Properties();
		pro.load(new FileInputStream("src/day18fileSequencsInputStream/config.properties"));
		System.out.println(pro);
		pro.setProperty("password", "123");//不能写到文件
		//store()方法的第二个参数，写入文件里面的解释信息
		pro.store(new FileOutputStream("src/day18fileSequencsInputStream/config.properties"),"ming");
	}
	private static void method() {
		//建立properteis并使用put方法添加键值对
		Properties pro = new Properties();
		pro.put("ming", "handsome");
		pro.put("chenqi","ugly");
		pro.put("zs", "12");
		pro.put("ls", "13");
		pro.setProperty("ls", "14");//修改properties
		System.out.println(pro);
		
		//遍历properteis 元素
		//获取properties里面的键，并把object对像强转
		Enumeration<String> enum1 =(Enumeration<String>) pro.propertyNames(); 
		while(enum1.hasMoreElements()) {
			String str =enum1.nextElement();
			System.out.println(str+"="+pro.getProperty(str));
		}
	}
}
