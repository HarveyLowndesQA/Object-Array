import java.util.Date;

public class Exam {
	
	private Module module;
	private Date date;
	private int result;
	
	public Exam(Module module, Date date) {
		this.setModule(module);
		this.setDate(date);
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public static int calculateTotal(Exam... ex) {
		int length = ex.length;
		int total = 0;
		for(int i = 0; i < length; i++) {
			total = total + ex[i].getResult();
		}
		return total / length;
	}
	
}
