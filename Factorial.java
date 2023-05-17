import java.util.Scanner;

public class Factorial {
	
	static int fact(int n) {
		
		if(n==0) return 1;
		
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any digit to find its factorial :");
		int n = scn.nextInt();
		System.out.println("Factorial of given number is = "+fact(n));
	}

}
