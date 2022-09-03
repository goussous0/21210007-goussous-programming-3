import static java.lang.System.*;
import java.util.*;



public class Example
{
	public static void main(String[] args)
	{
		int x=0;
		int y=1;


		if (x ==0 && y ==0 )
			out.println("Origin");
		
		else if (x ==0 && y != 0)
			out.println("Y-axis");

		else if (y ==0 && x != 0)
			out.println("X-axis");

		else if ( x > 0 && y > 0)
			out.println("Q1");
		
		else if ( x < 0 && y > 0)
			out.println("Q2");

		else if ( x < 0 && y < 0)
			out.println("Q3");

		else if ( x > 0 && y < 0)
			out.println("Q4");



	}
}