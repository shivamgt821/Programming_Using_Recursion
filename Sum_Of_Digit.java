import java.util.Scanner;

public class Sum_Of_Digit {
	
	static int sum(int n) {
		
		if(n==0) return 0;
		
//		return sum(n/10) + n%10;
		return n%10 + sum(n/10);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any value");
		int n = scn.nextInt();
		System.out.println(sum(n));
	}

}
