import static java.lang.System.*;
import java.util.*;



public class Example
{
	public static int feb(int x)
	{
		int sum = 0;
		if (x ==0)
			sum += 0;
		else if (x ==1)
			sum += 1;
		else
			sum += feb(x-1) + feb(x-2);
		return sum;
	}
	public static void main(String[] args)
	{
		int x = 9;

		out.println("Feb : "+feb(x));
	}
}



