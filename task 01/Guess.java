import java.util.*;

public class Guess
{
	public static void main(String args[])
	{
		int i=0,guess,ans;
		final int Max=100;
		Scanner sc=new Scanner(System.in);
		Random r1=new Random();
		Boolean v=false;
		ans=r1.nextInt(Max);
		while(!v && i<10)
		{
			i++;
			System.out.println("\nGuess the number Between 1 & 100: ");
			guess=sc.nextInt();
			if(guess<ans)
				System.out.println("Entered number is Smaller than actual number\nCount = "+i);
			else if(guess>ans)
				System.out.println("Entered number is Larger than actual number\nCount = "+i);
			else
			{
				System.out.println("Your Guess was correct which is "+guess+"!!!");
				v=true;
			}
			if(i==10)
				System.out.println("You have exceeded number of tries");
		}
	}
}