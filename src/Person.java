import java.awt.Color;

public abstract class Person {
	
	private String firstName, familyName;
	private Color eyeColor;
	private int IQ; 
	
	public Person(String firstName, String familyName, Color eyeColor, int IQ)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.eyeColor = eyeColor;
		this.IQ = IQ;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public Color getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(Color eyeColor) {
		this.eyeColor = eyeColor;
	}

	public int getIQ() {
		return IQ;
	}

	public void setIQ(int iQ) {
		IQ = iQ;
	}
	
	public abstract String toString(); 
	
}
