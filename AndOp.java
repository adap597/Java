public class AndOp { 
    public static void main(String[] args) { 
	// declare variables for holding the two input values
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
	// declare three auxiliary boolean variables and intialize 	// to false
        boolean temp1 = false;
        boolean temp2 = false;
        boolean isBetween = false;
        
	// check to see if first input is within range
        if (0 < a && a < 1.0) 
                temp1 = true;
	// check to see if second input is within range
        if (0 < b && b < 1.0) 
                temp2 = true;
	// compare the result of above two, if both true, then 
	// output is true
        if (temp1 && temp2)
           isBetween = true;
      // output the result    
        System.out.println(isBetween);
    }
}