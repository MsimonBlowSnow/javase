package day29Reflect;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* A:������ʾ
* ArrayList<Integer>��һ��������������������һ���ַ������ݣ����ʵ���أ�*/
//����ֻ��ֵ��������Ч����ִ�����Զ�������
public class Demo08Array {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ArrayList<Integer> array01= new ArrayList<>();
		array01.add(1);	
		array01.add(2);	
		array01.add(3);	
		array01.add(4);	
		//array01.add("man");
		Class class1 =array01.getClass();
		Method method1=class1.getMethod("add",Object.class);
		method1.invoke(array01, "abc");
		System.out.println(array01);
	}
}
