package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
//		String s = "hello";
//		ClassUtil.printClassMethodMessage(s);
//		ClassUtil.printClassFieldMessage(s);
//		
//		ClassUtil.printClassFieldMessage(new Integer(1));
//		ClassUtil.printClassConstructorMessage(s);
		
		String str = "helloworld";
		Class clazz = str.getClass();
		try {
			Method m = clazz.getMethod("substring", int.class);
			Object o;
			try {
				o = m.invoke(str, 4);
				System.out.println(o);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
