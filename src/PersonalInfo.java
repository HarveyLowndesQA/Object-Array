import java.util.ArrayList;
import java.util.List;

public class PersonalInfo {

	private ContactDetails contactDetails;
	private List<Exam> examList = new ArrayList<Exam>();
	private Office office;
	
	public PersonalInfo(ContactDetails contactDetails, Office office) {
		this.setContactDetails(contactDetails);
		this.setOffice(office);
	}
	
	public void addToList(Exam exam) {
		examList.add(exam);
	}
	
	public List<Exam> getExamList() {
		return examList;
	}
	
	public Office getOffice() {
		return office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}
	
}
