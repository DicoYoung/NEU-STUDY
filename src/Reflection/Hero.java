package Reflection;

public class Hero {

	public int id;
	public String name;
	public int age;
	public static String copyright;
	
	static {
		System.out.println("��ʼ��copyright");
		copyright = "��Ȩ����������";
	}
	public void setName(String str) {
		this.name = str;
	}
	public void getName() {
		System.out.println(this.name);
	}

}
