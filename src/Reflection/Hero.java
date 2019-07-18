package Reflection;

public class Hero {

	public int id;
	public String name;
	public int age;
	public static String copyright;
	
	static {
		System.out.println("初始化copyright");
		copyright = "版权由人民所属";
	}
	public void setName(String str) {
		this.name = str;
	}
	public void getName() {
		System.out.println(this.name);
	}

}
