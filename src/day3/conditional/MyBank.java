package day3.conditional;

public class MyBank {
	public static void main(String[] args) {
		int myBalance = 5000;
		int withdraw = 70; // Entered amount should be multiples of 100

		int afterWithdraw = myBalance - withdraw;
		// 5000 - 2000 = 3000

		if (withdraw % 100 == 0) {
			if (afterWithdraw >= 0) {
				System.out.println("Withdraw successful!!!");
				System.out.println("Your current balance is: " + (afterWithdraw));
			} else {
				System.out.println("Insufficient balance!!!");
			}
		}else {
			System.out.println("Entered amount should be multiples of 100");
		}
	}
}
