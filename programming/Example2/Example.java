import static java.lang.System.*;
import java.util.*;



public class Example
{
	public static void main(String[] args)
	{
		int y =0;
		Scanner sc = new Scanner(System.in);

		out.println("Enter first number ");
		int x = sc.nextInt();
		
		while (y == 0)
		{
			out.println("Enter second number ");
			y = sc.nextInt();
		}

		out.println("Enter an Operator");
		String op = sc.nextLine();

		if (op == "+")
		{
			out.println("Sum of two numbers: " +(x+y));
		}
		else if (op == "-")
		{
			out.println("Differnce of two numbers: " +(x-y));	
		}
		else if (op == "*")
		{
			out.println("Product of two numbers: " +(x+y));
		}
		else if (op == "/")
		{
			out.println("Division of two numbers: " +(x+y));
		}
		else
		{
			out.println("No such op");
		}


	}
}