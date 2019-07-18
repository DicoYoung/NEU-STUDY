package MVC;

public class MVCPattenDemo {
	
	public static void main(String[] args) {
		StudentController sc = new StudentController();
		sc.model = retriveStudentFromDatabase();
	}
	public static Student retriveStudentFromDatabase() {
		Student model = null;
		return model;
	}

}
