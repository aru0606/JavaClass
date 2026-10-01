package day6.dowhile;
import java.util.Scanner;
public class DoWhile {
	public static void main(String[] args) {
		int i=0;
		int n;
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("user input:");
			n=sc.nextInt();
			System.out.println(n>0);
		   
		}while(n<=0);		
	}
}
