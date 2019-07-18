package Reflection;

import java.lang.reflect.Field;

public class TextReflection3 {

	public static void main(String[] args)  {
		Hero h = new Hero();
		try {
			@SuppressWarnings("rawtypes")
			Class pClass = Class.forName("Reflection.Hero");
			Field f1 = pClass.getDeclaredField("name");
			f1.set(h, "aaaa");
			System.out.println(h.name);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
