import java.util.Scanner;

public class Q {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a input: ");
        int a = scanner.nextInt();

        // System.out.print("The size of the input must be 3");
        int b = scanner.nextInt();
        int i = 0;
	int c = b;

        float[] avg = new float[100];

        while (a != -1) 
	{	if (i<1)
            {
		avg[i] = (a + b) / 2.0f;
		i++;
		c=b;
	    }	
		else
	    {
		avg[i] = (a + c) / 2.0f;
                 i++;
		c = a;
	    }
            a = scanner.nextInt();
        }

        System.out.println("Moving Average :");
        for (int j = 0; j < i; j++) {
            System.out.printf("%.1f ", avg[j]);
        }
    }
}