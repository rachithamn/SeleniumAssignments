package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyname="Testleaf";
		char[] chararray=companyname.toCharArray();
		for(int i=chararray.length-1;i>=0;i--) {
			System.out.print(chararray[i]);
		}

	}

}
