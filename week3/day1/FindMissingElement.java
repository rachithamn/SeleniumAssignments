package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Find the missing element in the given array
		Input -> {1, 4,3,2,8, 6, 7};
		Output -> 5 
		 * */
		int[] arr={1,4,3,2,8,6,7};
		//Sort the array
		Arrays.sort(arr);
		// Loop through the array (start i from arr[0] till the length of the array)
		for(int i=0;i<=arr.length-1;i++) {
			//Check if the iterator variable is not equal to the array values respectively
			if(arr[i+1]!=arr[i]+1) {
				//Print the number
				System.out.println(arr[i]+1);
				//Once printed break the iteration
				break;
			}
		}
		 

	}

}
