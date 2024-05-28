import java.util.*;

class PrimeChecker implements Runnable
	{
		private int number;
		private int flag=0;
		
		PrimeChecker(int number)
		{
			this.number = number;
		}
		
		@Override 
		public void run()
		{
			for(int i=1; i<number; i++)
				{
					if(number%i==0)
						{
							flag++;
						}
				}
			if (flag<=1)
			{
				System.out.println(number + " is prime");
			}
			else
			{
				System.out.println(number + " is not prime");
			}
		}
	}
public class Isprime
{
	public static void main(String[] args)
		{
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter number to check:");
			int n= scn.nextInt();
			PrimeChecker number = new PrimeChecker(n) ;
			Thread thread = new Thread(number);
			thread.start();
		}
}
