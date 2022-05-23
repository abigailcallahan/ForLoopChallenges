import java.util.Scanner;

public class ForLoopChallenges
	{

		public static void main(String[] args)
			{
			challenge1();
			challenge2();
			challenge3();
			challenge4();
			challenge5();
			challenge6();
			extraChallenge();
			}
			
		public static void challenge1()
			{
			for(int i = 1; i <= 5; i++)
				{
					System.out.println("I love donuts!");
				}
			}
		
		public static void challenge2()
		{
			for(int i = 1; i <= 5; i++)
				{
					System.out.println(i);
				}
			for(int i = 5; i >= 1; i-= 1)
				{
					System.out.println(i);
				}
		}
		
		public static void challenge3()
		{
			for(int i = 5; i <= 100; i += 5)
				{
					System.out.println(i);
				}
		}
			
		public static void challenge4()
		{
			int sum = 0;
			for(int i = 5; i <= 100; i += 5)
				{
					sum = sum + i;
				}
			System.out.println("The sum of all multiples of 5 is : " + sum);
		}
		
		public static void challenge5()
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Give a range of numbers. First give me the lowest number of the range");
			int lowerAnswer = input.nextInt();
			System.out.println("Now give me the highest number of the range");
			int upperAnswer = input.nextInt();
			int rangeSum = 0;
			
			for(int i = lowerAnswer; i <= upperAnswer; i++)
				{
					rangeSum = rangeSum + i;
				}
			System.out.println("The sum of that range of numbers is: " + rangeSum);
		}
				
		public static void challenge6()
		{
			System.out.println("*********");
			for(int i = 1; i <= 7; i++)
				{
					
					System.out.println("*       *");
				}
			System.out.println("*********");
		}
		
		public static void extraChallenge()
		{
			int ninePlusOne = 9 + 1;
			int fortyNinePlusOne = 49 +1;
			
			for(int i = ninePlusOne; i <= fortyNinePlusOne; i += ninePlusOne)
				{
					System.out.println(i);
				}
			
			//create the following output
			//"dog"
			// and //
			System.out.println("\"dog\"");
			System.out.println("\\\\");
		}

	}
