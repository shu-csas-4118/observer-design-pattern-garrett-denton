package ObserverPatternDemo;

import java.util.ArrayList;

public class Student {
	private String firstName;
	private String lastName;
	private String email;
	private int idNumber;
	private ArrayList<String> courses;
	private ArrayList<IObserver> observers;
	
	public Student(String firstName, String lastName, int idNumber, String email, ArrayList<String> courses) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.email = email;
		this.courses = courses;
		this.observers = new ArrayList<IObserver>();
	}
	
	public Student() {
		this.observers = new ArrayList<IObserver>();
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		notifyFirstNameObserver();
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getIdNumber() {
		return this.idNumber;
	}
	
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
		notifyIdNumberObserver();
	}	
	
	public void setEmail(String email) {
		this.email = email;
		notifyEmailObserver();
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void addCourse(String course) {
		this.courses.add(course);
		notifyCoursesObserver();
	}
	
	public void removeCourse(String course) {
		this.courses.remove(course);
		notifyCoursesObserver();
	}
	
	public String getCourses() {
		return this.courses.toString();
	}
	
	public void attachObserver(IObserver observer) {
		this.observers.add(observer);
	} 
	
	public void notifyAllObservers() {
		for(IObserver observer: this.observers) {
			observer.update(this);
		}
	}
	
	public void notifyIdNumberObserver() {
		IObserver observer = observers.get(0);
		observer.update(this);
	}
	
	public void notifyFirstNameObserver() {
		IObserver observer = observers.get(1);
		observer.update(this);
	}
	
	public void notifyEmailObserver() {
		IObserver observer = observers.get(2);
		observer.update(this);
	}
	
	public void notifyCoursesObserver() {
		IObserver observer = observers.get(3);
		observer.update(this);
	}
	
}
