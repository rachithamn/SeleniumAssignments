package week3.day1;

import java.util.Arrays;

public class Duplicates {
	public static void main(String[] args) {
		int[] num= {2,5,7,7,5,9,2,3};
		//sort the array
		Arrays.sort(num);
		System.out.println("Duplicate elements are ");
		for(int i=0;i<num.length-1;i++){
			//compare with the next number, if it is same then print the  number
			if(num[i]==num[i+1]) {
				System.out.println(num[i]);
			}
			
			
		}
	}

}
