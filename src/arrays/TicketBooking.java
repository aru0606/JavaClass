package arrays;

import java.util.Scanner;

public class TicketBooking {
	public static void main(String[] args) {
		int seats[][] = new int[5][6];
		int option;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(" " + seats[i][j]);
			}
			System.out.println();
		}

		System.out.println("Do you want to book a ticket?");
		System.out.println("Press 1 for yes  / Press 2 for No");
		option = scan.nextInt();

		if (option == 1) {
			System.out.println("Enter the row number:");
			int row = scan.nextInt();
			System.out.println("Enter the Seat number: ");
			int seatNo = scan.nextInt();

			if (seats[row][seatNo] == 0) {
				
				seats[row][seatNo] = 1;
				System.out.println("Your ticket booked successfully!!");

			}else {
				System.out.println("This ticket not available");
			}
		}

	}
}
