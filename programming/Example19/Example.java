import static java.lang.System.*;
import java.util.*;



public class Example
{

	public static void linear_search( int arr[] ,int si, int key)
	{
		if (si >= arr.length) 
			return;
		if ( arr[si] == key )
		{
			out.println("Key: "+key+" @ index "+si);
			linear_search(arr , si+1, key);
		}
		else		
			linear_search(arr , si+1, key);

	}
	public static void main(String[] args)
	{
		int arr[] = {1,3,4,77,89,100, 89 , 76 , 89 };
		linear_search(arr,0 , 89);

	}
}



