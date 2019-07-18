package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TextReflection2 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Hero h = new Hero();
		h.name = "Hanzong";
		System.out.println(h.name);
		
		try {
			Class pClass = Class.forName("Reflection.Hero");
			Constructor c = pClass.getConstructor();
			Hero h1 = (Hero)c.newInstance();
			h1.name = "bad";
			System.out.println(h1.name);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
