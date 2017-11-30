public class Runner {

	private static String[] firstName = {"First", "John", "Jane", "Nathan", "Joe", "Steve", "Liam", "Noah", "Jake", "Logan", "David"};
	private static String[] familyName = {"Last", "Doe", "Levin", "Obama", "Asher", "Newman", "Brown", "Williams", "Paul", "Smith", "Jones"};
	private static String[] subject = {"AP Computer Science", "Chemistry", "AP Calculus", "Macro Economics", "Physical Education", "AP United States History", "Statistics", "Algebra", "Geometry", "Global Studies"};
	private static String[] title = {"Mr", "Mrs", "Ms", "Miss", "Dr", "Professor"};
	
	public static void main(String[] args) {
	
		Classroom Classroom = new Classroom(null, null);
		
		System.out.print (Classroom.printClass() + Classroom.classAverage());
		
		randomStudent();
	
	}
	
	public static String randomStudent() {
		Student s = new Student(null, null, null, 0, 0, 0, 0);
		
		return s.getFirstName() + s.getFamilyName() + s.getGPA();
		}

	}

