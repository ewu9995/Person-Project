import java.awt.Color;
import java.util.Random;

public class Runner {

	private static String[] firstName = {"First", "John", "Jane", "Sophia", "Olivia", "Emma", "Nathan", "Joe", "Steve", "Liam", "Noah", "Jake", "Logan", "David"};
	private static String[] familyName = {"Last", "Doe", "Levin", "Obama", "Asher", "Newman", "Brown", "Williams", "Paul", "Smith", "Jones"};
	private static String[] subject = {"AP Computer Science", "Chemistry", "AP Calculus", "Macro Economics", "Physical Education", "AP United States History", "Statistics", "Algebra", "Geometry", "Global Studies"};
	private static String[] title = {"Mr", "Mrs", "Ms", "Miss", "Dr", "Professor", "Mx"};
	
	public static void main(String[] args) {
	
		
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
		
		//variable is declared and initalized
		Student s = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Teacher t = new Teacher(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor, IQ, title[r.nextInt(title.length)], 
				subject[r.nextInt(subject.length)]);
		
		System.out.println(s);
		System.out.println(t);
		System.out.println(randomStudent());
		
		
	}
	
	public static String randomStudent() {
		
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
		
		return "Random Student Name: " + s.getFirstName() + " " + s.getFamilyName() + " " +", GPA to the nearest whole number out of 110 Weighted: " + s.getGPA();
		}

	}

