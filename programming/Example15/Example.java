import static java.lang.System.*;
import java.util.*;



public class Example
{


	public static void main(String[] args)
	{
		/*
		int number_of_days = 100;
		int years = number_of_days/365;
		int months = number_of_days/30;
		int days = number_of_days - months*30;
		out.println("Number of months: "+months);
		out.println("Number of days: "+days);
		out.println("Number of years "+years);
		*/


		int seconds = 20000;

		int mins = seconds/60;
		int hours= mins/60;
		int days = hours/24;
		int months = days/30;
		int years = months/12;

		out.println("Number of seconds: "+seconds);
		out.println("Number of mins: "+mins);
		out.println("Number of hours "+hours);
		out.println("Number of months: "+months);
		out.println("Number of days: "+days);
		out.println("Number of years "+years);



	}
}



