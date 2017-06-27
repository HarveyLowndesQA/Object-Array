import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		addPeople();
		
		for(Person person : Person.personsList) {
			System.out.println(person.getName() + " has an average of " + Exam.calculateTotal(person.getPersonalInfo().getExamList().get(0), person.getPersonalInfo().getExamList().get(1), person.getPersonalInfo().getExamList().get(2)));
		}
	}

	
	public static void addPeople() {
		
		
		/*
		 * Office Info
		 */
		Address ONSAddress = new Address(30);
		
		/*
		 * Module Info
		 */
		Module physics = new Module("Physics");
		Module chemestry = new Module("Chemestry");
		Module maths = new Module("Maths");
		
		/*
		 * Harvey
		 */
		Address harveyAddress = new Address(25);
		ContactDetails harveyContactDetails = new ContactDetails("blaa@blaa.com", "071112223333", harveyAddress);
		Office harveyOffice = new Office("JX  73 73 07 B", 23500.50d, 2, ONSAddress);
		PersonalInfo harveyInfo = new PersonalInfo(harveyContactDetails, harveyOffice);
		Person harvey = new Person("Harvey", harveyInfo);
		
		Exam physicsExam = new Exam(physics, new Date("12/12/2017"));
		Exam chemestryExam = new Exam(chemestry, new Date("13/12/2017"));
		Exam mathsExam = new Exam(maths, new Date("14/12/2017"));
		
		physicsExam.setResult(50);
		chemestryExam.setResult(70);
		mathsExam.setResult(65);
		
		harvey.getPersonalInfo().addToList(physicsExam);
		harvey.getPersonalInfo().addToList(chemestryExam);
		harvey.getPersonalInfo().addToList(mathsExam);
		
		/*
		 * Elinor
		 */
		Address elinorAddress = new Address(5);
		ContactDetails elinorContactDetails = new ContactDetails("blaa123@blaa.com", "07888899910", elinorAddress);
		Office elinorOffice = new Office("JY 12 19 12 I", 30500.50d, 2, ONSAddress);
		PersonalInfo elinorInfo = new PersonalInfo(elinorContactDetails, elinorOffice);
		Person elinor = new Person("Elinor", elinorInfo);
		
		physicsExam = new Exam(physics, new Date("12/12/2017"));
		chemestryExam = new Exam(chemestry, new Date("13/12/2017"));
		mathsExam = new Exam(maths, new Date("14/12/2017"));
		
		physicsExam.setResult(80);
		chemestryExam.setResult(55);
		mathsExam.setResult(95);
		
		elinor.getPersonalInfo().addToList(physicsExam);
		elinor.getPersonalInfo().addToList(chemestryExam);
		elinor.getPersonalInfo().addToList(mathsExam);
		
		
	}
	
}
