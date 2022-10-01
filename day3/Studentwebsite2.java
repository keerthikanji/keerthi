package day3;
import java.util.Scanner;
public class Studentwebsite2 {
	private static final String changestudentlocation = null;
	Scanner sc = new Scanner(System.in);
	Scanner scStr = new Scanner(System.in);


	public static void main(String[] args) {

		Studentwebsite2 Student = new Studentwebsite2();

		while(true)
		{
			System.out.println("\n\n\n\n ===== WebSite links (actions what user can do) ==== ");
			System.out.println("1. add student. ");
			System.out.println("2. view all student ");
			System.out.println("3. view student by location and enrolled course ");
			System.out.println("4. display student location");
			System.out.println("5. exit");
			
			

			System.out.println(" Enter option [0-5] :- ");

			switch (new Scanner(System.in).nextInt()) {

			case 0:
				System.exit(0);
				break;

			case 1:
				Student.addstudent();
				break;

			case 2:
				Student.viewallstudent();
				break;

			case 3:
				 Student. displaystudentbylocationandenrolledcourse();
				break;

			case 4:
				Student.displaystudentlocation();
				break;

			



			
				//end switch

		}//end of while
	}//end of main

	}private void viewallstudent() {
		// TODO Auto-generated method stub
		
	}
	private void displaystudentlocation() {
		// TODO Auto-generated method stub
		
	}
	private void Displaystudentcourse() {
		// TODO Auto-generated method stub
		
	}
	private void studentphoneno() {
		// TODO Auto-generated method stub
		
	}
	private void studentName() {
		// TODO Auto-generated method stub
		
	}
	private void changestudentlocation() {
		// TODO Auto-generated method stub
		
	}
	private void displayallstudentdetails() {
		// TODO Auto-generated method stub
		
	}
	private void addstudent() {
		// TODO Auto-generated method stub
		System.out.println("Enter student name");
		String name=sc.next();
		
		
	}

	//end of main

	public void printStudentDetails(Student a)
	{
		System.out.print("\n"+a.getStudentrollno()+"\t");
		System.out.print(a.getStudentName()+"\t");
		System.out.print(a.getStudentlocation()+"\t");
		System.out.println("\n---------------------------------------------\n");

	}


	public void displayallstudentdetails1()
	{

		int noOfStudentEntry = 0;
		for(int i = 0;i< noOfStudentEntry ;i++)
		{
			Student[] allStudent = null;
			Student a = allStudent[i];
			printStudentDetails(a);
		}
	}

	public void addStudent ()
	{
		// take user input and set in the array 

		System.out.println("Enter student name");
		String name=sc.next();
		
		
		
		System.out.println(" Enter student location:- ");
		String location = sc.toString();

		Student[] allStudent = null;
		int noOfStudentEntry = 0;
		Object Studentrollno;
		Object Studentname;
		Object Studentlocatin;
		allStudent[noOfStudentEntry++] = new Student();


	}

	public void Displaystudentrollno()
	{
		// take user input as Student rollno ;
		System.out.println(" Enter Student roll Number ");
		int studentrollno = sc.nextInt(); // 1

		boolean StudentFound = false;

		int noOfStudentEntry = 0;
		for(int i = 0;i< noOfStudentEntry ;i++)
		{
			Student[] allStudent = null;
			Student a = allStudent[i];

			
			
				System.out.println("display student roll no");
				StudentFound = true;
				break;
			}

		

		if(StudentFound == false)
		{
			String Studentrollno=  null;
			System.out.println(studentrollno+" is Inavlid student roll number ");
		}
		System.out.println("display student rollno ");
		
		

	}

	public void displaystudentbylocationandenrolledcourse()
	{
		// take user input such as account id , payeeId & amount 
		System.out.println("\n ========  student by location and enrolled course \"); ==============\n");

		System.out.println(" Enter Student location ");
		String studentlocation = sc.next();

		System.out.println(" Enter Student course ");
		String Studentcourse = sc.next();

	

		Student location= null;
		boolean foundstudentlocatin = false;
		Student enrolledcourse = null;
		boolean foundstudentenrolledcourse = false;

		int noOfStudentEntry = 0;
		for(int i = 0;i< noOfStudentEntry ;i++)
		{
			
		}

		

			

		}



	

}//end class








