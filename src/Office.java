
public class Office {

	private String NI;
	private double salary;
	private int grade;
	private Address address;
	
	public Office(String NI, double salary, int grade, Address address) {
		this.setNI(NI);
		this.setSalary(salary);
		this.setGrade(grade);
		this.setAddress(address);
	}

	public String getNI() {
		return NI;
	}

	public void setNI(String nI) {
		NI = nI;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
