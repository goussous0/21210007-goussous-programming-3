import static java.lang.System.*;
import java.util.*;



public class Example
{


	public static void main(String[] args)
	{
		
		int marks[] = {56,67,78,95,78};
		int avg = 0;
		for (int num : marks)
			avg += num;
		out.println("Average: "+ avg/marks.length);



	}
}



