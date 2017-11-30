public class Classroom {
	
	 Person[] students;
	 Person teacher;
	
	public Classroom(Person[] students, Person teacher) {
		this.students = students;
		this.teacher = teacher;
	}
	
	public String getSubject() {
		return ((Teacher) teacher).getSubject();	 
	}
	
	public double classAverage()
	{
		double total = 0.0;
		for (Person p : this.students)
			if ( p instanceof Student)
			{
					total += ((Student)p).getGPA();
			}	
		return total / students.length;
	}
	
	public String printClass() {
		return ((Teacher) teacher).toString() + getSubject() + students.length;
		
	}
	
}
