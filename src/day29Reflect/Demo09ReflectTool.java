package day29Reflect;

import java.lang.reflect.Field;

public class Demo09ReflectTool {
	public static void setvalues(Object aobject,String fieldString,Object value) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class aClass =aobject.getClass();
		Field afiled=aClass.getDeclaredField(fieldString); //��������
		afiled.setAccessible(true);		//ȥ��Ȩ��
		afiled.set(aobject,value);		//����ֵ
	}
}
