package Task;

public class Manager extends Employee {
String product;
int noofsales;
int incentive;



public Manager(String name, int salary, int medicalInsurance, String product, int noofsales, int incentive) {
	super(name, salary, medicalInsurance);
	this.product = product;
	this.noofsales = noofsales;
	this.incentive = incentive;
}


public Manager() {
	super();
	// TODO Auto-generated constructor stub
}





public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public int getNoofsales() {
	return noofsales;
}
public void setNoofsales(int noofsales) {
	this.noofsales = noofsales;
}
public int getIncentive() {
	return incentive;
}
public void setIncentive(int incentive) {
	this.incentive = incentive;
}
public void workonGrowth() {
	System.out.println(product);
	System.out.println(noofsales);
	System.out.println(incentive);
}


@Override
public String toString() {
	return "Manager [product=" + product + ", noofsales=" + noofsales + ", incentive=" + incentive + "]";
}

@Override
public int setSalary(int salary) {
	// TODO Auto-generated method stub
	return super.setSalary(super.getSalary()+incentive);
}



@Override
public void setMedicalInsurance(int medicalInsurance) {
	// TODO Auto-generated method stub
	super.setMedicalInsurance(super.getSalary()+(getSalary()*10));
}


public void setsalary(int incentive) {
	// TODO Auto-generated method stub
	super.setSalary(super.getSalary()+incentive);
}


}
