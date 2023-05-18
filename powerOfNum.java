public class powerOfNum {
	
	static long pow(int x, int y) {
		if(y == 0) return 1;
		
		if(y%2 == 0) { /*return pow(x,y/2)*pow(x,y/2);*/
		long res = pow(x,y/2);
		return res*res;
		} else 
		return pow(x,y-1)*x;
	}

	public static void main(String[] args) {
		System.out.println(pow(5,2));
	}

}
