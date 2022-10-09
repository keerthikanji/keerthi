package p1;
import java.util.Scanner;
public class GameLogic {
String easyquestions[] = new String[5];
String easyoptions[][] = new String[5][4];
int easyanswer[] = {2,1,4,3,4};

String difficultquestions[]=new String[5];
String difficultoptions[][] = new String[5][4];
int difficultanswer[] = {1,2,1,3,4};

String verydifficultquestions[]=new String[5];
String verydifficultoptions[][] = new String[5][4];
int verydifficultanswer[] = {2,2,4,3,4};



	int amount[] = {1000,2000,3000,4000,5000};

	int winningAmount = 0;

	// set the data 
	public GameLogic() {

		setQuestion();
		setOptions();
	}

	public GameLogic(String[] questions, String[][] options, int[] answer, int[] amount, int winningAmount) {
		super();
		this.easyquestions = questions;
		this.easyoptions = options;
		this.easyanswer = answer;
		this.amount = amount;
		this.winningAmount = winningAmount;
		
		this.difficultquestions = questions;
		this.difficultoptions = options;
		this.difficultanswer = answer;
		this.amount = amount;
		this.winningAmount = winningAmount;
		
		this.verydifficultquestions = questions;
		this.verydifficultoptions = options;
		this.verydifficultanswer = answer;
		this.amount = amount;
		this.winningAmount = winningAmount;
	}

	public void setQuestion()
	{
		easyquestions[0] = "1+1";
		easyquestions[1] = "2+1";
		easyquestions[2] = "3+1";
		easyquestions[3] = "4+1";
		easyquestions[4] = "5+1";
		
		difficultquestions[0]="Grand Central Terminal, Park Avenue, New York is the world's";
		difficultquestions[1]="Hitler party which came into power in 1933 is known as";
		difficultquestions[2]="In which year of First World War Germany declared war on Russia and France?";
		difficultquestions[3]="India has largest deposits of ____ in the world.";
		difficultquestions[4]="How many Lok Sabha seats belong to Rajasthan?";
		
		verydifficultquestions[0]="(112 x 54) = ?";
		verydifficultquestions[1]="What least number must be added to 1056, so that the sum is completely divisible by 23 ?";
		verydifficultquestions[2]="If a - b = 3 and a2 + b2 = 29, find the value of ab.";
		verydifficultquestions[3]="If log 27 = 1.431, then the value of log 9 is:";
		verydifficultquestions[4]="A boat can travel with a speed of 13 km/hr in still water. If the speed of the stream is 4 km/hr, find the time taken by the boat to go 68 km downstream.";
		
		
		
		
		
		
		
		
		
		
	}

	public void setOptions()
	{
		easyoptions[0][0] = "1";
		easyoptions[0][1] = "2";
		easyoptions[0][2] = "3";
		easyoptions[0][3] = "4";

		easyoptions[1][0] = "3";
		easyoptions[1][1] = "4";
		easyoptions[1][2] = "5";
		easyoptions[1][3] = "8";

		easyoptions[2][0] = "1";
		easyoptions[2][1] = "2";
		easyoptions[2][2] = "3";
		easyoptions[2][3] = "4";

		easyoptions[3][0] = "1";
		easyoptions[3][1] = "2";
		easyoptions[3][2] = "5";
		easyoptions[3][3] = "4";

		easyoptions[4][0] = "1";
		easyoptions[4][1] = "2";
		easyoptions[4][2] = "3";
		easyoptions[4][3] = "6";

		difficultoptions[0][0] = "largest railway station";
		difficultoptions[0][1] =" highest railway station";
		difficultoptions[0][2] = "longest railway station";
		difficultoptions[0][3] = "None of the above";

		difficultoptions[1][0] = "Labour Party";
		difficultoptions[1][1] = "Nazi Party";
		difficultoptions[1][2] = "Ku-Klux-Klan";
		difficultoptions[1][3] = "Democratic Party";

		difficultoptions[2][0] = "1914";
		difficultoptions[2][1] = "1915";
		difficultoptions[2][2] = "1916";
		difficultoptions[2][3] = "1917";

		difficultoptions[3][0] = "gold";
		difficultoptions[3][1] = "copper";
		difficultoptions[3][2] = "mica";
		difficultoptions[3][3] = "None of the above";

		difficultoptions[4][0] = "23";
		difficultoptions[4][1] = "22";
		difficultoptions[4][2] = "30";
		difficultoptions[4][3] = "25";

		verydifficultoptions[0][0] = "67000";
		verydifficultoptions[0][1] = "70000";
		verydifficultoptions[0][2] = "76500";
		verydifficultoptions[0][3] = "77200";

		verydifficultoptions[1][0] = "11";
		verydifficultoptions[1][1] = "2";
		verydifficultoptions[1][2] = "42";
		verydifficultoptions[1][3] = "25";

		verydifficultoptions[2][0] = "12";
		verydifficultoptions[2][1] = "2";
		verydifficultoptions[2][2] = "15";
		verydifficultoptions[2][3] = "10";
		
		verydifficultoptions[3][0] = "1.25";
		verydifficultoptions[3][1] = "2.23";
		verydifficultoptions[3][2] = "0.54";
		verydifficultoptions[3][3] = "0.32";

		verydifficultoptions[4][0] = "1";
		verydifficultoptions[4][1] = "2";
		verydifficultoptions[4][2] = "4";
		verydifficultoptions[4][3] = "5";
	}

	public void playGame()
	{
		for(int q=0;q<easyquestions.length;q++)
		{
			System.out.println((q+1)+" "+easyquestions[q]);

			int opNo = 1;
			for(String op:easyoptions[q])
			{
				if(opNo == 3) System.out.println("\n");
				System.out.print(opNo+"]  "+op+"\t");
				opNo++;

			}
			
			
										
				

			System.out.println("\n Enter User Answer :- ");
			int userAnswer = new Scanner(System.in).nextInt();

			if(userAnswer == easyanswer[q])
			{
				System.out.println(" Correct Answer : ");
				System.out.println(" U Won "+amount[q]);
				 winningAmount += amount[q];
				System.out.println(" Total amount "+(winningAmount));
			}
			else
			{
				System.out.println(" U Loose the Game ");
				System.out.println(" Total amount "+winningAmount);
				break;
			}

			System.out.println("____________________________________________________");
		}//end of for


	}//end of playGames

	
	public void playGame2()
	{
		for(int q=0;q<difficultquestions.length;q++)
		{
			System.out.println((q+1)+" "+difficultquestions[q]);

			int opNo = 1;
			for(String op:difficultoptions[q])
			{
				if(opNo == 3) System.out.println("\n");
				System.out.print(opNo+"]  "+op+"\t");
				opNo++;

			}
			
			
										
				

			System.out.println("\n Enter User Answer :- ");
			int userAnswer = new Scanner(System.in).nextInt();

			if(userAnswer == difficultanswer[q])
			{
				System.out.println(" Correct Answer : ");
				System.out.println(" U Won "+amount[q]);
				 winningAmount += amount[q];
				System.out.println(" Total amount "+(winningAmount));
			}
			else
			{
				System.out.println(" U Loose the Game ");
				System.out.println(" Total amount "+winningAmount);
				break;
			}

			System.out.println("____________________________________________________");
		}//end of for


	}//end of playGames
	
	public void playGame3()
	{
		for(int q=0;q<verydifficultquestions.length;q++)
		{
			System.out.println((q+1)+" "+verydifficultquestions[q]);

			int opNo = 1;
			for(String op:verydifficultoptions[q])
			{
				if(opNo == 3) System.out.println("\n");
				System.out.print(opNo+"]  "+op+"\t");
				opNo++;

			}
			
			
										
				

			System.out.println("\n Enter User Answer :- ");
			int userAnswer = new Scanner(System.in).nextInt();

			if(userAnswer == verydifficultanswer[q])
			{
				System.out.println(" Correct Answer : ");
				System.out.println(" U Won "+amount[q]);
				 winningAmount += amount[q];
				System.out.println(" Total amount "+(winningAmount));
			}
			else
			{
				System.out.println(" U Loose the Game ");
				System.out.println(" Total amount "+winningAmount);
				break;
			}

			System.out.println("____________________________________________________");
		}//end of for


	}//end of playGames


}//end class



