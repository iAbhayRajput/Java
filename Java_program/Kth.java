import java.util.Scanner;
public class Kth
{
	public static void main(String args[])
		{
			int l=0;
			int n=0;
			System.out.println("Enter occurence of Kth Odd no:");
			Scanner sc= new Scanner(System.in);
			int k= sc.nextInt();
			System.out.println("Enter Input:");
			int i= sc.nextInt();
				while (i!=-1)
				{
					if (i%2==0)
						{
							n++;
						}
					else if(n==k)
						{
							l=i;
						}
					i= sc.nextInt();

				}
			System.out.println("Required Output is :"+l);
		}
}