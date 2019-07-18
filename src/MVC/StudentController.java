package MVC;

public class StudentController {
	Student model;
	StudentController(){
		
	}
	public void setStudentName() {
		model.setName("Genji");
	}
	public String getStudentName() {
		return model.name;
	}
	public void setStudentRollNo() {
		model.setRollNo("IdontKnow");
	}
	public String getStudentRollNo() {
		return model.rollNo;
	}

}
