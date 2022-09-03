import static java.lang.System.*;
import java.util.*;



public class Example
{
	public static int factorial(int num)
	{
		int fac = 1;
		for (int i = num; i >0; i--)
		{
			fac *= i;
		}
		return fac;
	}
	
	public static void main(String[] args)
	{
		int array[]= new int[5];

		for (int i = 0 ; i < 5 ; i++)
		{
			out.println("Factorial of "+i+" is "+factorial(i));
		}



	}
}
