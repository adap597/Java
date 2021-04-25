/*A program that takes a 9-digit integer as a command-line argument, computes the checksum
and prints the ISBN number*/

public class ISBN {
//open class
    public static void main(String[] args) { 
	//open main
	
        // establish variable n. Parses string into an integer.
        int n = Integer.parseInt(args[0]);

        // establish variable to hold the sum and set initial value to zero
        int sum = 0;
		/*the last integer entered by user is multipled by 0,
		then the next digit is multiplied by 1 and so forth until it reaches the last input
		which is multiplied by 10. 
		Each product is added together to find sum*/
        for (int i = 2; i <= 10; i++) { //creates a loop that will repeat until i is <=10
            int digit = n % 10;              
            sum = sum + i * digit;			
            n = n / 10;
        }
     
        // print out check digit
        System.out.print("The ISBN number would be " + args[0]);
        if      (sum % 11 == 1) System.out.println("X"); //if remainder of sum divided by 11 is equal to 1 print X
        else if (sum % 11 == 0) System.out.println("0"); //if remainder of sum divided by 11 is equal to zero print 0
        else                    System.out.println(11 - (sum % 11)); //otherwise print result of sum remainder 11 minus 11
    }
	//close main
}
//close class
