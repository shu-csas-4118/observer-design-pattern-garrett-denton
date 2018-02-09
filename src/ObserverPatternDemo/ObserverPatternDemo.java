package ObserverPatternDemo;

import java.util.ArrayList;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		
		ArrayList<String> courses = new ArrayList<String>();
		
		courses.add("Software Engineering");
		
		Student student = new Student("Garett", "Chang", 123456, "changgar@shu.edu", courses);
		
		IdNumberObserver idObserver =  new IdNumberObserver();
		FirstNameObserver firstNameObserver = new FirstNameObserver();
		EmailObserver emailObserver = new EmailObserver();
		CoursesObserver coursesObserver = new CoursesObserver();
		
		student.attachObserver(idObserver);
		student.attachObserver(firstNameObserver);
		student.attachObserver(emailObserver);
		student.attachObserver(coursesObserver);
		
		student.notifyAllObservers();
		
		student.setFirstName("Garrett");
		student.setIdNumber(54321);
		student.setEmail("changgarr@shu.edu");
		student.addCourse("Formal Languages");
		student.addCourse("Data Visualization");
		student.addCourse("Cognition");
		student.removeCourse("Software Engineering");
		
	}

}
