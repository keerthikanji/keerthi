package Task;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Accountant accountant=new Accountant("keerthi", 10000,"taxfile",50000);
		accountant.workonTaxfile();
		
		Project whatsapp=new  Project("whatsapp", 10);
		Developer developer=new Developer("meta", 15000,60000, whatsapp, "sangu");
		developer.workonProject();
		
		Manager manager=new Manager("vijju",20000,80000,"vaishu",20,2000);
		manager.setsalary(20000);
		int s=manager.getSalary();
		manager.workonGrowth();
		System.out.println(s);
	}

}
