package ObserverPatternDemo;

public class CoursesObserver implements IObserver {
	
	public CoursesObserver() {
		
	}
	
	public void update(Student student) {
		System.out.println("Student's courses are " + student.getCourses());
	}

}
