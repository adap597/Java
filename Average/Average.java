/* A program that accepts user input containing a name and three integers, 
then prints a table with a column of the names and integers and the average of the 3
integers to 2 decimal places*/

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
//open class
public class Average
{ 
	/*sets the format for how an integer should be displayed. 
	The integer will be displayed only to the 2nd digit after the decimal*/
	private static DecimalFormat df = new DecimalFormat("0.00");
	
	//open main
	public static void main(String args[])
	{
	//establishes the command line argument
	int ctr=Integer.parseInt(args[0]);
	
	/*creates arrays for names and numbers given by user. 
	The integer array has length of 3. 
	Creating the scanner class allows the program to get input from the user which is broken
	into tokens. Scanner class is used to read primitive data types like int */
	
	int a[][]=new int[ctr][3];
	String s[]=new String[ctr];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<ctr;i++)
		
		{	
		/*scanner utility reads the name from the String array, 
		then reads the integers stored in the int array starting with integer in position a[0] */
		s[i]=sc.next();
		a[i][0]=sc.nextInt();
		a[i][1]=sc.nextInt();
		a[i][2]=sc.nextInt();
		}
			for(int i=0;i<ctr;i++)
		{
		/*prints the name from the string array, followed by the integers from int array.
		Then the program averages the integers from each line by finding the sum of all 3, then dividing by 3 */
		System.out.print(s[i]+" ");
		System.out.print(a[i][0]+" ");
		System.out.print(a[i][1]+" ");
		System.out.print(a[i][2]+" ");
			double d=(a[i][0]+a[i][1]+a[i][2])/3.0;
		/*prints the names and integers followed by the average of the integers from each line
		The df.format means the average will be printed only to the 2nd digit after the decimal.*/
		System.out.println("average : " + df.format(d));
		}
	//close main
	}
//close class
}
