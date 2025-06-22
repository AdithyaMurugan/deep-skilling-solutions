package MVCPattern;

public class StudentApp {
	 public static void main(String[] args) {
	       
	        Student student = new Student("Adithya", "CSE102", "A");
	        StudentView view = new StudentView();

	     
	        StudentController controller = new StudentController(student, view);

	       
	        controller.updateView();

	        System.out.println();

	        
	        controller.setStudentName("Adithya M");
	        controller.setStudentGrade("A+");

	     
	        controller.updateView();
	    }
}
