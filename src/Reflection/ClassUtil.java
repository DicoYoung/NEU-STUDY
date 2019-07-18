package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtil {
	//打印类的信息包括成员函数、成员变量
	@SuppressWarnings("rawtypes")
	public static void printClassMethodMessage(Object obj) {
		Class c = obj.getClass();
		System.out.println("类的名称："+c.getName());
		Method[] ms = c.getMethods();
		for (int i = 0; i < ms.length; i++) {
			//得到方法返回值类型的类型
			Class returnType = ms[i].getReturnType();
			System.out.println("返回值类型："+returnType);
			//得到方法的名称
			System.out.println("方法的名称："+ms[i].getName());
			//得到参数列表的类类型
			Class[] paramType = ms[i].getParameterTypes();
			for (Class class1:paramType) {
				System.out.println(class1.getName()+",");
			}
		}	
	}
	//获取成员变量的信息
	@SuppressWarnings({ "unused", "rawtypes" })
	public static void printClassFieldMessage(Object obj) {
		Class c = obj.getClass();
		Field[] fs = c.getDeclaredFields();
		for (Field field : fs) {
			//得到成员变量的类型的类类型
			Class fieldType = field.getType();
			String typeName = fieldType.getName();
			//得到成员变量的名称
			String fieldName = field.getName();
			System.out.println("成员变量的名称："+fieldName);
		}
	}
	//获取构造函数信息
	@SuppressWarnings("rawtypes")
	public static void printClassConstructorMessage(Object obj) {
		Class c = obj.getClass();
		Constructor[] cs = c.getConstructors();
		for (Constructor constructor : cs) {
			System.out.println("构造方法名称："+constructor.getName());
			Class[] paramType = constructor.getParameterTypes();
			for(Class class1:paramType) {
				System.out.print(class1.getName()+" ");
			}
			
		}	
		
	}

}
