import java.awt.Color;
import java.util.Random;

public class Teacher extends Person{
	
	private String subject;
	private String title;
	
	public Teacher(String firstName, String familyName, Color eyeColor, int IQ, String subject, String title) 
	{
		super(firstName, familyName, eyeColor, IQ);
		this.subject = subject;
		this.title = title;
	}

	String getSubject() { 
		return subject;
	}
	
	private String getTitle() {
		return title;
	}
	
	public String toString() {
		return title +"."+getFamilyName();
	}

}
