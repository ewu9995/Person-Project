import java.awt.Color;

public class Classroom {
	
	private Person[] students;
	private Person teacher;
	
	public Classroom(String firstName, String familyName, Color eyeColor, int IQ, Person[] students, Person teacher) {
		this.students = students;
		this.teacher = teacher;
	}
	
	public String getSubject() {
		return null;	 
	}
	
	public double classAverage() {
		double average = 0.0;
		for(Person p : this.students) {
			if (p instanceof Student) {
				average = average + Student.getGPA();
				}
			}
		return average/students.length;
		
	}
	
	public String printClass() {
		return teacher + getSubject() + students;
		
	}
	
}
