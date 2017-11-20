
public abstract class Person {
	
	private int height; //inches
	private String firstName, familyName;
	private double weight;
	
	public Person(int height, String firstName, String familyName, double weight)
	{
		this.height = height;
		this.firstName = firstName;
		this.familyName = familyName;
		this.weight = weight;
	}
}
