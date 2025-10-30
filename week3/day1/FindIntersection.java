package week3.day1;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Assignment Details:
 		The assignment requires comparing two arrays and printing matching elements.
 		int a[]={3,2,11,4,6,7};
 		int b[]=for {1,2,8,4,9,7};

		 */
		int a[]={3,2,11,4,6,7};
		 int b[]={1,2,8,4,9,7};
		 // Declare for loop iterator from 0 to array length 
		 for(int i=0;i<=a.length-1;i++) {
			 // - Declare a nested for another array from 0 to array length
			 for(int j=0;j<=a.length-1;j++) {
				 //- Compare both the arrays using a conditional statement.
				 if(a[i]==b[j]) {
					 // Print the value from first array when there is a match
					 System.out.println(a[i]);
				 }
			 }
		 }

	}

}
