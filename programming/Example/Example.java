import static java.lang.System.*;


public class Example
{
	public static void main(String[] args)
	{
		out.println("hi there");
		int x= 15;
		int y= 20;

		out.println( (x)+ (y));

		x = x -y;
		y = x +y;
		x = y -x;

		out.println( (x)+ (y));
	}
}
