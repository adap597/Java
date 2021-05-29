/* A program that takes an integer command line argument "n" and prints the nth string
from the first string found on standard input*/

public class LineNum 
//open class
{
	//open main
	public static void main(String[] args);
	{
		int n = Integer.parseInt(args[0]);	// creates int variable n and assigns it to command-line argument.

		Queue<String> queue = new Queue<String>();	// creates a queue 
		while (!StdIn.isEmpty())					// establishes loop to read user inputs
		{
			String item = StdIn.readString();		// Uses StdIn class to read string
			queue.enqueue(item);					// enqueue the read string value
		}
		
		String word = "";				// creates String variable word to be used for dequeueing
		for (int i = 0; i < n; i++)		// creates loop to dequeue to n word			
		{
			word = queue.dequeue();		// sets the dequeued value to equal word			
		}
		
		StdOut.print(n + " from the first is " + word); // prints the required word
	//close main
	}
//close class
}

