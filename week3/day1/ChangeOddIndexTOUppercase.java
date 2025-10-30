package week3.day1;

public class ChangeOddIndexTOUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**Assignment Details:
			Change the odd index of a given String to uppercase with the input : String test = “changeme”;

				**/
		String test = "changeme";
		//- Convert the given String to a character array.
		char[] array=test.toCharArray();
		for(int i=0;i<=array.length-1;i++) {
			//- Find the odd index within the loop
			if(i%2!=0) {
				//- Inside the loop, change the character to uppercase only if the index is odd
				 array[i] = Character.toUpperCase(array[i]);
			}
		}
		//- Print the characters with the expected output: cHaNgEmE
		System.out.println(array);
	}

}
