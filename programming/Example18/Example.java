import static java.lang.System.*;
import java.util.*;



public class Example
{

	public static void linear_search( int arr[] ,int si, int key)
	{

		// declare starting index i=0
		int i =si;
		while ( i < arr.length)
		{
			if (arr[i] == key)
				out.println("Key: "+ key+ " @ index "+ i);
			i++;
			linear_search(arr , i , key);
			break;

		}
	}
	public static void main(String[] args)
	{
		int arr[] = {1,3,4,77,89,100, 89 };
		linear_search(arr,0 , 89);

	}
}



