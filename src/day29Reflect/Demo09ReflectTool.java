package day29Reflect;

import java.lang.reflect.Field;

public class Demo09ReflectTool {
	public static void setvalues(Object aobject,String fieldString,Object value) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class aClass =aobject.getClass();
		Field afiled=aClass.getDeclaredField(fieldString); //暴力反射
		afiled.setAccessible(true);		//去处权限
		afiled.set(aobject,value);		//设置值
	}
}
