import java.awt.Color;
import java.util.Random;

public class Runner {

	//arrays used for the methods
	private static String[] firstName = {"First", "John", "Bob", "Jane", "Sophia", "Olivia", "Emma", "Nathan", "Muhammad", "Elizabeth", "Chloe", "Ava", "Madison", "Amelia", "Victoria", "Joe", "Steve", "Liam", "Noah", "Jake", "Logan", "David"};
	private static String[] familyName = {"Last", "Doe", "Levin", "Obama", "Asher", "Newman", "Jonhson", "Brown", "Williams", "Paul", "Smith", "Jones" , "Zhang" , "Wang" , "Chang", "Nguyen", "Garcia", "Gonzalez", "Hernandez", "Smith", "Smirnov", "Müller"};
	private static String[] subject = {"AP Computer Science", "Chemistry", "Biology", "Physics", "English", "AP Calculus", "AP Literature", "Precalculus", "Macroeconomics", "U.S. Government and Politics",  "Physical Education", "AP United States History", "Statistics", "Algebra", "Geometry", "Global Studies"};
	private static String[] title = {"Mr", "Mrs", "Ms", "Miss", "Dr", "Professor", "Mx"};
	private static Person[] students = new Person[35];
	private static Person teacher;
	
	
	public static void main(String[] args) {
		
		//needed to make the declarations work
		Random r = new Random();
		
		int IQ = (int)(Math.random()) * 200 + 1;
		
		Random r2 = new Random();
		int red = r2.nextInt(256);
		int green = r2.nextInt(256);
		int blue = r2.nextInt(256);
		Color eyeColor = new Color(red,green,blue);
		
	
		//declarations
		Teacher t = new Teacher(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor, IQ, 
				subject[r.nextInt(subject.length)], title[r.nextInt(title.length)]);
		Classroom c = new Classroom(students , teacher);
		
		
		System.out.println("Teacher:"); 
		System.out.println(t.toString());
		System.out.println("\n");
		System.out.println("Students:");
		
		for (int i = 0; i < 34; i++)  //loop that prints out the 34 students' names
		{
			students[i] = Runner.randomStudent();
			System.out.println(students[i].toString());
		}
		
	
		System.out.println("\n");
		System.out.println("Class Average:");
		System.out.println(c.classAverage());
		
		System.out.println("\n");
		System.out.println(randomStudent2());
	}
		

	
	//randomStudent() used for the loop
	public static Student randomStudent() {
		
		Random r = new Random();
		
		int ACT = (int)(Math.random())*36+1;//ACT 1-36
		int APClasses = (int)(Math.random()*11);//Max AP Classes 10?
		int IQ = (int)(Math.random()) * 200 + 1; //IQ from 1-200 (could be more but most people's IQ's are ~100
		
		Random r2 = new Random();//prints out color RGB whose values can be from 0-256
		int red = r2.nextInt(256);
		int green = r2.nextInt(256);
		int blue = r2.nextInt(256);
		Color eyeColor = new Color(red,green,blue); //(0-256,0-256,0-256)
		
		Random r3 = new Random();
		//highest gpa is 100 x 1.1 which is 110
		double GPA = (r3.nextInt(1210)) / 10;
		
		//used in the loop
		return new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		

		}
	
	//randomStudent() used as randomStudent() -- REAL randomStudent() 
	public static String randomStudent2() {
		
		Random r = new Random();
		
		int ACT = (int)(Math.random())*36+1;
		int APClasses = (int)(Math.random()*11);
		int IQ = (int)(Math.random()) * 200 + 1;
		
		Random r2 = new Random();
		int red = r2.nextInt(256);
		int green = r2.nextInt(256);
		int blue = r2.nextInt(256);
		Color eyeColor = new Color(red,green,blue);
		
		Random r3 = new Random();
		//highest gpa is 100 x 1.1 which is 110
		double GPA = (r3.nextInt(1210)) / 10;
		
		Student s = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		
		//returns first name, last name, GPA
		return "Random Student's Name: " + s.getFirstName() + " " + s.getFamilyName() + ";" +" Student's Weighted GPA: " + s.getGPA();
		}
	



	}

