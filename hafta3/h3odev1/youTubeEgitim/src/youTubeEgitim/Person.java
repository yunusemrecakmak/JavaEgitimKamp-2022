package youTubeEgitim;

public class Person extends Customer {

	private String nationalIdendity;
	private String firstName;
	private String lastName;

	public String getNationalIdendity() {
		return nationalIdendity;
	}

	public void setNationalIdendity(String nationalIdendity) {
		this.nationalIdendity = nationalIdendity;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
