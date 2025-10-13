package week1.day2;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        int a = 0, b = 1;

        System.out.print("Fibonacci series up to " + range + " is: ");

        for (int i = 0; i < range; i++) {
        	System.out.print(a+" ");
        	int result=a+b;
        	a=b;
        	b=result;
		} 
      sc.close();
	}

}
