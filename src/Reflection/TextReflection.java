package Reflection;

public class TextReflection {

	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		String className = "Reflection.Hero";
		try {
			Class pClass = Class.forName(className);
			Class pClass2 = Hero.class;
			Class pClass3 = new Hero().getClass();
			
			System.out.println(pClass3);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
