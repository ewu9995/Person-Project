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

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubject() { 
		return subject;
	}
	
	private String getTitle() {
		return title;
	}
	
	public String toString() {
		return title +"."+ getFamilyName();
	}

}
