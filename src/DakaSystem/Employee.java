package DakaSystem;

public class Employee {
	public int ID;
	public String name;
	public String password;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public int getID() {
		return ID;
	}
	public String getName() {
		return name;
	}	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public String toString() {
		return " ID: "+ID+"; Name: "+name;
		
	}
}
