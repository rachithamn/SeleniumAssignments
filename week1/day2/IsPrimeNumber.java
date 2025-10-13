package week1.day2;
import java.util.Scanner;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number ");
		int n=sc.nextInt();
		boolean isPrime=true;
		if (n<=1) {
			isPrime=false;
		}
		else {
			for(int i=2;i<n;i++) {
				if (n%i==0) {
					isPrime=false;
					break;
				}
			}
		}
		if (isPrime) {
			System.out.println(n+ " is a prime number");
		}
		else {
			System.out.println(n+ " is not a prime number");
		}
		sc.close();

	}

}
