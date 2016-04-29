package modulus;

import java.util.Scanner;

public class QuizzerA
	{

		public static void main(String[] args)
			{
				Start();

			}
		public static void Start()
			{
				System.out.println("Hello, this a number quiz.");
				Scanner userInput = new Scanner(System.in);
				System.out.println("How many questions would you like to answer?");
				int userPick = userInput.nextInt();
				int counter = 0;
				for(int i = 0; i < userPick; i++)
				{
				int moduOne1 = (int)(Math.random()*userPick)+1;
				int moduTwo2 = (int)(Math.random()*userPick)+1;
				if(moduOne1 < moduTwo2)
					{
						moduOne1 += 10;
					}
				else if(i % 5 == 0)
					{
						moduOne1 = moduTwo2;
					}
				else if(i % 4 == 0)
					{
						moduTwo2 += 5;
					}
				System.out.println("What is " + moduOne1 + " % " + moduTwo2);
				int userAnswer = userInput.nextInt();
				if(userAnswer == moduOne1 % moduTwo2)
					{
						System.out.println("You got it.");
						counter++;
						System.out.println("Score: " + counter);
					}
				else
					{
						System.out.println("You got it wrong, the correct answer is " + moduOne1 % moduTwo2);
						System.out.println("Score: " + counter);
					}
				}
				System.out.println("Thanks for playing!!!");
				System.out.println(counter + " was your final score");
			}

	}
