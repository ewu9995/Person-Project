
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

	private int getHeight() {
		return height;
	}

	private void setHeight(int height) {
		this.height = height;
	}

	private String getFirstName() {
		return firstName;
	}

	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private String getFamilyName() {
		return familyName;
	}

	private void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	private double getWeight() {
		return weight;
	}

	private void setWeight(double weight) {
		this.weight = weight;
	}
}
