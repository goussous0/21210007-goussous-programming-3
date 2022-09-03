import static java.lang.System.*;
import java.util.*;

public class Example
{
	public static double area (int x)
	{
		return x*x;
	}
	public static double area(int x , int y )
	{
		return x*y;
	}

	public static double area(int x, int y, int z)
	{
		return x*y*z;
	}


	public static double area(double x)
	{
		return 3.14*x*x;
	}

	public static void main(String[] args)
	{
		int x =9 , y=4 , z=8;
		double r = 2.13d;

		out.println(area(2, 5));
		out.println(area(1,2,3));
		out.println(area(r));
	}
}



