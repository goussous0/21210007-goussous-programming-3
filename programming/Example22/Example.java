import static java.lang.System.*;
import java.util.*;

public class Example
{
	public static double product(int x , int y )
	{
		return x*y;
	}

	public static double product(double x, double y)
	{
		return x*y;
	}


	public static double product(double x, int y)
	{
		return x*y;
	}

	public static double product(int x, double y)
	{
		return x*y;
	}

	public static int[] product(int arr[] , int arr2[])
	{
		int err[] = {-1};
		if (arr.length != arr2.length)
			return err;
		int tmp[] = new int[arr.length];
		for (int i=0; i < arr.length; i++)
		{
			tmp[i] = arr[i] * arr2[i];
		}
		return tmp;
	}



	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int arr2[] = {9,8,7,6,5,4,3,2,1};

		out.println(product(1,2));
		out.println(product(0.3, 0.5));
		out.println(product(1, 0.19));
		for (int num : product(arr, arr2))
			out.println(num);

	}
}



