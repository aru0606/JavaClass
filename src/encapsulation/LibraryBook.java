package encapsulation;

public class LibraryBook {

	private int bookId;
	private String title;
	private boolean available = true;

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getBookId() {
		return bookId;
	}

	public String getTitle() {
		return title;
	}

	public void issueBook() {
		if (available) {
			available = false;
			System.out.println("Book issued successfully.");
		} else {
			System.out.println("Book is not available.");
		}
	}

	public void returnBook() {
		available = true;
		System.out.println("Book returned successfully.");
	}

	public void isAvailable() {
		if (available) {
			System.out.println("Book Availability: Available");
		} else {
			System.out.println("Book Availability: Not Available");
		}
	}
}