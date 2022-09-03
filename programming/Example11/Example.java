import static java.lang.System.*;


public class Example
{
	public static boolean is_prime(int num)
	{
		for (int i =2; i<num; i++)
		{
			if ( num%i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		if (is_prime(9) == true)
			out.println("Is prime");
		else
			out.println("not a prime");

	}
}
