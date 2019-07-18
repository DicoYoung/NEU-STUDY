package Reflection;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Properties;

public class Text {

	public static void main(String[] args)  {
		//不使用反射 切换方法：
//		new Service1().doService1();
//		new Service2().doService2();
		
		//反射方法
		
		try {
			//从文件中获取类名称和方法名称
			File f = new File("D:/JAVAFolder/a.txt");
			Properties p = new Properties();
			p.load(new FileInputStream(f));
			String className = (String)p.get("class");
			String methodName = (String)p.get("method");
			//根据类名称获取类对象
			@SuppressWarnings("rawtypes")
			Class clazz = Class.forName(className);
			//根据方法名称获取方法对象
			@SuppressWarnings("unchecked")
			Method m = clazz.getMethod(methodName);
			//获取构造器
			@SuppressWarnings({ "unchecked", "rawtypes" })
			Constructor c = clazz.getConstructor();
			//根据构造器，实例化对象
			Object service = c.newInstance();
			//调用对象的指定方法
			m.invoke(service);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
