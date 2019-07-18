package Files;

import java.io.Serializable;

public class CUstomer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CUstomer(String name,int age,String password) {
		// TODO Auto-generated constructor stub
		super();
		this.name = name;
		this.age = age;
		this.password = password;
	}
	public String name;
	public int age;
	transient String password;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
