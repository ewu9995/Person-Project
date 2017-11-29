import java.awt.Color;

public class Classroom {
	
	private Person[] students;
	private Person teacher;
	
	public Classroom(String firstName, String familyName, Color eyeColor, int IQ, Person[] students, Person teacher) {
		this.students = students;
		this.teacher = teacher;
	}
	
	public String getSubject() {
		return ((Teacher) teacher).getSubject();	 
	}
	
	public double classAverage() {
		double total = 0.0;
		for(Person p : this.students) {
			if (p instanceof Student) {
				total += Student.getGPA();
				}
			}
		return total/students.length;
		
	}
	
	public String printClass() {
		return teacher + getSubject() + students;
		
	}
	
}
