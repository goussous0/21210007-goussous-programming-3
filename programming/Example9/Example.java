import static java.lang.System.*;
import java.util.*;



public class Example
{
	
	public static void main(String[] args)
	{

		int array[] = {6 , 9 ,7, 66, 32};
		int max=array[0] ;
		int min=array[0];
		for ( int num : array)
		{
			if (num > max)
				max = num;
			if (num < min)
				min = num;

		}
		out.println("Max: "+max);
		out.println("Min: "+min);


	}
}
