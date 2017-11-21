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
	private int getACT() {
		return ACT;
	}
	private void setACT(int ACT) {
		ACT = ACT;
	}
	private int getAPClasses() {
		return APClasses;
	}
	private void setAPClasses(int APClasses) {
		APClasses = APClasses;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double GPA) {
		GPA = GPA;
	}
	public String toString() {
		return getFamilyName() +"," + getFirstName();
		
	}
	
}
