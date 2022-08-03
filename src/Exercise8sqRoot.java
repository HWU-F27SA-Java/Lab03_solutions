import java.util.Scanner;

public class Exercise8sqRoot {

	public static void main(String[] args) {
		
		   final double epsilon = 1.0E-20 ;
		    double N ;
		    double n 	= 1.00 ;

		    Scanner keyboard = new Scanner(System.in); 
		    System.out.print("Enter a real number :"); 
		    N = keyboard.nextDouble() ; 	
		    
		    long i=0;
		    while ( Math.abs( N/(n*n) - 1.0 ) > epsilon )
		    {
		       // calculate a new value for the guess
		       n =  N/(2*n) + n/2 ;
		       System.out.println((i++) + " : " + n ) ;

		    }

		    System.out.println("The square root of " + N + " is " + n ) ;
		    
		    keyboard.close();
	}

}
