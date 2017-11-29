public class Runner {

	private static String[] firstName = {"First", "John", "Jane", "Nathan", "Joe", "Steve", "Liam", "Noah", "Jake", "Logan", "David"};
	public static void main(String[] args) {
	
		new Teacher(null, null, null, 0, null, null);
		Person Student = new Student(null, null, null, 0, 0, 0, 0);
		Classroom Classroom = new Classroom(null, null, null, 0, null, Student);
		
		System.out.print (Classroom.printClass() + Classroom.classAverage());
		
		randomStudent();    

	}
	
	public static String randomStudent() {
		return firstName + Person.getFamilyName() + Student.getGPA() ;
	}
	
}
