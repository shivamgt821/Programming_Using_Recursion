import java.util.Scanner;

public class Fibonacci {
	static int fib(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		
		return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any digit : ");
		int n = scn.nextInt();
		System.out.println(fib(n));
	}

}
