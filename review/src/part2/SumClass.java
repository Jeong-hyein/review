package part2;

public class SumClass {
	
	public static int total(int  ...arr) {
		int c = 0 ;
		for(int i = 0; i<arr.length; i++) {
			c += arr[i];
		}
		return c;
	}
	
	
	
}
