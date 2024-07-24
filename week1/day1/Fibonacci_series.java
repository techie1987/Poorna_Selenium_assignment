package week1.day1;

public class Fibonacci_series {

	public static void main(String[] args) {
		// always start with this hype of steps n logic then form prgm way
			// wat is fibonacciseries
		// 0 1   0+1 = 1
			//1  1  1+1 = 2
				// 1  2   1+2 =3
			//requirement of the programs
			// int a  , int b first n sec num , int c to store third number
		// print the fibonacci for  for first  8 numbers
		
		// 0 1 1 2 3 5 8 13
		// a b c 
		//	 a b c a becomes b value from prev
		
		int a = 0;
		int b = 1;
		int c;
		System.out.println(a);
		System.out.println(b);
		
		//c =a+b
		//6 values will be printed
		
		for(int i = 0; i<6; i++) {
			c = a+b;
			a =b;
			b = c;
			System.out.println("The fibonacci series: " + c);
			
		}
		
		
		
	}

}
