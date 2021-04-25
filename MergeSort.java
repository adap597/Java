/* A program where ths user gives and unsorted list of words as command-line arguments
along with the starting and ending index of the subarray that should be sorted.
The program prints a list where the strings between the given indexes are sorted alphabetically. */

import java.util.Arrays;

public class MergeSort
{//open class
	public static void sort(String[] a, int lo, int hi)	// method used to call recursive method.
	{
		String[] aux = new String[a.length];			// creates in array, aux.
		sort(a, aux, lo, hi + 1);						// calls for sort method.
	}
	
	private static void sort(String[] a, String[] aux, int lo, int hi)
	{	// method used for sorting indexes commanded by the command-line argument.
		if (hi - lo <= 1) return;
		int mid = lo + ( hi - lo ) / 2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid, hi);
		int i = lo, j = mid;
		for (int k = lo; k < hi; k++)
			if	(i == mid)	
				aux[k] = a[j++];
			else 
				if	(j == hi)	
					aux[k] = a[i++];
				else 
					if (a[j].compareTo(a[i]) < 0)
						aux[k] = a[j++];
						else						
							aux[k] = a[i++];
		for (int k = lo; k < hi; k++)
			a[k] = aux[k];
	}
	
	public static String[] subArray(String[] a, int lo, int hi) // method for creating subArray.
	{
		String[] b = new String[(hi - lo) + 1];	// creates new string array b.
		for (int i = 0; i < b.length; i++)		// creates loop for taking required array a values
		{										// and placing them in array b.
			b[i] = a[lo + i];
		}
		return b;	// returns array b to main method.
	}

	
	public static void main(String[] args)	// main method used to read in argument and calling on other methods.
	{//open main
		int lo = Integer.parseInt(args[0]); 	// sets first argument to int lo.
		int hi = Integer.parseInt(args[1]);		// sets second argument to in hi.
		String[] a = subArray(args, 2, args.length - 1);	// creates String array a to equal subArray method.
		sort(a, lo, hi);						// calls on sort method for array a using lo value and hi value as the indexes.
		for (int i = 0; i < a.length; i++)		// creates the loop for printing
			StdOut.print(a[i] + " ");			// prints each element of array a.
		StdOut.println();
	}//close main

}//close class

