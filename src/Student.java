import java.awt.Color;

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
	
	//getters and setters for the methods
	public void setGPA(double GPA) {
		this.GPA = GPA;
	}
	public void setACT(int ACT) {
		this.ACT = ACT;
	}
	public void setAPClasses(int APClasses) {
		this.APClasses = APClasses;
	}
	public int getACT() { 
			return ACT;
	}

	public int getAPClasses() {
		return APClasses;
	}

	
	public double getGPA() {
		return GPA;
	}
	
	@Override
	public String toString() {
		return getFamilyName() +"," + " " + getFirstName(); //familyName, firstName ex: Doe, John
		
	}
	
}
