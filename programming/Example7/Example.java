import static java.lang.System.*;
import java.util.*;



public class Example
{
	public static void main(String[] args)
	{
		int x=123;
		int y=0;

		while (x > 0)
		{			
			if (x%10 == 0 )
				x /= 10;

			y += x%10;
			y *= 10;
			x = x - x%10;
			
		}
		out.println(y/10);



	}
}
