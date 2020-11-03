import java.util.Scanner;
import java.util.Random;
public class ShadowsEmbrace 
{
	Scanner s = new Scanner(System.in);
	Random r = new Random();
	int chosenRole;
	String user;
	String playerWeapon;
	String role;
	int playerHP = 100;
	int userDamage = r.nextInt(50);
		
	
	public static void main(String[] args) 
	{
		
		ShadowsEmbrace game = new ShadowsEmbrace();
		game.playerSetup();
		game.onStart();
		
	
	}

	public void playerSetup() 
	{
		System.out.println("---------------------------------------------------------");
		System.out.println("\nWelcome to Shadows Embrace.");
		System.out.print("Please enter your name: ");
		user = s.nextLine();
		System.out.println();
		
		System.out.println("Please select a class: ");
		System.out.println("1. Tank (Additional 100 HP) ");
		System.out.println("2. Warrior (Additional Attack Percentage) ");
		System.out.println("3. Fighter (Balanced or Combination of Tank and Warrior) ");
		chosenRole = s.nextInt();
		
		if (chosenRole == 1)
		{
			playerHP = playerHP + 100;
			role = "Tank";
			System.out.println("Welcome to Shadows Embrace " + user + " your role is " + role + " you now have additional 100 HP!");
			System.out.println("Your current hp is " + playerHP);
			System.out.println();
		}
		
		if (chosenRole == 2)
		{
			userDamage = userDamage + 50;
			role = "Warrior";
			System.out.println("Welcome to Shadows Embrace " + user + " your role is " + role + " you now have increased damage.");
		}
		if (chosenRole == 3)
		{
			userDamage = userDamage + 25;
			playerHP = playerHP + 25;
			role = "Fighter";
			System.out.println("Welcome to Shadows Embrace " + user + " your role is " + role + " you now have additional HP and increased damage.");
		}	
	}
	
	
	
	public void onStart()
	{
		System.out.println("---------------------------------------------------------");
		System.out.println("\nWelcome " + user + ", Ah i see that you chose " + role + " Role. Very good Choice! Now lets begin.");
		System.out.println("You are a man fighting for your love of your life! You must rescue her in order for you to successfully finish this mission!");
		s.nextLine();
		
		System.out.println("But beware, It wont be as easy as it looks like. You may encounter demigod like creatures from the underworld so be careful!");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
