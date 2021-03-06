//Evan Wu and M. Diallo Lab 2.2 Period 2 

public class Classroom {
	
	 Person[] students;
	 Person teacher;
	
	public Classroom(Person[] students, Person teacher) {
		this.students = students;
		this.teacher = teacher;
	}
	
	public String getSubject() {
		return ((Teacher) teacher).getSubject();//casted
	} 
	
	public double classAverage()//method from class
	{ 
		double total = 0.0;
		for(Person p : this.students)
		{
			if (p instanceof Student) {
				total += ((Student)p).getGPA();
			}
		}
		return total/students.length;
	}
	
	
	public String printClass() {
		//teacher + the subject they teach + # of students
		return ((Teacher) teacher).toString() + getSubject() + students.length;
		
	}
	
}
