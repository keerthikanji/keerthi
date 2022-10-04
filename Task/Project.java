package Task;

public class Project extends Developer{
	String Projectname;
	int allocatedDays;
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Project(String projectname, int allocatedDays) {
		super();
		Projectname = projectname;
		this.allocatedDays = allocatedDays;
	}
	public String getProjectname() {
		return Projectname;
	}
	public void setProjectname(String projectname) {
		Projectname = projectname;
	}
	public int getAllocatedDays() {
		return allocatedDays;
	}
	public void setAllocatedDays(int allocatedDays) {
		this.allocatedDays = allocatedDays;
	}


	@Override
	public String toString() {
		return "Project [Projectname=" + Projectname + ", allocatedDays=" + allocatedDays + "]";
	}
	
	
}
