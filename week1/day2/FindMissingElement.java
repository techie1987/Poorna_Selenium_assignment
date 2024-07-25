package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int a[] = {1, 4,3,2,8, 6, 7};
		//mising num is 5
		// total sum of array element = 1 to 8 = 31
		// range of array element form = 1 to 8 = 36

		int sum1 =0;
		int sum2 =0;
		//find missing element in array
		// sort array
		
		// iterate 0 to length 
		Arrays.sort(a);
		
		for(int i =0;i<a.length;i++) {
			sum1 = sum1+a[i];
				
		}
		
		System.out.println("The Sum of array is : "+ sum1);	
		
		for(int j=1;j<=8;j++) {
			sum2 = sum2 + j;
			
		}
		System.out.println("The range of array is :"+ sum2);
		
		System.out.println("The Missing number in array is :"+ (sum2-sum1));

	}

}
