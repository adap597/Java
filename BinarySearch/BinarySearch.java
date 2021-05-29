/*A program that takes two command-line arguments, an input file that contains a sorted
integer array, and an integer to serach for in that array. If the search key is in the
array, it returns the largest intex i for which a[i] is equal to key, but otherwise
returns -i where i is the largest index such that a[i] is less than key */

public class BinarySearch
//open class
{
	public static int search(int key, int[] a) // method for calling recursive method
	{	
	return search(key, a, 0, a.length);
	}
	
	public static int search(int key, int[] a, int lo, int hi)
	{	// Recursive method for searching for key in a[lo, hi).
		
		int mid = lo + (hi - lo) / 2; // creates the variable mid
		
		if (mid == a.length) 	// case when key is greater than all values in array.
			return 1 - a.length;
		
		Integer midValue = Integer.valueOf(a[mid]);	// creates a temporary int variable, midValue, for comparing
		Integer keyValue = Integer.valueOf(key);	// creates a temporary int variable, keyValue, for comparing
		
		int cmp = midValue.compareTo(keyValue);		// compares midValue and keyValue
		
		if (mid >= hi)			// case for when key is within range
								// of stored values in array, but is not in array.
			return -(lo - 1);
		
		if (cmp == 0)			// case for when key is found in array.
								// continues to search to ensure the largest index is found.
		{			
			int y = search(key, a, mid + 1, hi);
			if (y < 0)
				return mid;
				else 
					return y;
				
		}	
		else					// case when comparing midValue and keyValue for when cmp != 0.
			if (cmp > 0)
				return search(key, a, lo, mid);	// reassigns the bounds of the search to search bottom half of search
				else
					return search(key, a, mid + 1, hi);	// reassigns the bounds of the search to search bottom top of search
	}
	
	public static void main(String[] args)
	//open main
	{	
		
	    int key = Integer.parseInt(args[1]); // creates variable key from command-line argument. 
		
		In in = new In(args[0]);			// inports txt file to be searched
		String s = in.readAll();			// reads the txt file and storages values in String s.
		String[] temp = s.split(" ");		// splits String s and stores in array temp.
		int[] a = new int[temp.length];		// creates new integer array to store values from string temp
		
		for (int i = 0; i < temp.length; i++)	// creates loop for converting string values to int values
		{
			int b = Integer.parseInt(temp[i]);	// converts string to int.
			a[i] = b;							// storges new int value in int a array.
			
		}
		
		int result = search(key, a);			// creates new variable, result, to store discovered index
		StdOut.println(result);					// prints result.
	}//close main
	
}//close class	
