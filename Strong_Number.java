import java.util.Scanner;

public class Strong_Number {
	
	static int fact(int n) {
		
		if(n==0) return 1;
		
		return n*fact(n-1);
	}
	static int Strong(int n) {
		if(n==0) return 0;
		return fact(n%10) +Strong(n/10);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int n = scn.nextInt();
		if(n == Strong(n))System.out.println(n+" is an Strong number");
		else System.out.println(n+" is Not an Strong number");
	}

}
