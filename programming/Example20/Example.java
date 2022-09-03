import static java.lang.System.*;
import java.util.*;

public class Example
{
	/*
	public static int  binary_search( int arr[] , int key)
	{
		int sum = 0;
		int mid = arr.length/2;
		if ( arr[mid] == key)
			return mid;
		else if (arr[mid] < key )
		{
			int tmp[] = new int[arr.length - mid];
			for (int i=mid; i< arr.length; i++)
				tmp[i-mid] = arr[i];
			sum += binary_search(tmp, key);
		}
		else if (arr[mid] > key)
		{
			int tmp[] = new int[mid];
			for (int i =0; i < mid;i++)
				tmp[i] = arr[i];
			sum += binary_search(tmp, key);
		}
		return sum;
	}
	*/
	public static void binary_search2(int arr[], int start , int end , int key)
	{
		int mid = ((start + end) /2);
		if (start > arr.length || end > arr.length)
			return;
		if (arr[mid] == key)
			out.println("Key: " + " is @ index "+mid);
		else if (arr[mid] > key)
			binary_search2(arr, start, mid+1, key );
		else if (arr[mid] < key)
			binary_search2(arr, mid+1 , end, key);
	}
	public static void main(String[] args)
	{
		//int arr[] = {1,3,4,77,89,100, 89 , 76 , 89 };

		int arr[] = {1,2,3,4,5,6,11,22,66,100 ,150,170 ,200};
		binary_search2(arr, 0 , arr.length , 66);
	}
}



