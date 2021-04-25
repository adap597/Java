/* A program that draws a square using input from the use
 and determines the area and perimeter of the square*/
import stdlib.StdDraw;
import stdlib.StdIn;
//open class
public class Square {
	private String[] args;

	public Square() {
		double x0 = StdIn.readDouble(); //reads user input and assigns to variables for coordinates and length
        double y0 = StdIn.readDouble();
		double sideLength = StdIn.readDouble();
			System.out.println("Enter the upper-left coordinates and length of a square");
			System.out.print(x0);
			System.out.print(y0);
			System.out.print(sideLength);
	}
	
    Double sideLength; { //draws the square using *
    	for (Double x0 = (double) 0; x0< sideLength; x0++) { // if x0 is less than side length print *
    		for (Double y0 = (double) 0; y0< sideLength; y0++) {// if y0 is less than side length print *
    			System.out.print("*");
    		}
    		System.out.println(""); } //otherwise print a space
    	}

    Square(Double size ) {
        sideLength = size;
    }

    double getArea() {
        return sideLength * sideLength; // determines area by multiplying value of sideLength by sideLength
    }

    double getPerimeter() {
        return sideLength * 4;//determines perimeter by multiplying sideLength by 4
    }

    void drawSquare() {
    }

    public static void main(String[] args) {// main argument
        Square mySquare = new Square();
        double area = mySquare.getArea();
        double perimeter = mySquare.getPerimeter();
		//prints the area and perimiter of the square
        System.out.println("Area is " + area + " and perimeter is " + perimeter); 
     
    }//close main
}//close class



