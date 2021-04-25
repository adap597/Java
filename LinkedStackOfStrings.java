/* A program that takes a string as an argument and returns true if the string 
argument is in the linked stack and false otherwise. Strings inputted by the user are 
stored on the stack. The program uses the method find() to search the stack.*/

 public class LinkedStackOfStrings
 //open class
{
    private Node first;    // creates private Node variable first

    // creates the Node class to be used in the program
    private class Node
    {
        private String item;	// creates private String variable item
		private Node next;		// creates private Node variable next
    }

    // checks to see is the stack is empty
    public boolean isEmpty() 
    {
        return first == null;
    }

    // takes an input, item, and adds it to the stack while pushing previous items further into the stack
    public void push(String item) 
    {
        Node oldfirst = first;// assigns first item to temp variable oldfirst
        first = new Node();// assigns a new node for the new first item
        first.item = item;//assigns new first item field 
        first.next = oldfirst;//assigns new first item's next fied to oldfirst
    }

    // pulls from the top of the stack and returns the string and then deletes it
    public String pop()
	{
        String item = first.item;      // save item to return
        first = first.next;            // delete first node
        return item;                   // return the saved item
    }

	// public method for calling on the private method
	public boolean find(String s) 
	{
		return find(s, first);//return the first item in String s
	}

	// private method for finding the command-line argument in String s
	private boolean find(String s, Node n)
	{
		if ( n == null)		// case for end of stack with string item not found
			return false;
		if ((n.item).equals(s))	// case for string item found
			return true;
		return find(s, n.next);	// string item not found in node, moves to next node
	}


    // main method for program to find argument
    public static void main(String[] args)
	{
		String s = args[0];		// Sets String s to equal command-line argument
        LinkedStackOfStrings stack = new LinkedStackOfStrings();	// Creates new object, LinkedStackOfStrings
        while (!StdIn.isEmpty())	// Creates loop for deleting a node or determining a bad input
		{
            String item = StdIn.readString();
            if (!item.equals("-"))     
				stack.push(item); 
            else 
				if (stack.isEmpty()) 
					StdOut.println("BAD INPUT"); 
				else                       
					StdOut.print(stack.pop());
        } 
		
		if (stack.find(s)) 	// case for finding argument in String s
			StdOut.print(s + " exists in the linked stack"); // prints argument found
		else				// case for not finding argument in String s
		StdOut.print(s + " does not exist in the linked stack"); // print argument not found
    } 
//close class
}

