import java.util.ArrayList;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;
public class UFCfight
	{
		static ArrayList <Fighter> LockerRoom = new ArrayList<Fighter>();
		public static void main(String[] args)
			{
				Fighters();
				PickAFighter();
			}
		public static void Fighters()
		{
			LockerRoom.add(new Fighter ("Rampage Jackson", 205, "black", 76, 73, "standing", 130, 34, 56, 34, "strong"));
			LockerRoom.add(new Fighter ("Jon Jones", 220, "blue", 79, 76, "choke out", 240, 50, 23, 45, "average"));
			LockerRoom.add(new Fighter ("Conor McGregor", 170, "green", 74, 69, "striking", 150, 56, 34, 45, "strong"));
			LockerRoom.add(new Fighter ("Nate the Great Marquardt", 185, "black", 76, 72, "power", 120, 45, 20, 25, "weak"));
			LockerRoom.add(new Fighter ("Rashad Evans", 205, "yellow", 75, 72, "takedowns", 115, 34, 23, 67, "average"));
			LockerRoom.add(new Fighter ("Frank The Tank Abbott", 250, "red", 73, 69, "neck breaker", 200, 45, 56, 67, "strong"));
			
			for(int i = 0; i < LockerRoom.size(); i ++)
				{
					System.out.println("   ");
					System.out.println(LockerRoom.get(i).getName() + "     " + LockerRoom.get(i).getWeight() + "     " + LockerRoom.get(i).getShortcolor() + "     " + LockerRoom.get(i).getReach() + "     " + LockerRoom.get(i).getHeight() + "     " + LockerRoom.get(i).getStrength() + "     " + LockerRoom.get(i).getHealth() + "     " + LockerRoom.get(i).getDamage() + "     " + LockerRoom.get(i).getKick() + "     " + LockerRoom.get(i).getGround());}
					System.out.println("   ");
					System.out.println("   ");
				}
		public static void PickAFighter()
		{
			int hitpoints = 0;
			int randomFighter=(int)(Math.random()*6);
			int playerFighter = (0);
			String opponent = LockerRoom.get(randomFighter).getName();
			Scanner userInput = new Scanner(System.in);
			System.out.println("These are the controls: k to kick, d to damage, g to deal ground damage, s to use special strength");
			System.out.println("   ");
			System.out.println("Choose your fighter!!");
			String fighter = userInput.nextLine();
			if(fighter.equals("Rampage Jackson"))
				{
					playerFighter = 0;
				}
			if(fighter.equals("Jon Jones"))
				{
					playerFighter = 1;
				}
			if(fighter.equals("Conor McGregor"))
				{
					playerFighter = 2;
				}
			if(fighter.equals("Nate the Great Marguardt"))
				{
					playerFighter = 3;
				}
			if(fighter.equals("Rashad Evans"))
				{
					playerFighter = 4;
				}
			if(fighter.equals("Frank The Tank Abbott"))
				{
					playerFighter = 5;
				}
			System.out.println("You picked " + fighter +" you will fight " + opponent + " for your first fight.");
			System.out.println("   ");
			System.out.println("   ");
			System.out.println("ROUND 1");
			System.out.println("   ");
			System.out.println("   ");
			System.out.println(fighter + "         vs         " + opponent);
			String userFight = userInput.nextLine();
			for(int i = 0; i < LockerRoom.size(); i++)
			{
			if(userFight.equals("K") || userFight.equals("k"))
				{
					hitpoints -= LockerRoom.get(randomFighter).getKick();
					System.out.println(LockerRoom.get(i).getKick());
				}
			else if(userFight.equals("D") || userFight.equals("d"))
				{
					hitpoints -= LockerRoom.get(randomFighter).getDamage();
					System.out.println(LockerRoom.get(i).getDamage());
				}
			else if(userFight.equals("G") || userFight.equals("g"))
				{
					hitpoints -= LockerRoom.get(randomFighter).getGround();
					System.out.println(LockerRoom.get(i).getGround());
				}
			userInput.nextLine();
			int fighterHealth = LockerRoom.get(randomFighter).getHealth();
			int opponenetHealth = 0;
			System.out.println(fighter + "                   " + fighterHealth);
			}
			for(Fighter i : LockerRoom)
				{
					System.out.println("You Win!!!!");
				}
		}			
}
