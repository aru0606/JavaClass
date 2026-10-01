package day5.whileloop;

public class ReverseNumber {
	public static void main(String[] args) {
		//5672 % 10  - 2765
		int n = 5672;
		int rem;
		int rev = 0;
		while(n!=0) {
			rem = n%10;   //6
	//			=   (0 * 10)+2  = 2 
	//		rev = (2 * 10) +7
	//		    =  27 * 10 + 6
	//			=  2765
			
			rev = (rev*10)+rem;
			
			n = n/10;   //0
		}
		
		System.out.println("Reversed Number: "+rev);
	}
}
