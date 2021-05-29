/*A program that takes integer command-line arguments. The first argument is the count of 
the remaining arguments that are between and 100 inclusive. It then prints out the count
of numbers that are less than or equal to 50 and the count of numbers that are greater than 50
from those remaining arguments.*/

//open class
public class Distribution100
{
	//open main
	public static void main(String args[])
	{
	//set command line argument
	int count=Integer.parseInt(args[0]);
		//create a new array to store the integers 
		int a[]=new int[count];
			/*creates a loop - when i is smaller than "count", perform another
			iteration of the loop. Once i reaches "count" the loop stops*/
			for(int i=0;i<count;i++)
				
		a[i]=Integer.parseInt(args[i+1]);
		int ctr1=0,ctr2=0,temp;
			for(int i=0;i<count;i++)
		{
		//local variable so the loop body can use the array element from array 
		temp=a[i];
			for(int j=i+1;j<count;j++)
				if(a[j]==temp)
				a[j]=-1;
		}
			for(int i=0;i<count;i++)
		{
		/*Compares 2 expressions. If integer is less than or equal to 50 or greater than zero.
		If both expressions are true, then the program prints the number of integers less than or 
		equal to 50 using the System.out.println instructions below. If integer is greater than 50 and
		less than or equal to 100, the program prints the number of integers that satisfy the both expressions
		using the System.out.println instructions below*/
			if(a[i]<=50 && a[i]>0)
				ctr1++;
			else if(a[i]>50 && a[i]<=100)
				ctr2++;

		}	
		//Prints output based on above && operators. 
		System.out.println(ctr1+" numbers entered are less than or equal to 50");
		System.out.println(ctr2+" numbers entered are greater than 50");
	//close main
	}
//close class
}
