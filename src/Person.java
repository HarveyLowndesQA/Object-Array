import java.util.ArrayList;
import java.util.List;

public class Person {

	public static List<Person> personsList = new ArrayList<Person>();
	
	private String name;
	private PersonalInfo personalInfo;
	
	public Person(String name, PersonalInfo personalInfo) {
		this.setName(name);
		this.setPersonalInfo(personalInfo);
		personsList.add(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}

}
