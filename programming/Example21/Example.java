import static java.lang.System.*;
import java.util.*;

public class Example
{
	public static void bubble_sort(int arr[])
	{
		for ( int i =0; i < arr.length; i++)
		{
			for (int j=i; j< arr.length; j++)
			{
				if (arr[i] > arr[j])
				{
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int arr[] = {1,3,4,77,89,100, 89 , 76 , 89 };
		//int arr[] = {1,2,3,4,5,6,11,22,66,100 ,150,170 ,200};
		bubble_sort(arr);
		for (int num : arr)
		{
			out.println(num);
		}

	}
}



