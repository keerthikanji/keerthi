package Task;
import java.util.Scanner;
public class Employee {
String name;
int salary;
int medicalInsurance;


public Employee() {
	super();
	// TODO Auto-generated constructor stub
}



public Employee(String name, int salary, int medicalInsurance) {
	super();
	this.name = name;
	this.salary = salary;
	this.medicalInsurance = medicalInsurance;
}



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public int setSalary(int salary) {
	return this.salary = salary;
}

public int getMedicalInsurance() {
	return medicalInsurance;
}

public void setMedicalInsurance(int medicalInsurance) {
	this.medicalInsurance = medicalInsurance;
}

public void login() {
	Scanner sc=new Scanner(System.in);
	Scanner scStr=new Scanner(System.in);
	System.out.println("enter user name");
	String name=scStr.nextLine();
	System.out.println("enter user salary");
	int salary=sc.nextInt();
}

}
