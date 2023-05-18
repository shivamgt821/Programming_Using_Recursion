import java.util.Scanner;

public class Rev_Of_String {
	
	static String reverseString(String s,String r,int i) {
		if(i<0) return r;
		return reverseString(s,r+s.charAt(i),i-1);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String s = scn.next();
		System.out.println(reverseString(s,"",s.length()-1));
	}

}
