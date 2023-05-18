import java.util.Scanner;

public class Reverse_Natural_number {
	
	static void fun(int n) {
		if(n<1) return;
//		if(n==0)return;
		System.out.println(n);
		fun(n-1);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any value : ");
		int n = scn.nextInt();
		fun(n);
	}

}
