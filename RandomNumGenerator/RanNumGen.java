public class RanNumGen { 
    public static void main(String[] args) { 
	// Get the number of random numbers to be generated in n
        int n = Integer.parseInt(args[0]);
     // Declare variables to hold min, max values and an 	
	// auxiliary variable   
        int min = 100;
        int max = 0;
        int x;
     // set up a loop that iterates n times   
        for (int i=0;i<n;i++){
	// generate a random number
            x = (int)(Math.random() *100 + 1);
	// code for assigning min to min and max to max variable
            if (min > x)
                min = x;
            if (max < x)
                max = x;
	// print out a space after each random number
            System.out.print(x + " ");
        }
        System.out.println();
      // print stats
        System.out.println("The minimum value is " + min);
        System.out.println("The maximum value is " + max);
    }
}
