/* A program that takes input from the user and calculates the Euclidean distance 
between two points(x1,y1,z1) & (x2,y2,z2)*/

public class Point
//open class
{
		// creates 3 private variables x,y and z of type double 
		private double x;
		private double y;
		private double z;
		
		//default constructor assigns values to the variables
		public Point (double x, double y, double z)
		{
			this.x = x;
			this.y = y;
			this.z = z;
		}
		
		// creates the method distanceto 
		public double distanceto(Point q)
		{
			// establishes the calculation for Euclidean distance
			//Euclidean distance is defined as square root of (x1-x2)^2 + (y1-y2)^2 + (z1-z2)^2
			return Math.sqrt((this.x - q.x) * (this.x - q.x) + (this.y - q.y) * (this.y - q.y) + (this.z - q.z) * (this.z - q.z));
		}
	
		// creates the method toString
		public String toString()
		{
			// formats that way the 3 coordinates will be displayed
			return "("+ x +","+ y +","+ z +")";
		}
	
		// creates the main method 
		public static void main(String[] args)
		{
			
			// creates variables for 2 points on a 3 dimensional plane
			double a = Double.parseDouble(args[0]);
			double b = Double.parseDouble(args[1]);
			double c = Double.parseDouble(args[2]);
			double d = Double.parseDouble(args[3]);
			double e = Double.parseDouble(args[4]);
			double f = Double.parseDouble(args[5]);
		
			// creates variables first and second by calling on the Point constructor
			Point first = new Point (a, b, c);
			Point second = new Point (d, e, f);
		
			// prints the first coordinate (x1,y1,z1)
			System.out.println("The first point is " + first);
			
			// prints the second coordinate (x2,y2,z2)
			System.out.println("The second point is " + second);
			
			// prints the Euclidean distance and formats the value displayed to the second digit after decimal point
			StdOut.printf("Their Euclidean distance is %.2f", first.distanceto(second));
		}
		//close main
}
//close class
