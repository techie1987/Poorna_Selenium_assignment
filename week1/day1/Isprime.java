package week1.day1;

public class Isprime {
	public static boolean isPrimeNumber(int num) {
		//edge case
		// 2 is lowest primt number
		// 3 is next prime number
		//o, 1 is not prime and check quickly first
		
		if(num<=1) {
			return false;
		}
		
		for(int i =2; i< num;i++) {
			if(num%2 == 0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static  void getPrimeNumbers(int num) {
		for(int i=2;i<=num;i++) {
			if(isPrimeNumber(i))
				System.out.println(i + "");
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("2 is prime number " + isPrimeNumber(2));
	
		
	getPrimeNumbers(101);
			
	}
}
	
	
		
	
  

