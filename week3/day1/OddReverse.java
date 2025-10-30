package week3.day1;

public class OddReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		//split the string 
		String[] array1=test.split(" ");
		
		for(int i=0;i<=array1.length-1;i++) {
			//if the word is in the odd postion 
			if(i%2!=0) {
				//store the odd word in a variable
				String word=array1[i];
				//traverse through the odd word from the end
				for(int j=word.length()-1;j>=0;j--) {
					//print the chars
					System.out.print(word.charAt(j));
				}
				System.out.print(" ");
				}
			
			else {
				//print the even words as it is
				System.out.print(array1[i]+" ");
			}
		}

	}

}
