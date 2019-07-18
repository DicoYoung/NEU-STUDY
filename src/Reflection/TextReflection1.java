package Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TextReflection1 {

	public static void main(String[] args) {
		Hero h = new Hero();
		try {
			Method m = h.getClass().getMethod("setName", String.class);
			try {
				m.invoke(h, "Genji");
				System.out.println(h.name);
			} catch (IllegalAccessException e) {
				
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			
			e.printStackTrace();
		} catch (SecurityException e) {
			
			e.printStackTrace();
		}
	}
}
