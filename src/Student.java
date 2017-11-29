import java.awt.Color;
import java.lang.Math;
import java.util.Random;

public class Student extends Person{
	private double GPA;
	private int ACT;
	private int APClasses;
	
	public Student(String firstName, String familyName, Color eyeColor, int IQ, double GPA, int ACT, int APClasses) {
		super(firstName, familyName, eyeColor, IQ);
		this.ACT = ACT;
		this.GPA = GPA;
		this.APClasses = APClasses;
	}
	private int getACT() { 
		// act 1-36
		ACT = (int)(Math.random())*36+1;
			return ACT;
	}

	private int getAPClasses() {
		//highest # of AP classes is 10
		APClasses = (int)(Math.random()*11);
		return APClasses;
	}

	
	public static double getGPA() {
		Random r = new Random();
		//highest gpa is 100 x 1.1 which is 110
		double GPA = (r.nextInt(1210)) / 10;
		return GPA;
	}

	public String toString() {
		return getFamilyName() +"," + getFirstName();
		
	}
	
}
