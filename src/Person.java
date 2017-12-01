import java.awt.Color;
import java.lang.Math;
import java.util.Random;


public abstract class Person {
	
	private String firstName;
	private String familyName;
	@SuppressWarnings("unused")
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
		Random r = new Random();
		int red = r.nextInt(256);
		int green = r.nextInt(256);
		int blue = r.nextInt(256);

		Color eyeColor = new Color(red,green,blue);
		return eyeColor;
	}

	public void setEyeColor(Color eyeColor) {
		this.eyeColor = eyeColor;
	}

	public int getIQ() {
		IQ = (int)(Math.random() * 200 + 1);
		return IQ;
	}

	public void setIQ(int IQ) {
		this.IQ = IQ;
	}
	
	public abstract String toString(); 
	
}
