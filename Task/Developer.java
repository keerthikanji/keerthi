package Task;

public class Developer extends Employee {
	Project Project;
	String clientname;
	
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Developer(String name, int salary, int medicalInsurance) {
		super(name, salary, medicalInsurance);
		// TODO Auto-generated constructor stub
	}
	public Developer(String name, int salary, int medicalInsurance, Task.Project project, String clientname) {
		super(name, salary, medicalInsurance);
		Project = project;
		this.clientname = clientname;
	}
	
	public Project getProject() {
		return Project;
	}
	public void setProject(Project project) {
		Project = project;
	}
	public String getClientname() {
		return clientname;
	}
	@Override
	public void setMedicalInsurance(int medicalInsurance) {
		// TODO Auto-generated method stub
		super.setMedicalInsurance(super.getSalary()+(getSalary()*10));
	}


	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public void workonProject() {
		System.out.println(Project);
		System.out.println(clientname);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(medicalInsurance);
	}
	@Override
	public String toString() {
		return "Developer [Project=" + Project + ", clientname=" + clientname + ", name=" + name + ", salary=" + salary
				+ "]";
	}
	
	

}
