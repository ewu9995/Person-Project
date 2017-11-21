import java.awt.Color;

public class Teacher extends Person{
	
	private String subject;
	private String title;
	
	public Teacher(String firstName, String familyName, Color eyeColor, int IQ, String subject, String title) 
	{
		super(firstName, familyName, eyeColor, IQ);
		this.subject = subject;
		this.title = title;
	}

	private String getSubject() {
		return subject;
	}

	private void setSubject(String subject) {
		this.subject = subject;
	}

	private String getTitle() {
		return title;
	}

	private void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return getTitle()+"."+getFamilyName();
	}

}
