package ui;

import java.util.Random;
import java.util.Scanner;

import entity1.Account;
import entity1.KYCVerification;
import entity1.contactdetails;

public class MainClass {
	Account allAccounts[] = new Account[1515151];
	int noofAccounts = 0;

	Scanner sc = new Scanner(System.in);
	Scanner scStr = new Scanner(System.in);

	public static void main(String[] args) {

		MainClass app = new MainClass();

		while (true) {
			System.out.println(" -- website links ---");
			System.out.println("0.exit");
			System.out.println("1.submit user details");
			System.out.println("2.do deposit operation");
			System.out.println("3.do withdraw operation");
			System.out.println("4.view user all details");
			System.out.println("5.view user contact deatils");
			System.out.println("6.viewuser KYCVerification details");
			System.out.println("7.print balance");
			System.out.println("8.change phone number");
			System.out.println("9.change email id");
			System.out.println("Enter ur choice :- ");

			switch (app.sc.nextInt()) {

			case 1:
				app.addAccount();
				break;

			case 2:
				app.printUserAllDetails();
				break;

			case 3:
				app.doWithdrawOperation();
				break;

			case 4:
				app.viewUserAllDetails();
				break;
			case 5:
				app.viewUserContactDeatils();
				break;
			case 6:
				app.viewUserKYCVerificationDetails();
				break;
			case 7:
				app.printBalance();
				break;
			case 8:
				app.changePhoneNumber();
				break;
			case 9:
				app.changeEmailId();
				break;

			default:
				System.out.println("Exit ");
				System.exit(0);
			}// end of switch

		} // end of while

	}// end of main

	private void viewUserAllDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Account Number");
		long searchAccountNumber = sc.nextInt();
		System.out.println("Enter the user name");
		String serachUserName = sc.nextLine();
		// Account a= printAll(searchAccountNumber);
	}

	private void viewUserContactDeatils() {
		// TODO Auto-generated method stub
		System.out.println("Enter the phone Number");
		long phoneNumber = sc.nextInt();
	}

	private void viewUserKYCVerificationDetails() {
		// TODO Auto-generated method stub
		
	}

	private void printBalance() {
		// TODO Auto-generated method stub
		System.out.println("print the balance");
		int balance = sc.nextInt();

	}

	private void changePhoneNumber() {
		// TODO Auto-generated method stub
		System.out.println("change phone number");
		long changePhoneNumber = sc.nextInt();
	}

	private void changeEmailId() {
		// TODO Auto-generated method stub
		System.out.println("change email id");
		Varchar changeEmailId = (Varchar) sc.nextLine();
	}

	private void printUserAllDetails() {
		// TODO Auto-generated method stub
		for (int i = 0; i < noofAccounts; i++) {
			Account a = allAccounts[i];
			printAccountDetails(a);
		}
	}

	private void doWithdrawOperation() {
		  
  
	}

	private void doDepositOperation() {
		// TODO Auto-generated method stub

	}

	private void submitUserDetails() {
		// TODO Auto-generated method stub

	}



	public void addAccount() {

		Random myRandom = new Random();
		int carId = myRandom.nextInt();

		System.out.println("Enter User Name ");
		String username = scStr.nextLine();

		// String carColor = getRandomColor();

		System.out.println("Enter Password ");
		String password = scStr.nextLine();

		System.out.println("Enter Insial Account Balance ");

		int balance = sc.nextInt();

		System.out.println("Enter Insial Account Number ");

		int accountNumber = sc.nextInt();

		System.out.println("Enter Accountnumber ");
		String engineType = scStr.nextLine(); //

		System.out.println("Enter city ");
		String city = scStr.nextLine();

		System.out.println("Enter State ");
		String state = scStr.nextLine();

		System.out.println("Enter Country ");
		String country = scStr.nextLine();

		System.out.println("Enter Phone Number ");
		long mobileno = scStr.nextInt();

		System.out.println("Enter Pincode ");
		long pincode = scStr.nextInt();

		System.out.println("Enter MailID ");
		Varchar mailid = (Varchar) scStr.nextLine();

		int cashback = 0;
		// private String localityName1;

		contactdetails c = new contactdetails();
		Account e = new Account(username, password, balance, cashback, accountNumber);

		e.setE(c);

		allAccounts[noofAccounts++] = e;
		System.out.println(" " + c);
		System.out.println(" Added in the List ");

	}

	public void viewAccountDetails() {
		System.out.println("Enter Searched AccountNumber  ");
		int searchAccountNumber = sc.nextInt();

		// Accounta = getAccountById(searchAccountNumber);

		// System.out.println(a);
	}


	public void printAccountDetails(Account a) {
		System.out.print("\n" + a.getAccountNumber() + "\t");
		System.out.print(a.getUserName() + "\t");
		System.out.print(a.getBalance() + "\t");
		System.out.print(a.getPassword() + "\t");
		System.out.print(a.getCashback() + "\t");
		System.out.println("\n---------------------------------------------\n");

	}
   public void printContactDetails(contactdetails c) {
	   System.out.print("\n" + c.getLocalityName1() + "\t");
		System.out.print(c.getCityName1() + "\t");
		System.out.print(c.getStateName1() + "\t");
		System.out.print(c.getPhoneNumber1() + "\t");
		System.out.print(c.getPincode1()+ "\t");
		System.out.print(c.getEmailId1() + "\t");
		System.out.print(c.getHouseNumber1() + "\t");
		System.out.println("\n---------------------------------------------\n");
       }
   public void deposite() {

		 
		System.out.println("\n ========  Deposit Use Case ==============\n");
		
	
		System.out.println(" Enter Deposit Amount ");
		int Amount = sc.nextInt();
		
		System.out.println(" Enter Account number to Deposit :-  ");
		int searchAccountNumber  = sc.nextInt();
		
			
		for(int i = 0;i< noofAccounts ;i++)
		{
			Account a = allAccounts[i];
			boolean isFound = (a.getAccountNumber()== searchAccountNumber)?true:false;
			
			if(isFound)
			{
				a.setBalance(a.getBalance() + Amount);
				System.out.println("Amount Transfer Done");
				System.out.println(a.getAccountNumber()+"-"+a.getBalance());
			}
		}					
   }
		
		
		public void withdraw() {
			
			System.out.println("\n ========  withdraw Use Case ==============\n");
			
			
			System.out.println(" Enter withdraw Amount ");
			int Amount = sc.nextInt();
			
			System.out.println(" Enter Account number to Deposit :-  ");
			int searchAccountNumber = sc.nextInt();
			
						
			for(int i = 0;i< noofAccounts ;i++)
			{
				Account a = allAccounts[i];
				boolean isFound = (a.getAccountNumber() == searchAccountNumber)?true:false;
				
				if(isFound)
				{
				a.setBalance(a.getBalance() - Amount);
				System.out.println("Amount Transfer Done");
				System.out.println(a.getAccountNumber()+"+"+a.getBalance());
									
			     }
		     }
			
		 } 
     }
	
}
