package day3;
import java.util.Scanner;
public class studentwebsite {
	private String name;  
    private int rollno; 
    private String course;  
    private String location;  
    Scanner sc = new Scanner(System.in);  
    //method to add student details
    public void addstudent() {  
        System.out.print("Enter name of student: ");  
        name= sc.next();  
        System.out.print("Enter rollno of student: ");  
        rollno = sc.nextInt();  
        System.out.print("Enter course of student: ");  
        course = sc.next();  
        System.out.print("Enter locatin of student: ");  
        location= sc.next();  
    }  
    //method to display student details  
    public void displaystudentdetails() {  
        System.out.println("Name of student: " + name);  
        System.out.println("rollno: " + rollno);  
        System.out.println("course: " + course);  
        System.out.println("location: " + location);  
    }

}
