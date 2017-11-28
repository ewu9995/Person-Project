import java.awt.Color;
import java.lang.Math;

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
		ACT = (int)(Math.random())*36+1;
			return ACT;
	}
	private void setACT(int ACT) {
		this.ACT = ACT;
	}
	private int getAPClasses() {
		APClasses = (int)(Math.random()*11);
		return APClasses;
	}
	private void setAPClasses(int APClasses) {
		this.APClasses = APClasses;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double GPA) {
		this.GPA = GPA;
	}
	public String toString() {
		return getFamilyName() +"," + getFirstName();
		
	}
	
}
