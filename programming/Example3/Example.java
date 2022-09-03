import static java.lang.System.*;
import java.util.*;



public class Example
{
	public static void main(String[] args)
	{
		int a=100;
		int b=100;
		int c=98;


		if ( a >= b && b > c )
		{
			out.println(a);
		}
		else if ( a >= c && c > b)
		{
			out.println(a);
		}
		else if ( b >= a  && b > c)
		{
			out.println(b);
		}
		else if ( b >= c  && c > a )
		{
			out.println(b);
		}
		else if ( c >= a && c > b )
		{
			out.println(c);
		}
		else if ( c >= b && c > a  )
		{
			out.println(c);
		}

	}
}