package week1.day2;


public class FindIntersection {

	public static void main(String[] args) {
		
	
		int  a[] = {3,2,11,4,6,7};
		int b[] = {1,2,8,4,9,7};
		
		
		//nested loop
		// i for first array, j for sec array
		for(int i= 0;i<=a.length-1;i++) {
			//System.out.println("value of i"+ i);
			for(int j=0; j<=b.length-1;j++) {
					//System.out.println("value of j :"+j);
		if (a[i] == b[j])
			System.out.println(b[j]);
		
		
	}
	

	}
	}
}

		
		
		//2 arrays - int a[] = {3,2,11,4,6,7};
		//int b[] = {1,2,8,4,9,7}
		//declare for loop iterator for lenght -1
		//another for loop for second array len - 1
		//compare by using conditional statements == ,&&	}


