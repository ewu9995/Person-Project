public class Runner {

	private String[] firstName = {"First", "John", "Jane", "Nathan", "Joe", "Steve", "Liam", "Noah", "Jake", "Logan", "David"};
	private String[] familyName = {"Last", "Doe", "Levin", "Obama", "Asher", "Newman", "Brown", "Williams", "Paul", "Smith", "Jones"};
	private String[] subject = {"AP Computer Science", "Chemistry", "AP Calculus", "Macro Economics", "Physical Education", "AP United States History", "Statistics", "Algebra", "Geometry", "Global Studies"};
	private String[] title = {"Mr", "Mrs", "Ms", "Miss", "Dr", "Professor"};
	
	public static void main(String[] args) {
	
		new Teacher(null, null, null, 0, null, null);
		Person Student = new Student(null, null, null, 0, 0, 0, 0);
		Classroom Classroom = new Classroom(null, null, null, 0, null, Student);
		
		System.out.print (Classroom.printClass() + Classroom.classAverage());
		
		randomStudent();
	
	}
	
	public static String randomStudent() {
		Student s = new Student(null, null, null, 0, 0, 0, 0);
		
		return s.getFirstName() ;
		}

	}

