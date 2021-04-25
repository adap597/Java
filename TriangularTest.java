/*A program that tests if three integer values entered by the user as command line arguments
could be the sides of a triangle*/

//open class
public class TriangularTest
{
	//open main
	public static void main(String[] args) 
	{
		//creates integer variables a, b, and c 
		int a = Integer.parseInt(args[0]); 
		int b = Integer.parseInt(args[1]); 
		int c = Integer.parseInt(args[2]); 
		
		//creates boolean variable and sets it equal to IsTriangle method. 
		boolean result = IsTriangle(a, b, c);
		//if the if statement in the IsTriangle method returns true, then print "True"
		if (result == true) 
		{
			StdOut.println("True"); 
		}
		else //if the if statement in method IsTriangle returns false, then print "False"
		{
			StdOut.println("False"); 
		}
	}
	//creates IsTriangle method
	public static boolean IsTriangle(int a, int b, int c) 
	{
		//creates integers d, e, and f and sets them equal to the sum of variables(a, b, c) declared above.
		int d = c + a; // integer d = sum of int c and a
		int e = b + c; // integer e = sum of int b and c
		int f = a + b; // integer f = sum of int a and b
		//creates if statement to determine if sum of two variables is less than the last variable
		if ((d > b) && (e > a) && (f > c)) 
		{
			//if the sum of two variables is less than the last variable, return true
			return true; 
		}
		//if the above if statement is not true, return false
		else 
		{
			return false; 
		}
	//close main
	}
//close class
}
	