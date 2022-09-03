import static java.lang.System.*;
import java.util.*;



public class Example
{

	public static int linear_search( int arr[] , int key)
	{

		// declare starting index i=0
		int i =0;
		while ( i < arr.length)
		{
			if (arr[i] == key)
				return i;
			i++;
		}
		return -1;


	}
	public static void main(String[] args)
	{
		int arr[] = {1,3,4,77,89,100};
		out.println("Index "+ linear_search(arr, 89));

	}
}



