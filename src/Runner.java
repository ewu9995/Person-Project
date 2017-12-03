import java.awt.Color;
import java.util.Random;

public class Runner {

	private static String[] firstName = {"First", "John", "Jane", "Sophia", "Olivia", "Emma", "Nathan", "Joe", "Steve", "Liam", "Noah", "Jake", "Logan", "David"};
	private static String[] familyName = {"Last", "Doe", "Levin", "Obama", "Asher", "Newman", "Brown", "Williams", "Paul", "Smith", "Jones"};
	private static String[] subject = {"AP Computer Science", "Chemistry", "AP Calculus", "Macro Economics", "Physical Education", "AP United States History", "Statistics", "Algebra", "Geometry", "Global Studies"};
	private static String[] title = {"Mr", "Mrs", "Ms", "Miss", "Dr", "Professor", "Mx"};
	private static Person[] students;
	private static Person teacher;
	
	
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
		
		//variable is declared and initialized
		@SuppressWarnings("unused")
		Student s = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s1 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s2 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s3 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s4 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s5 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s6 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s7 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s8 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s9 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s10 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s11 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s12 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s13 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s14 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s15 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s16 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s17 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s18 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s19 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s20 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s21 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s22 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s23 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s24 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s25 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s26 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s27 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s28 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s29 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s30 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s31 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s32 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s33 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		Student s34 = new Student(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor , IQ , GPA, ACT, APClasses);
		
		
		
		
		Teacher t = new Teacher(firstName[r.nextInt(firstName.length)],familyName[r.nextInt(familyName.length)], eyeColor, IQ, title[r.nextInt(title.length)], 
				subject[r.nextInt(subject.length)]);
		Classroom c = new Classroom(students , teacher);
	
		
		System.out.println("Subject; Teacher:");
		System.out.println(t.toString());
		System.out.println("\n");
		System.out.println("Students in Class:");
		System.out.println(s1);System.out.println(s2);System.out.println(s3);System.out.println(s4);System.out.println(s5);System.out.println(s6);
		System.out.println(s7);System.out.println(s8);System.out.println(s9);System.out.println(s10);System.out.println(s11);System.out.println(s12);
		System.out.println(s13);System.out.println(s14);System.out.println(s15);System.out.println(s16);System.out.println(s17);System.out.println(s18);
		System.out.println(s19);System.out.println(s20);System.out.println(s21);System.out.println(s22);System.out.println(s23);System.out.println(s24);
		System.out.println(s25);System.out.println(s26);System.out.println(s27);System.out.println(s28);System.out.println(s29);System.out.println(s30);
		System.out.println(s31);System.out.println(s32);System.out.println(s33);System.out.println(s34);
		
		System.out.println("\n");
		
		System.out.println("Class Average:");
		System.out.println(c.classAverage());
		
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

