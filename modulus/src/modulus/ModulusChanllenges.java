package modulus;

import java.util.Scanner;

public class ModulusChanllenges
	{

		public static void main(String[] args)
			{
				report();
				leap();
				HardcodeArray();
				FizzPrint();

			}
		public static void report()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Type a number to see if your number is even or odd.");
			int num = userInput.nextInt();
			if(num % 2 == 0 )
				{
					System.out.println("You have an even number.");
				}
			else
				{
					System.out.println("You have an odd number.");
				}	
		}
		public static void leap()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Type a year to see if it is a leap year.");
			int num = userInput.nextInt();
			if(num % 4 == 0)
				{
					System.out.println("This is a leap year!!");
				}
			else
				{
					System.out.println("This is not a leap year!!");
				}
		}
		public static void HardcodeArray()
		{
			int [] num = {2, 5, -7, 1, 3, 12, 19, -16, 4, 20};
			for(int i = 0; i < num.length; i++)
				{
					if(i%3 == 0)
						{
							System.out.println(num[i]);
						}
					else
						{
							
						}
				}
		}
		public static void FizzPrint()
		{
			for(int i = 1; i <=100; i++)
				{
					if(i % 3 == 0 && i % 5 == 0)
						{
							System.out.println("FizzBuzz");
						}
					else if(i % 3 == 0)
						{
							System.out.println("Fizz");
						}
					else if(i % 5 == 0)
						{
							System.out.println("Buzz");
						}
					else
						{
							System.out.println(i);
						}
				}
		}

	}
