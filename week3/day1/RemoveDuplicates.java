package week3.day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Assignment Details:
		Remove the duplicate words from a String with the input:
		String text = “We learn Java basics as part of java sessions in java week1”;
		Expected output: “We learn Java basics as part of sessions in week1”
		 */
		String text ="We learn Java basics as part of java sessions in java week1";
		// Initialize a variable ‘count’ to keep track of the number of duplicate words found
		int count=0;
		//- Split the text into an array of words using space as the delimiter
		String[] array=text.split(" ");
		//- Create two nested for loops to compare each word with every other word in the String array.
		for(int i=0;i<=array.length-1;i++) {
			for(int j=i+1;j<=array.length-1;j++) {
				//- If a duplicate word is found, it is replaced with an empty string and the count is incremented.
				if(array[i].equalsIgnoreCase(array[j]))
 {
					array[j]=" ";
					count+=1;
				}
			}	
		}
		//After comparing all words, if the count is greater than 1 (indicating at least one duplicate was found), it prints
		//the modified words array where duplicates have been replaced with empty strings.
		if(count>=1) {
			for(int i=0;i<=array.length-1;i++) {
				System.out.print(array[i]+" ");
			}
		}
		
	}

}
