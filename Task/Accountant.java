package Task;

public class Accountant extends Employee {
	String filename;
	

	public Accountant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	

	



	







	public Accountant(String name, int salary, String filename,int medicalInsurance) {
		super(name, salary,medicalInsurance);
		this.filename = filename;
	}

















	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
	public void workonTaxfile(){
		System.out.println(name);
		System.out.println(salary);
		System.out.println(filename);
		System.out.println(medicalInsurance);
	}


	@Override
	public String toString() {
		return "Accountant [filename=" + filename + "]";
	}
	
	

}
