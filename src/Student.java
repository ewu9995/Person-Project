import java.awt.Color;


public class Student extends Person{
	private double GPA;
	private int ACT;
	private int APclasses;
	public int getACT() {
		return ACT;
	}
	public void setACT(int ACT) {
		this.ACT = ACT;
	}
	public int getAPclasses() {
		return APclasses;
	}
	public setAPclasses(int aPclasses) {
		this.APclasses = aPclasses;
	}
	public Student(String firstName, String familyName, Color eyeColor, int IQ) {
		super(firstName, familyName, eyeColor, IQ, ACT, APclasses);
		// TODO Auto-generated constructor stub
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public String toString() {
		return null;
		
	}
	
}
