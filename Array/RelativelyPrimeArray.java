/*A progam that takes an integer command-line argument and creates an (n+1) by (n+1)
Boolean array "rpa" such that rpa[i][j] for i,j>0 is true if i and j are relatively prime
and false otherwise. If the indexes are equal it should print a single space. If the indexesare not 
equal then it should output a "T" character if the array element is true or an "F" if it is false.*/

public class RelativelyPrimeArray
{ //open Class
    public static void main(String[] args) 
    { //open main
        
        //Establishing Command Line Arguement 
        int n = Integer.parseInt(args[0]);
        
        //Creating the (n+1)-by-(n+1) Boolean array "rpa"
        boolean[][] rpa = new boolean [n+1][n+1];
        
        //Set all values  to true
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j ++)
            {
                rpa [i][j] = true;
            }
        }
                  
        //Determine if rows/columns are relatively prime
        for (int i = 2; i <= n; i++)
        {
                for (int j = 2; j <= n; j++) 
                {
                    for (int div = 2; div <= n; div++)
                    {
                        if (i % j == 0 || j % i == 0) 
                        {
                            rpa[i][j] = false;  
                        }
                        if ((i + j) % div == 0 && i % div == 0 && j % div == 0)
                        {
                        rpa[i][j] = false;  
                        }
                    }
                }
        }

        //Print first line in terminal 
        for (int i = 0; i <= 0; i++)
        {
            for(int j = 0; j <= n; j++)
            {
                if (i == j)
                    System.out.print("  ");
                else
                    System.out.print(j + " ");
            }
        }
        
        //Print Trace Array in terminal 
        for (int i = 1; i <= n; i++)
        { 
            for(int j = 0; j <= n; j++)
            {
           
                //prints space if equal, T if true and F if false
                if (i == j)
                    System.out.print("  ");
                else if (j == 0)
                    System.out.print("\n" + i + " ");
                else if  (rpa[i][j])
                    System.out.print("T ");
                else
                    System.out.print("F ");
                
            }         
        }
            
    }//close main
}//close class
