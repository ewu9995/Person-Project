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

	private String getSubject() {
		Random r = new Random ();
		{	
			return subjects [r.nextInt(subjects.length)];
		}
	}
	
	private String [] subjects = {"AP Computer Science", "Chemistry", "AP Calculus", "Macro Economics", "Physical Education", "AP United States History", "Statistics", "Algebra", "Geometry", "Global Studies"};

	private void setSubject(String subject) {
		this.subject = subject;
	}

	private String getTitle() {
		Random r = new Random ();
		{	
			return titles [r.nextInt(titles.length)];
		}
	}
	
	private String [] titles = {"Mr", "Mrs", "Ms", "Miss", "Dr", "Professor"};

	private void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		// TODO Auto-generated method stub
		return title +"."+getFamilyName();
	}

}
