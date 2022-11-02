package mockito;

public class Student {
	StudentService service; //cannot create interface obj
	Student(StudentService service){
		this.service=service;
	}
	public int getAverage() {
		return service.totalMarks()/service.totalStudents();
	}
}
