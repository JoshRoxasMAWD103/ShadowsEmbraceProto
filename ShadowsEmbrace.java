import java.util.Random;
import java.util.Scanner;

public class Prototype
{
	public static void main(String[] args)
	{
		//Variables
		
		//Mostly Strings
   	Scanner s = new Scanner(System.in);
  	Random r = new Random();
   	String user;
   	String monsters[] = {"Ghoul", "Vampire", "Skeleton",};
   	int monsterRandomizer = r.nextInt(monsters.length);
    	String playerChoice;
    	
    	//Base Player Stats
  	int playerhp = 100;
    	int playerDmg = 50;
    	
    	//For heal (future purposes)
   	int healcount = 3;
  	final int healamount = 50;
    	
    	//Monster stats randomizers and arrays
   	int monsterHP[] = {25,30,35,40,45,50,};
  	int monsterDmg[] = {5,10,15,20,25,};
   	int monstercount = 10;
   		
  		{
  	    System.out.println("------------------------------------------------"); 
	    System.out.println("Welcome to Shadow's Embrace.");
	    System.out.print("Your adventure begins here. Please enter a name: ");
	    user = s.nextLine();
	    
	    /*CHOOSE:
	    System.out.println(user + ", Choose your weapon of choice:");
	    System.out.println("1.Sword");
	    System.out.println("2.Gun");
	    playerChoice = s.nextLine();
		
		if (playerChoice.equals("1"))
			{
				playerhp += 25;
				playerDmg -= 10;
			}
		else if (playerChoice.equals("2"))
			{
				playerhp -= 10;
				playerDmg += 25;
			}
		else
			{
				System.out.println("The number you chose is not in the choices!");
			}*/
			
  		}
  		{
		//START OF GAME
	   	System.out.println("------------------------------------------------");
		System.out.println(user + ", You are a man fighting for your love of your life!");
		System.out.println("You must rescue her in order for you to successfully finish this mission!");
		System.out.println("You only have " + healcount + " heals that can restore 50 HP");
		System.out.println("Never choose run or you will die");
		System.out.println("(Press ENTER to proceed.)");
		s.nextLine();
  		}
  		
		/*boolean running = true;
		
		GAME:
	    while (running)*/
	    
		{
			System.out.println("------------------------------------------------");
			/*int CurrentMonsterHP = r.nextInt(monsterHP.length);
			int CurrentMonsterDmg = r.nextInt(monsterDmg.length);*/
			
   			int CurrentMonsterHP = r.nextInt(monsterHP.length);
  			int CurrentMonsterDmg = r.nextInt(monsterDmg.length);
  			
			System.out.println("A " + monsters[monsterRandomizer] + " with " + monsterHP[CurrentMonsterHP] + " health and "
				+ monsterDmg[CurrentMonsterDmg] + " appeared! What do you want to do?");
			monstercount--;
		}
		System.out.println("hindi pa tapos");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
