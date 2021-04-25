/*A program that computes the sum of natural numbers in a given range entered by the user*/

//open class
public class NumbersRangeSum
{
	//open main
	//create command line argument or main method
	public static void main(String[] args) 
	{
		/*creates integers a, b, and c with c being equal to the sum of natural numbers in 
		the range of a and b inclusive. The sum is calculated with the method getSum*/
		int a = Integer.parseInt(args[0]); 
		
		int b = Integer.parseInt(args[1]); 
		
		int c = getSum(a,b); 
		
		//prints the results of the calculation
		System.out.println("The sum of natural numbers in range ["+a+","+b+"] is "+ c); 
	}
	//creates method getSum and creates 2 variables, lower and upper int variables 
	public static int getSum(int lower, int upper) 
	{		
		//creates a statement that determines if the upper variable is equal to the lower variable   
		if (upper == lower) 
			//if true return lower variable
			return lower; 
		}
		else 
		{ //if not true, the upper variable is added to getSum method repeatedly
			return upper + getSum(lower, upper - 1); 
		}
	//close main
	}
//close class
}